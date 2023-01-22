#include <stdio.h>
#include <stdlib.h>

//Linked List creation using struct
typedef struct Node{
	int data;
	struct Node *next;
}Node;

//Stack creation using struct
typedef struct{
	Node *head;
}stack;

//Inserting at head
Node * insert(Node *head, int data){
	Node *temp, *newn = (Node *)malloc(sizeof(Node));
	newn->data = data;
	newn->next = NULL;

	//Inserting when head is empty
	if(head == NULL){
		head = newn;
		return head;
	}

	//Inserting at head
	newn->next = head;
	head = newn;
	return head;
}

//Removing the head node
Node * delete_node(Node *head){
	Node *temp = head->next;
	free(head);
	return temp;
}

//Initializing the stack
void init_stack(stack *s){
    s->head = NULL;
}

//Pushing element into Stack
void push(stack *s, int n){
    s->head = insert(s->head, n);
}


//Popping element which is at the top
int pop(stack *s){
    if(s->head == NULL){
        printf("\nStack Underflow..\n");
        return -1;
    }
	int num = s->head->data;
	printf("%d ",num);
	s->head = delete_node(s->head);
    // printf("%d ", n);
    return num;
}

//Returning element which is at the top without removing it
int peek(stack s){
    return s.head->data;
}

//Checking stack is empty or not
int isEmpty(stack s){
    if(s.head == NULL)
        return 1;
    return 0;
}
