Assignment 1: Assignment on JavaScript 
1) Write a program to create an array with const and another array with let. Change the values 
in the array created with let and explain why you cannot change the array created with const. 
2) Create a small arrow function that takes two numbers and adds them together. 
3) Use template literals to create a sentence like "My name is [name], I am [age] years old." Use 
variables to store name and age. 
4) Given an object person = { name: 'John', age: 30 }, use destructuring to get name and age 
from the object into separate variables. 
5) Use the spread syntax to join two arrays of numbers into one bigger array. 
6) Create a Car class with make, model, and year as properties. Add a function inside the class 
to show the car's details. 
7) Use a symbol to make a unique id property in an object and try to use it.







1. const vs let with arrays
javascript
Copy
Edit
const arrConst = [1, 2, 3];
let arrLet = [4, 5, 6];

arrLet[0] = 10;  // ✅ You can change values in a let array
console.log(arrLet);  // [10, 5, 6]

// arrConst = [7, 8, 9]; ❌ Error: Assignment to constant variable

// ❗ But you can still modify values in const array:
arrConst[0] = 99;  // ✅
console.log(arrConst);  // [99, 2, 3]

// 👉 You can't reassign a const variable, but you can change its contents if it's an object/array









2. Arrow function to add two numbers
javascript
Copy
Edit
const add = (a, b) => a + b;
console.log(add(3, 4));  // 7







3. Template literals with variables
javascript
Copy
Edit
let name = "Alice";
let age = 25;
console.log(`My name is ${name}, I am ${age} years old.`);










4. Destructuring an object
javascript
Copy
Edit
const person = { name: 'John', age: 30 };
const { name, age } = person;
console.log(name); // John
console.log(age);  // 30












5. Spread syntax to merge arrays
javascript
Copy
Edit
const nums1 = [1, 2];
const nums2 = [3, 4];
const combined = [...nums1, ...nums2];
console.log(combined);  // [1, 2, 3, 4]







6. Car class with details method
javascript
Copy
Edit
class Car {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  showDetails() {
    console.log(`${this.make} ${this.model} (${this.year})`);
  }
}

const myCar = new Car("Toyota", "Corolla", 2020);
myCar.showDetails();  // Toyota Corolla (2020)












7. Symbol as a unique id
javascript
Copy
Edit
const uniqueId = Symbol('id');
const user = {
  name: 'Sam',
  [uniqueId]: 101
};

console.log(user[uniqueId]);  // 101
console.log(user);  // Symbol won't show in for...in or 






















Assignment 2: Assignment on Asynchronous JavaScript 
1) Write a function that takes two numbers and returns their sum, ensuring the function is a pure 
function (i.e., no side effects). 
2) Create a higher-order function that takes a function and an array as inputs, and applies the 
function to each element of the array. 
3) Write a curried function that multiplies three numbers. The function should be curried such 
that you can call it one number at a time. 
4) Create a function that takes an array and an element and returns a new array with the element 
added, ensuring the original array is not mutated. 
5) Write a function that returns a promise that resolves with a string "Success" after 1 second. 
6) Create an asynchronous function that fetches data from a mock API (simulated using 
setTimeout), and logs the result once it's fetched. 
7) Write a function that takes a number and a callback function, applies the callback to the 
number, and returns the result. 
8) Write a generator function that yields the first 3 numbers of the Fibonacci sequence. 
9) Create a Car class with properties make, model, and year, and a method displayInfo() that 
returns the car's information. 
10) Create a Shape class with a method area(), and extend it into a Rectangle class that overrides 
the area() method to calculate the area of a rectangle.










1. Pure function to sum two numbers
javascript
Copy
Edit
function sum(a, b) {
  return a + b; // No side effects, just returns result
}
console.log(sum(2, 3)); // 5







2. Higher-order function
javascript
Copy
Edit
function applyToEach(fn, arr) {
  return arr.map(fn);
}
console.log(applyToEach(x => x * 2, [1, 2, 3])); // [2, 4, 6]








3. Curried multiplication function
javascript
Copy
Edit
const multiply = a => b => c => a * b * c;
console.log(multiply(2)(3)(4)); // 24











4. Add element without mutating original array
javascript
Copy
Edit
function addElement(arr, element) {
  return [...arr, element];
}
const original = [1, 2];
const newArray = addElement(original, 3);
console.log(original); // [1, 2]
console.log(newArray); // [1, 2, 3]











