#include<stdio.h>
#include<stdlib.h>


int main(){
	int n, *A, *arr, i, j, sum=0;
    float average;
	printf("Enter the size of array: ");
	scanf("%d",&n);

	A = (int *)malloc(sizeof(int)*n);
	
	printf("Enter Elements of array: ");
	for(i = 0; i<n; i++)
		scanf("%d",&A[i]);

	printf("Elements of array are: ");
	for(i = 0; i<n; i++)
		printf("%d ",A[i]);
	printf("\n");

	arr = (int *)malloc(sizeof(int));
	j=0;
	for(i = 0; i<n; i++){
		if(A[i] != 0){
			arr = (int *)realloc(arr, sizeof(arr)+sizeof(int));
			arr[j] = A[i];
			j++;
		}
	}
	
	for(i=0; i<j; i++){
		sum+=arr[i];
	}
	average = sum/j;

	printf("Sum: %d\n",sum);
	printf("Average: %3.2f\n",average);
	
	free(arr);
	free(A);

	return 0;
}
