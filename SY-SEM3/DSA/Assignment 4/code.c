#include <stdio.h>
#include <stdlib.h>

typedef struct Node{
	int data;
	struct Node *next, *prev;
}Node;

Node * insert(Node *head, int data, int position){
	int i;
	Node *temp, *newn = malloc(sizeof(Node));
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
	newn->prev = temp;
	temp->next = newn;
	return head;
}

void display(Node *head){
	Node *temp = head;
	while(temp != NULL){
		printf("%d->",temp->data);
		temp = temp->next;
	}
	printf("NULL\n");
}


Node *search(Node *head, int data){
	Node *temp = head;
	while(temp != NULL){
		if(temp->data == data)
			return temp;
		temp = temp->next;
	}
	return NULL;
}

Node * delete(Node *head, int data){
	Node *temp = head;
	Node *tofree;


	//deleting head if data matches head's data
	if(head->data == data){
		tofree = head;
		head = head->next;
		free(tofree);
		return head;
	}
	while(temp->next != NULL){
		if(temp->data == data){
			tofree = temp;
			temp->prev->next = temp->next;
			temp->next->prev = temp->prev;
			free(tofree);
			return head;
		}
		temp = temp->next;
	}	
/*
	//deleting in all other cases
	while(temp->next != NULL){
		if(temp->next->data == data){
			tofree = temp->next;
			temp->next = temp->next->next;
			temp->next->prev = temp;
			free(tofree);
			return head;
		}
		temp = temp->next;
	}	

	//deleting tail if data matches tail's data
	printf("%p", temp);
	if(temp->data == data){
		temp->prev->next = NULL;
		free(temp);
	}*/
}

void freeLL(Node *head){
	Node *temp;
	while(head != NULL){
		temp = head;
		head = head->next;
		free(temp);
	}
}


int main(){
	Node *head = NULL;
	head = insert(head, 9, 0);
	head = insert(head, 8, 0);
	head = insert(head, 7, 0);
	head = insert(head, 6, 0);
	head = insert(head, 5, 0);
	display(head);
	head = delete(head, 7);

	display(head);

	freeLL(head);
	return 0;
}
