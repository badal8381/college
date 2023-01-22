#include <stdio.h>
#include <stdlib.h>

int main(){
	int *num, max=0,min=9999;
	do{
		printf("Enter a number(-1 to stop): ");
		num = (int *)malloc(4);
		scanf("%d",num);
		if(*num==-1){
			free(num);
			break;
		}
		if(*num>max)
			max=*num;
		else if(*num<min)
			min=*num;
		free(num);
	}while(*num!=-1);
	printf("Range is : %d\n",(max-min));
	return 0;
}
