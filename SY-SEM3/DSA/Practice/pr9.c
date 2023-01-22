#include <stdio.h>

int check_perfect(int n);

int main(){
	int a,b,i;
	printf("Enter the range: ");
	scanf("%d %d", &a, &b);

	for(i=a; i<b+1; i++){
		if(check_perfect(i)==1)
			printf("%d ", i);
	}
	return 0;
}


int check_perfect(int n){
	int i, sum=0;

	for(i = 1; i<n; i++){
		if(n%i==0)
			sum += i;
	}
	if(sum == n)
		return 1;
	return 0;
}
