#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
	int data;
	struct Node *next, *prev;
}Node;

Node * insert(Node *head, int data, int position){
	int i;
	Node *temp, *newn = (Node *)malloc(sizeof(Node));
	newn->data = data;
	newn->next = NULL;
	newn->prev = NULL;

	//Inserting when head is empty
	if(head == NULL){
		head = newn;
		return head;
	}

	//Inserting at head
	if(position == 0){
		head->prev = newn;
		newn->next = head;
		head = newn;
		return head;
	}

	//Inserting at tail
	if(position == -1){
		temp = head;
		while(temp->next != NULL){
			temp = temp->next;
		}
		temp->next = newn;
		newn->prev = temp;
		return head;
	}
	
	//Inserting at given position
	temp = head;
	for(i = 0; i<position-1; i++){
		temp = temp->next;
	}
	newn->next = temp->next;
	temp->next = newn;
	newn->prev = temp;
	return head;
}

void display(Node *head){
	Node *temp = head;
	while(temp != NULL){
		printf("<-%d->", temp->data);
		temp = temp->next;
	}
	printf("NULL\n");
}


int search(Node *head, int data){
	Node *temp = head;
	while(temp->next != NULL){
		if(temp->data == data)
			return 1;
		temp = temp->next;
	}
	return 0;
}

Node * delete_node(Node *head, int pos){
	int i;
	Node *tofree, *temp;

	if(pos == 0){
		tofree = head;
		head = head->next;
		head->prev = NULL;
		free(tofree);
		return head;
	}

	if(pos == -1){
		temp = head;
		while(temp->next->next != NULL)
			temp = temp->next;
		free(temp->next);
		temp->next = NULL;
		return head;
	}

	temp = head;
	for(i = 0; i < pos-1; i++){
		temp = temp->next;
	}
	tofree = temp->next;
	temp->next = temp->next->next;
	temp->next->prev = temp;
	free(tofree);
	return head;
}


void freeLL(Node *head){
	Node *temp;
	while(head != NULL){
		temp = head;
		head = head->next;
		free(temp);
	}
}

