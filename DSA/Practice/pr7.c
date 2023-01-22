#include <stdio.h>

int check_strong(int n);
int factorial(int n);

int main(){
	int a ,b,i;
	printf("Enter the range: ");
	scanf("%d %d", &a, &b);

	for(i=a; i<b+1; i++){
		if(check_strong(i)==1)
			printf("%d ", i);
	}

	return 0;
}


int check_strong(int n){
	int one, ten, hundred, sum, original;
	original = n;

	one = n%10;
	n = n/10;
	ten = n%10;
	n = n/10;
	hundred = n;

	sum = factorial(one) + factorial(ten) + factorial(hundred);

	if(original == sum)
		return 1;	
	else
		return 0;
}

int factorial(int n){
	int fact=1, i;
	for(i = 1; i<n+1; i++){
		fact = fact*i;
	}
	return fact;
}
