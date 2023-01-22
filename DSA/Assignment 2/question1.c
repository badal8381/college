#include <stdio.h>
#include <stdlib.h>
#include "sorting.h"

int main(){
	int n, arr[20];
	printf("Enter the size of array: ");
	scanf("%d",&n);

	generate(arr, n);
	printf("Before sorting array: ");
	display(arr,n);
	bubbleSort(arr,n);
	printf("After sorting array: ");
	display(arr,n);
	return 0;
}

