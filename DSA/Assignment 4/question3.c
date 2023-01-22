#include <stdio.h>
#include "circularlist.h"

int main(){
	Node *head = NULL;
	int choice, num;
	do{
		printf("\n1. Enter value to append in list: \n");
		printf("2. Display list: \n");
		printf("Enter your choice (-1 to stop): ");
		scanf("%d",&choice);

		switch (choice){
		case 1: printf("\nEnter number to be inserted: ");
				scanf("%d",&num);
				head = append(head, num);
				break;
		
		case 2: printf("\nList: ");
				display(head);
				break;
		}
	}while(choice != -1);
	
	freeLL(head);
	return 0;
}
