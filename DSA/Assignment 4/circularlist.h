#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
	int data;
	struct Node *next;
}Node;

Node *lastn=NULL;

Node * append(Node *head, int data){
	Node *newn;

	//Inserting when head is empty
	if(head == NULL){
		head = (Node *)malloc(sizeof(Node));
		head->data = data;
		head->next = head;
		lastn = head;
		return head;
	}

	//Appending the element at the end of the list
	newn = (Node *)malloc(sizeof(Node));
	newn->data = data;
	newn->next = lastn->next;
	lastn->next = newn;
	lastn = lastn->next;
	return head;
}


void display(Node *head){
	Node *temp = head;
	while(temp != lastn){
		printf("%d->",temp->data);
		temp = temp->next;
	}
	printf("%d->",lastn->data);
	printf("HEAD\n");
}

void display_upto(Node *head, int n){
	Node *temp = head;
	int i;
	for(i = 0; i<n; i++){
		printf("%d->",temp->data);
		temp = temp->next;
	}
}

void freeLL(Node *head){
	Node *temp;
	while(head != lastn){
		temp = head;
		head = head->next;
		free(temp);
	}
	free(lastn);
}

