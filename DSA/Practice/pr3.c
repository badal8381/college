#include <stdio.h>

int find_max(int a, int b);
int find_min(int a, int b);

int main(){
	int a, b;
	printf("Enter two Numbers: ");
	scanf("%d %d", &a, &b);
	
	printf("Maximum of %d, %d is %d\n",a,b, find_max(a,b));	
	printf("Minimum of %d, %d is %d\n",a,b, find_min(a,b));	
	return 0;
}


int find_min(int a, int b){
	return a<b?a:b;
}

int find_max(int a, int b){
	return a>b?a:b;
}
