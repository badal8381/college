#include <stdio.h>

float find_diameter(float radius);
float find_area(float radius);
float find_circumference(float radius);

int main(){
	float n;
	printf("Enter radius: ");
	scanf("%f", &n);

	printf("Diameter of Circle is %f\n", find_diameter(n));	
	printf("Area of Circle is %f\n", find_area(n));	
	printf("Circumference of Circle is %f\n", find_circumference(n));	
	return 0;
}

float find_diameter(float radius){
	return 2*radius;
}

float find_area(float radius){
	return 3.14*radius*radius;
}

float find_circumference(float radius){
	return 2*3.14*radius;
}
