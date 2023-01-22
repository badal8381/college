#include<stdio.h>
#include<stdlib.h>


int main(){
	int n, *arr, i,min,max;
	printf("Enter the size of array: ");
	scanf("%d",&n);

	arr = (int *)malloc(sizeof(int)*n);
	
	printf("Elements of array after memory allocation are: ");
	for(i = 0; i<n; i++)
		printf("%d ",arr[i]);
	printf("\n");

	printf("Enter Elements of array: ");
	for(i = 0; i<n; i++)
		scanf("%d",&arr[i]);

	printf("Elements of array are: ");
	for(i = 0; i<n; i++)
		printf("%d ",arr[i]);
	printf("\n");

	min = arr[0];
	for(i = 1; i<n; i++){
		if(min>arr[i])
			min = arr[i];
	}
	max = arr[0];
	for(i = 1; i<n; i++){
		if(max<arr[i])
			max = arr[i];
	}

	printf("The range of numbers is: %d\n", max-min);
	return 0;
}
