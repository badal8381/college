#include <stdio.h>
#include <math.h>
#define CUBE(x) (x)*(x)*(x)

int check_armstrong(int n);
int main(){
	int a, b, i;
	printf("Enter the range: ");
	scanf("%d %d", &a, &b);

	for(i = a; i<b+1; i++){
		if(check_armstrong(i) == 1)
			printf("%d ", i);
	}
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