5. Promise that resolves after 1 second
javascript
Copy
Edit
function getPromise() {
  return new Promise(resolve => {
    setTimeout(() => resolve("Success"), 1000);
  });
}

getPromise().then(console.log); // After 1 sec: Success












6. Async function using setTimeout
javascript
Copy
Edit
async function fetchData() {
  const data = await new Promise(resolve => {
    setTimeout(() => resolve("Mock data from API"), 1000);
  });
  console.log(data);
}
fetchData();

















7. Function with callback
javascript
Copy
Edit
function applyCallback(num, callback) {
  return callback(num);
}
console.log(applyCallback(5, x => x * 10)); // 50











8. Generator for first 3 Fibonacci numbers
javascript
Copy
Edit
function* fib() {
  let a = 0, b = 1;
  yield a;
  yield b;
  yield a + b;
}
const gen = fib();
console.log(gen.next().value); // 0
console.log(gen.next().value); // 1
console.log(gen.next().value); // 1










9. Car class with displayInfo()
javascript
Copy
Edit
class Car {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  displayInfo() {
    return `${this.make} ${this.model} (${this.year})`;
  }
}
const myCar = new Car("Honda", "Civic", 2022);
console.log(myCar.displayInfo()); // Honda Civic (2022)














10. Shape and Rectangle with area()
javascript
Copy
Edit
class Shape {
  area() {
    return 0;
  }
}

class Rectangle extends Shape {
  constructor(width, height) {
    super();
    this.width = width;
    this.height = height;
  }

  area() {
    return this.width * this.height;
  }
}
const rect = new Rectangle(4, 5);
console.log(rect.area()); // 20





















Assignment 3: Assignment on Typescript. 
1)  Write a TypeScript program that declares a variable `name` and assigns it a string value. 
Also declare a variable `age` and assign it a number value. Finally print the values of name 
and age. 
2)  Write a TypeScript program that declares variables using let, const, and var. Then, describe 
how each declaration type behaves with respect to scoping and mutability. 
3)  Write a TypeScript function that takes an array of numbers and returns only the even 
numbers. 
4)  Write a TypeScript program that demonstrates the use of a union type where a variable can 
hold either a string or a number. 
5)  Create an enum in TypeScript to represent different user roles (Admin, Editor, Viewer). 
and use this function in another file. 
Write a function that takes a role and prints a message based on the role. 
6) . Create a TypeScript module that exports a function to calculate the area of a circle. Import 
7) Create a generic class Storage that can store and retrieve data of any type. Demonstrate its 
usage with number and string. 
8) Write a TypeScript function that demonstrates the use of unknown type and safely performs 
operations using type assertions. 
9) Write a TypeScript function that takes a generic array and returns the first element of the 
array.








1. Declare name and age and print
ts
Copy
Edit
let name: string = "Alice";
let age: number = 25;

console.log(`Name: ${name}, Age: ${age}`);






2. let, const, and var – usage and behavior
ts
Copy
Edit
let a = 10;       // block scoped, mutable
const b = 20;     // block scoped, immutable (can't reassign)
var c = 30;       // function scoped, mutable

if (true) {
  let a = 100;
  const b = 200;
  var c = 300;
  console.log(a, b, c); // 100, 200, 300
}

console.log(a); // 10
console.log(b); // 20
console.log(c); // 300 ❗ var leaks out of block











3. Function to return even numbers
ts
Copy
Edit
function getEvenNumbers(arr: number[]): number[] {
  return arr.filter(n => n % 2 === 0);
}

console.log(getEvenNumbers([1, 2, 3, 4, 5])); // [2, 4]










4. Union type example
ts
Copy
Edit
let value: string | number;

value = "Hello";
console.log(value); // Hello

value = 123;
console.log(value); // 123












5. Enum and role-based message
ts
Copy
Edit
// roles.ts
export enum Role {
  Admin,
  Editor,
  Viewer
}

export function printRoleMessage(role: Role) {
  switch (role) {
    case Role.Admin:
      console.log("You have full access.");
      break;
    case Role.Editor:
      console.log("You can edit content.");
      break;
    case Role.Viewer:
      console.log("You can view content.");
      break;
  }
}
ts
Copy
Edit
// main.ts
import { Role, printRoleMessage } from './roles';

printRoleMessage(Role.Editor); // You can edit content.











6. Circle area module
ts
Copy
Edit
// circle.ts
export function areaOfCircle(radius: number): number {
  return Math.PI * radius * radius;
}
ts
Copy
Edit
// main.ts
import { areaOfCircle } from './circle';

console.log(areaOfCircle(5)); // 78.5398...













