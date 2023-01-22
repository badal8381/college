#include<stdio.h>

typedef struct{
	char name[20];
	char city[20];
	int salary;
}employee;

void bubbleSort(employee arr[], int n);
void swap(employee *a, employee *b);

int main(){
	int i;
	FILE *fp;
	employee emp[3];
	fp = fopen("employee.txt", "r");
	if(fp==NULL)
		printf("File not found..\n");

	for(i = 0; i<3; i++){
		fscanf(fp, "%s %s %d",emp[i].name, emp[i].city, &emp[i].salary);
	}
	
	for(i = 0; i<3; i++){
		printf("%s %s %d\n",emp[i].name, emp[i].city, emp[i].salary);
	}
	bubbleSort(emp,3);

	fclose(fp);

	fp = fopen("newemp.txt", "w");
	for(i = 0; i<3; i++){
		fprintf(fp, "%s %s %d\n",emp[i].name, emp[i].city, emp[i].salary);
	}

	fclose(fp);
	return 0;
}

void bubbleSort(employee arr[], int n){
	int i,j;
	for(i = 0; i<n-1; i++){
		for(j = i+1; j<n; j++){
			if(arr[i].salary>arr[j].salary){
				swap(&arr[i], &arr[j]);
			}
		}
	}	
}

void swap(employee *a, employee *b){
	employee temp = *a;
	*a = *b;
	*b = temp;
}
