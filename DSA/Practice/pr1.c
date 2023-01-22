#include <stdio.h>

float find_cube(float n);
int main(){
	float n, cube;
	printf("Enter a Number: ");
	scanf("%f", &n);
	
	cube = find_cube(n);

	printf("Cube of %f is %f", n, cube);	
	return 0;
}

float find_cube(float n){
	return n*n*n;
}
