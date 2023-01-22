#include <stdio.h>
#include <stdlib.h>
#include "searching.h"

int main(){
	int i, n, key, arr[20];
	printf("Enter the size of array: ");
	scanf("%d",&n);

	//generate(arr, n);
	printf("Enter ELements of array: ");
	for(i = 0; i<n; i++)
		scanf("%d", &arr[i]);

	printf("Enter the element to search: ");
	scanf("%d",&key);

	linearSearch(arr,n, key);
	return 0;
}