7. Generic class Storage
ts
Copy
Edit
class Storage<T> {
  private data: T;

  constructor(value: T) {
    this.data = value;
  }

  get(): T {
    return this.data;
  }

  set(value: T) {
    this.data = value;
  }
}

const numberStorage = new Storage<number>(123);
console.log(numberStorage.get());

const stringStorage = new Storage<string>("Hello");
console.log(stringStorage.get());















8. unknown type with assertions
ts
Copy
Edit
function handleUnknown(input: unknown) {
  if (typeof input === 'string') {
    console.log((input as string).toUpperCase());
  } else if (typeof input === 'number') {
    console.log((input as number).toFixed(2));
  } else {
    console.log("Unknown type");
  }
}

handleUnknown("test");  // TEST
handleUnknown(42.567);  // 42.57











9. Generic function to get first element
ts
Copy
Edit
function getFirst<T>(arr: T[]): T | undefined {
  return arr[0];
}

console.log(getFirst<number>([10, 20, 30])); // 10
console.log(getFirst<string>(["a", "b"]));   // a















Assignment 4: Assignment on Node.js 
 
1) On Modules  
Create a new module file named math.js that exports two functions: add and subtract. 
Implement each function to perform addition and subtraction of two numbers, 
respectively. Create a new file named app.js and import the math module. Use the add 
and subtract functions to perform arithmetic operations and display the results in the 
console 
2) On Callbacks 
Write an asynchronous function named delayedMessage that takes a callback function as 
an argument. Inside the function, use setTimeout to delay execution for two seconds, 
then invoke the callback function with the message "Delayed message". Call the 
delayedMessage function and provide a callback function to handle the delayed 
message. Display the received message in the console. 
3) On Event Handling 
Create an EventEmitter instance and define an event named greet. 
Implement a listener for the greet event that prints "Hello, Event!" to the console. 
Emit the greet event and observe the output in the console. 
 
4) On Streams and Buffers 
Create a readable stream to read data from a text file named data.txt using the fs module. 
Implement event listeners for the data and end events of the stream. Display the received 
data and a message indicating the end of the stream in the console. 
5) On WebSockets 
Create a WebSocket server using the ws module. Define a callback function to handle 
client connections and implement event listeners for message reception and 
disconnection. Create a WebSocket client to connect to the server and send a message. 
Provide the code for establishing the connection and sending a message. Verify the 
communication between the WebSocket server and client by observing the messages 
exchanged in the console.









1. Modules
math.js

js
Copy
Edit
function add(a, b) {
  return a + b;
}

function subtract(a, b) {
  return a - b;
}

module.exports = { add, subtract };
app.js

js
Copy
Edit
const math = require('./math');

console.log("Add:", math.add(5, 3));         // Add: 8
console.log("Subtract:", math.subtract(5, 3)); // Subtract: 2















2. Callbacks
js
Copy
Edit
function delayedMessage(callback) {
  setTimeout(() => {
    callback("Delayed message");
  }, 2000);
}

delayedMessage((msg) => {
  console.log(msg); // Output after 2s: Delayed message
});
















3. Event Handling
js
Copy
Edit
const EventEmitter = require('events');
const emitter = new EventEmitter();

emitter.on('greet', () => {
  console.log("Hello, Event!");
});

emitter.emit('greet'); // Output: Hello, Event!

















4. Streams and Buffers
Create a file data.txt with some content first.

js
Copy
Edit
// data.txt content example: Hello from file!

const fs = require('fs');

const readStream = fs.createReadStream('data.txt', 'utf8');

readStream.on('data', (chunk) => {
  console.log("Received chunk:", chunk);
});

readStream.on('end', () => {
  console.log("End of stream.");
});


























5. WebSockets (using ws package)
Install ws first:

bash
Copy
Edit
npm install ws
server.js

js
Copy
Edit
const WebSocket = require('ws');
const wss = new WebSocket.Server({ port: 8080 });

wss.on('connection', function connection(ws) {
  console.log("Client connected");

  ws.on('message', function incoming(message) {
    console.log("Received:", message);
  });

  ws.on('close', () => {
    console.log("Client disconnected");
  });

  ws.send("Hello from server");
});





client.js

js
Copy
Edit
const WebSocket = require('ws');
const ws = new WebSocket('ws://localhost:8080');

ws.on('open', function open() {
  console.log("Connected to server");
  ws.send("Hello from client");
});

ws.on('message', function message(data) {
  console.log("Received from server:", data);
});
