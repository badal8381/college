#include<stdio.h>
#define SIZE 20

typedef struct{
    int a[SIZE];
    int top;
    int size;
}stack;

void init_stack(stack *s);
void push(stack *s, int n);
int pop(stack *s);
int peek(stack s);
int isEmpty(stack s);
int isFull(stack s);


void init_stack(stack *s){
    s->top = -1;
    s->size = 0;
}

void push(stack *s, int n){
    if(s->top < SIZE-1){
        s->a[++(s->top)] = n;
        (s->size)++;
    }else{
        printf("\nStack Overflow..\n");
    }
}


int pop(stack *s){
    if(isEmpty(*s)==1){
        printf("\nStack Underflow..\n");
        return -1;
    }

    int n = s->a[s->top];
    (s->size)--;
    (s->top)--;
    return n;
}

int peek(stack s){
    return s.a[s.top];
}

int isEmpty(stack s){
    if(s.top == -1)
        return 1;
    return 0;
}

int isFull(stack s){
    if(s.top == SIZE-1)
        return 1;
    return 0;
}





