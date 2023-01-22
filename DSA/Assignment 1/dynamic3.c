#include<stdio.h>
#include<stdlib.h>


int main(){
	int n, m, i, j, **arr;

	printf("Enter the row and column size: ");
	scanf("%d %d",&n, &m);

	arr = (int **)malloc(sizeof(int)*n*m);
	
	printf("Enter Elements of array: ");
	for(i = 0; i<n; i++){
		arr[i] = (int *)malloc(sizeof(int)*m);
		for(j = 0; j<m; j++)
			scanf("%d",&arr[i][j]);
	}

	printf("Elements of array are: ");
	for(i = 0; i<n; i++){
		for(j = 0; j<m; j++)
			printf("%d ",arr[i][j]);
	}
	printf("\n");
	
	for(i=0; i<n; i++)
		free(arr[i]);
	free(arr);

	return 0;
}
