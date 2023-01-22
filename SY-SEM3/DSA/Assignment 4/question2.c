#include <stdio.h>
#include "doublylist.h"

int main(){
	Node *head = NULL;
	int choice, choice1, num;
	do{
		printf("\nMenu \n");
		printf("1. Insert \n");
		printf("2. Search \n");
		printf("3. Delete \n");
		printf("4. Display \n");
		printf("Enter your choice (-1 to stop): ");
		scanf("%d",&choice);

		if(!(choice > 0 && choice < 5)){
			printf("Please Eenter valid menu option..\n");
			exit(0);
		}

		switch (choice){
		case 1: printf("\nEnter number to be inserted: ");
				scanf("%d",&num);
				head = insert(head, num, 0);
				break;
		
		case 2: printf("\nEnter number to search: ");
				scanf("%d",&num);
				if(search(head, num)==1) 
					printf("%d found..\n", num);
			       	else 
					printf("%d not found...\n", num);
				break;
		
		case 3: printf("\nMenu for delete:\n");
			printf("1. Delete from head \n");
			printf("2. Delete from tail \n");
			printf("3. Delete in between \n");
			printf("Enter you choice: ");
			scanf("%d",&choice1);

			printf("\nBefore deleting..\n");
			printf("List: ");
			display(head);
			switch(choice1){
				case 1: head = delete_node(head, 0);
					break;
				
				case 2: head = delete_node(head, -1);
					break;
				
				case 3: printf("\nEnter position: ");
					scanf("%d",&num);
					head = delete_node(head, num);
					break;
			}
			printf("\nAfter deleting..\n");
			printf("List: ");
			display(head);
			break;
		
		case 4: printf("\nList: ");
				display(head);
				break;
		}
	}while(choice != -1);
	
	freeLL(head);
	return 0;
}
