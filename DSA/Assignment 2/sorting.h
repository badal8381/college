#include<stdio.h>
#include<stdlib.h>
#include<time.h>


void swap(int *a, int *b){
	int temp = *a;
	*a = *b;
	*b = temp;
}

void generate(int arr[], int n){
	int i;
	srand(time(0));
	for(i = 0; i<n; i++){
		arr[i] = random()%100;
	}	
}

void display(int arr[], int n){
	int i;
	for(i = 0; i<n; i++){
		printf("%d ", arr[i]);
	}	
	printf("\n");
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


void insertionSort(int arr[], int n){
	int i, j, current;
	for(i=1; i<n; i++){
		current = arr[i];
		j = i - 1;
		while(j>=0 && arr[j] > current){
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = current;
	}
}


int merge(int arr[], int start, int mid, int end){
	int i, j, size = end-start+1;
	int merged[size];
	int idx1 = start;
	int idx2 = mid+1;
	int x = 0;

	while (idx1 <= mid && idx2 <= end){
		if(arr[idx1] <= arr[idx2])
			merged[x++] = arr[idx1++];
		else
			merged[x++] = arr[idx2++];
	}
	
	while(idx1 <= mid){
		merged[x++] = arr[idx1++];
	}
	while(idx2 <= end){
		merged[x++] = arr[idx2++];
	}

	for(i=0, j=start; i<size; i++, j++){
		arr[j] = merged[i];
	}
}

void mergeSort(int arr[], int start, int end){
	if(start >= end)
		return;

	int mid = start + (end-start)/2;
	mergeSort(arr, start, mid);
	mergeSort(arr, mid+1, end);
	merge(arr, start, mid, end);
}


int partition(int arr[], int start, int end){
	int pivot = arr[end];
	int j, i = start-1;
	for(j=start; j<end; j++){
		if(arr[j] < pivot){
			i++;
			swap(&arr[j], &arr[i]);
		}
	}
	i++;
	swap(&arr[i], &pivot);
	swap(&pivot, &arr[end]);
	return i;
}

void quickSort(int arr[], int start, int end){
	if(start < end){
		int pivot = partition(arr, start, end);
		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, end);
	}
}
