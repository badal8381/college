#include <stdio.h>
#include <math.h>
#define CUBE(x) (x)*(x)*(x)

int check_armstrong(int n);
int main(){
	int n, c;
	printf("Enter a Number: ");
	scanf("%d", &n);
	if(check_armstrong(n)==1)
		printf("Armstrong\n");
	else
		printf("Not Armstrong\n");
	return 0;
}

int check_armstrong(int n){
	int one, ten, hundred, sum, original;
	original = n;

	one = n%10;
	n = n/10;
	ten = n%10;
	n = n/10;
	hundred = n;

	sum = CUBE(one) + CUBE(ten) + CUBE(hundred);

	if(original == sum)
		return 1;	
	else
		return 0;
}
