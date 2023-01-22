#include <stdio.h>

int check_prime(int n);
int check_perfect(int n);

int main(){
	int n, c;
	printf("Enter a Number: ");
	scanf("%d", &n);

	/*c = check_prime(n); 
	if(c == 0){
		printf("Prime\n");
	}else{
		printf("Not Prime\n");
	}*/

	if(check_perfect(n)==1)
		printf("Perfect\n");
	else
		printf("Not Perfect\n");
	
	return 0;
}

int check_prime(int n){
	int i, flag = 1;
	for(i=2; i<n; i++){
		if(n%i==0){
			flag = 0;
			break;
		}
	}
	return flag;
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
