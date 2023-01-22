/**
 * Circle
 * 
 *	@author Badal
 *	@version 1.0
 */

public class Circle{
	public float radius;
	public float area;

	Circle(){
		radius = 0.0f;
	}
/**
 * Circle
 * 
 *	@param radius Area of Circle
 */
	Circle(float radius){
		this.radius = radius;
	}

/**
 * Circle
 *	@return Area of Circle
 */
	public double calculateArea(){
		return (2*3.14*radius*radius);	
	}
}
