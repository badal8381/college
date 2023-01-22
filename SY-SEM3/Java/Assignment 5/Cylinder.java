interface Operation{
	double area(float radius, float height);
	double volume(float radius, float height);
	float PI = 3.142f;
}

public class Cylinder implements Operation{
	float radius;
	float height;

	Cylinder(){
		radius = 0.0f;
		height = 0.0f;
	}
	
	Cylinder(float radius, float height){
		this.radius = radius;
		this.height = height;
	}

	public double area(float radius, float height){
		return (2*PI*radius*height);
	}
	public double volume(float radius, float height){
		return (PI*radius*radius*height);
	}
}
