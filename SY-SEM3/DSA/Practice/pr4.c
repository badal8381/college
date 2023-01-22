#include <stdio.h>

void even_or_odd(int n);
int main(){
	int n;
	printf("Enter a Number: ");
	scanf("%f", &n);

	even_or_odd(n);
	return 0;
}

void even_or_odd(int n){
	(n%2==0)?printf("Even\n"):printf("Odd\n");
}
