#include<stdio.h>
#include "empsorting.h"


int main(){
	int i, n;
	FILE *fp;
	employee emp[20];
	fp = fopen("employee1.txt", "r");
	if(fp==NULL)
		printf("File not found..\n");
	i = 0;
	while(!feof(fp)){
		fscanf(fp, "%s %s %d %d",emp[i].name, emp[i].mobileno, &emp[i].age, &emp[i].salary);
		i++;
	}
	n = i;
	
	for(i = 0; i<n-1; i++){
		printf("%s %s %d %d\n",emp[i].name, emp[i].mobileno, emp[i].age, emp[i].salary);
	}
	mergeSort(emp,0,n-1);

	fclose(fp);

	fp = fopen("sortedemp.txt", "w");
	for(i = 0; i<n-1; i++){
		fprintf(fp, "%s %s %d %d\n",emp[i].name, emp[i].mobileno, emp[i].age, emp[i].salary);
	}

	fclose(fp);
	return 0;
}
