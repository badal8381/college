#include<stdio.h>
#include<stdlib.h>
#include<time.h>

void generate(int arr[], int n){
	int i;
	srand(time(0));
	for(i = 0; i<n; i++){
		arr[i] = rand()%100;
	}	
}

void display(int arr[], int n){
	int i;
	for(i = 0; i<n; i++){
		printf("%d ", arr[i]);
	}	
	printf("\n");
}

void linearSearch(int arr[], int n, int key){
	int i; 
	for(i = 0; i<n; i++){
		if(arr[i] == key)
			printf("%d found at %d\n", key, i);
	}
}

int binarySearch(int arr[], int start, int end, int key){
	int mid = (start+end)/2;
	if(arr[mid] == key){
		return mid;
	}
	if(key > arr[mid]){
		return binarySearch(arr, mid+1, end, key);
	}
	if(key < arr[mid]){
		return binarySearch(arr, start, mid-1, key);
	}
	return -1;
}



void swap(int *a, int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
}

void bubbleSort(int arr[], int n){
	int i,j,temp,min;
	for(i = 0; i<n-1; i++){
		for(j = i+1; j<n; j++){
			if(arr[i]>arr[j]){
				swap(&arr[i], &arr[j]);
			}
		}
	}	
}


int ternarySearch(int arr[], int low, int high, int key){
	if(high >= 1){
		int mid1 = low + (high-low)/3;
		int mid2 = high - (high-low)/3;

		if(arr[mid1] == key)
			return mid1;	
		if(arr[mid2] == key)
			return mid2;

		if(key < arr[mid1])
			return ternarySearch(arr, low, mid1-1, key);
		else if(key > arr[mid2])
			return ternarySearch(arr, mid2+1, high, key);
		else
			return ternarySearch(arr, mid1+1, mid2-1, key);
	}
	return -1;
}

