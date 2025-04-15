import { useState } from 'react';

export default function Calculator() {
  const [display, setDisplay] = useState('0');
  const [operator, setOperator] = useState(null);
  const [firstValue, setFirstValue] = useState(null);
  const [waitingForSecondValue, setWaitingForSecondValue] = useState(false);

  const handleNumberClick = (number) => {
    if (waitingForSecondValue) {
      setDisplay(number);
      setWaitingForSecondValue(false);
    } else {
      setDisplay(display === '0' ? number : display + number);
    }
  };

  const handleOperatorClick = (op) => {
    if (firstValue === null) {
      setFirstValue(parseFloat(display));
    } else if (!waitingForSecondValue) {
      const secondValue = parseFloat(display);
      const result = calculate(firstValue, secondValue, operator);
      setDisplay(String(result));
      setFirstValue(result);
    }
    setWaitingForSecondValue(true);
    setOperator(op);
  };

  const calculate = (first, second, op) => {
    switch (op) {
      case '+': return first + second;
      case '-': return first - second;
      case '×': return first * second;
      case '÷': return first / second;
      case '%': return first % second;
      default: return second;
    }
  };

  const handleEquals = () => {
    if (operator && firstValue !== null) {
      const secondValue = parseFloat(display);
      const result = calculate(firstValue, secondValue, operator);
      setDisplay(String(result));
      setFirstValue(null);
      setOperator(null);
      setWaitingForSecondValue(false);
    }
  };

  const handleClear = () => {
    setDisplay('0');
    setOperator(null);
    setFirstValue(null);
    setWaitingForSecondValue(false);
  };

  const handleBackspace = () => {
    if (display.length > 1) {
      setDisplay(display.slice(0, -1));
    } else {
      setDisplay('0');
    }
  };

  // Calculator button component
  const Button = ({ children, onClick, className = '' }) => (
    <button 
      onClick={onClick}
      className={`flex items-center justify-center p-4 text-lg font-medium transition-colors ${className}`}
    >
      {children}
    </button>
  );

  return (
    <div className="flex flex-col max-w-xs mx-auto overflow-hidden rounded-lg shadow-lg bg-gray-800">
      {/* Display */}
      <div className="flex justify-end items-center p-6 h-24 bg-gray-900 text-white">
        <div className="text-4xl font-light">{display}</div>
      </div>
      
      {/* Keypad */}
      <div className="grid grid-cols-4">
        {/* First row */}
        <Button onClick={handleClear} className="bg-gray-700 text-gray-300 hover:bg-gray-600">C</Button>
        <Button onClick={() => handleOperatorClick('%')} className="bg-gray-700 text-gray-300 hover:bg-gray-600">%</Button>
        <Button onClick={() => handleOperatorClick('÷')} className="bg-gray-700 text-gray-300 hover:bg-gray-600">÷</Button>
        <Button onClick={() => handleOperatorClick('×')} className="bg-orange-500 text-white hover:bg-orange-400">×</Button>
        
        {/* Number pad and operations */}
        <Button onClick={() => handleNumberClick('7')} className="bg-gray-200 hover:bg-gray-100">7</Button>
        <Button onClick={() => handleNumberClick('8')} className="bg-gray-200 hover:bg-gray-100">8</Button>
        <Button onClick={() => handleNumberClick('9')} className="bg-gray-200 hover:bg-gray-100">9</Button>
        <Button onClick={() => handleOperatorClick('-')} className="bg-orange-500 text-white hover:bg-orange-400">-</Button>
        
        <Button onClick={() => handleNumberClick('4')} className="bg-gray-200 hover:bg-gray-100">4</Button>
        <Button onClick={() => handleNumberClick('5')} className="bg-gray-200 hover:bg-gray-100">5</Button>
        <Button onClick={() => handleNumberClick('6')} className="bg-gray-200 hover:bg-gray-100">6</Button>
        <Button onClick={() => handleOperatorClick('+')} className="bg-orange-500 text-white hover:bg-orange-400">+</Button>
        
        <Button onClick={() => handleNumberClick('1')} className="bg-gray-200 hover:bg-gray-100">1</Button>
        <Button onClick={() => handleNumberClick('2')} className="bg-gray-200 hover:bg-gray-100">2</Button>
        <Button onClick={() => handleNumberClick('3')} className="bg-gray-200 hover:bg-gray-100">3</Button>
        <Button onClick={handleEquals} className="bg-orange-500 text-white hover:bg-orange-400 row-span-2">
          =
        </Button>
        
        {/* Last row */}
        <Button onClick={() => handleNumberClick('0')} className="bg-gray-200 hover:bg-gray-100 col-span-2">0</Button>
        <Button onClick={handleBackspace} className="bg-gray-200 hover:bg-gray-100">
          ←
        </Button>
      </div>
    </div>
  );
}
