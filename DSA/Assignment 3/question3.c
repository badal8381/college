#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct{
	char name[20];
	int std;
}city;

int linearSearch(city arr[], int n, char key[]);

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

	i = linearSearch(arr, i, cityname);
	if(i != -1){
		printf("Found..\n");
		printf("%s %d\n", arr[i].name, arr[i].std);
	}else
		printf("city not in the list..\n");	

	return 0;
}

int linearSearch(city arr[], int n, char key[]){
	int i;
	for(i = 0; i<n; i++){
		if(strcmp(arr[i].name,key) == 0)
			return i;
	}
	return -1;
}
