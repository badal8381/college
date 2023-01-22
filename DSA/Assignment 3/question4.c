#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct{
	char name[20];
	int std;
}city;

int binarySearch(city arr[], int start, int end, char *key);
void swap(city *a, city *b);
void bubbleSort(city arr[], int n);

int main(){
	int i;
	char cityname[20];
	city arr[20];
	FILE *fp;
	fp = fopen("cities.txt", "r");

	if(fp==NULL){
		printf("file not found\n");
		exit(0);
	}
	
	i = 0;
	while(!feof(fp)){
		fscanf(fp, "%s %d", arr[i].name, &arr[i].std);
		i++;
	}

	printf("Enter name of city to search: ");
	scanf("%s", cityname);

	bubbleSort(arr, i);
	i = binarySearch(arr, 0, i, cityname);
	if(i != -1){
		printf("Found..\n");
		printf("%s %d\n", arr[i].name, arr[i].std);
	}else
		printf("city not in the list..\n");	

	return 0;
}

int binarySearch(city arr[], int start, int end, char key[]){
	int mid = (start+end)/2;
	if(strcmp(arr[mid].name, key) == 0){
		return mid;
	}
	if(strcmp(arr[mid].name, key) < 0){
		return binarySearch(arr, mid+1, end, key);
	}
	if(strcmp(arr[mid].name, key) > 0){
		return binarySearch(arr, start, mid-1, key);
	}
	return -1;
}



void swap(city *a, city *b){
	city temp = *a;
	*a = *b;
	*b = temp;
}

void bubbleSort(city arr[], int n){
	int i,j;
	for(i = 0; i<n-1; i++){
		for(j = i+1; j<n; j++){
			if(strcmp(arr[i].name, arr[j].name) > 0){
				swap(&arr[i], &arr[j]);
			}
		}
	}	
}

