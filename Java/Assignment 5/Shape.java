abstract class Shape{
	abstract double calculateArea();
	abstract double calculateCircumference();
}

class Triangle extends Shape{
	private float area;
	private float height;
	private float base;

	Triangle(){
		area = 0.0f;
		height = 0.0f;
		base = 0.0f;
	}
	
	Triangle(float height, float base){
		this.height = height;
		this.base = base;
	}

	void setHeight(float height){
		this.height = height;
	}

	float getHeight(){
		return height;
	}
	
	void setBase(float base){
		this.base = base;
	}

	float getBase(){
		return base;
	}

	double calculateArea(){
		area = (1/2)*base*height;
		return area;
	}	
	double calculateCircumference(){
		return 3*base;
	}
}

class Rectangle extends Shape{
	private double area;
	private float length;
	private float width;
	
	Rectangle(){
		area = 0.0f;
		length = 0.0f;
		width = 0.0f;
	}
	
	Rectangle(float length, float width){
		this.length = length;
		this.width = width;
	}
	void setLength(float length){
		this.length = length;
	}

	float getLength(){
		return length;
	}
	
	void setWidth(float width){
		this.width = width;
	}

	float getWidth(){
		return width;
	}

	double calculateArea(){
		area = length*width;
		return area;
	}	
	double calculateCircumference(){
		return (2*(length+width));
	}
}

class Circle extends Shape{
	private double area;
	private float radius;

	Circle(){
		area = 0.0f;
		radius = 0.0f;
	}

	Circle(float radius){
		area = 0.0f;
		this.radius = radius;
	}

	void setRadius(float radius){
		this.radius = radius;
	}

	float getRadius(){
		return radius;
	}

	double calculateArea(){
		area = 3.14*radius*radius;
		return area;
	}

	double calculateCircumference(){
		return (2*3.14*radius);
	}
}
