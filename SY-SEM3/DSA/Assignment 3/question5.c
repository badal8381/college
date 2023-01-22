#include <stdio.h>
#include <stdlib.h>
#include "searching.h"

int main(){
	int i, n, key, found, arr[20];
	printf("Enter the size of array: ");
	scanf("%d",&n);

	generate(arr, n);
	
	bubbleSort(arr, n);
	printf("ELements of array: ");
	for(i = 0; i<n; i++)
		printf("%d ", arr[i]);

	printf("\nEnter the element to search: ");
	scanf("%d",&key);
	
	//Ternary Search
	found = ternarySearch(arr,0, n, key);

	if(found != -1)
		printf("%d found at %d\n",key, found);
	else
		printf("not found\n");
	return 0;
}

