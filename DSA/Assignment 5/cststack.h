#include<stdio.h>
#define SIZE 50

typedef struct{
    char a[SIZE];
    int top;
    int size;
}stack;

void init_stack(stack *s);
void push(stack *s, char n);
int pop(stack *s);
int peek(stack s);
int isEmpty(stack s);
int isFull(stack s);


void init_stack(stack *s){
    s->top = -1;
    s->size = 0;
}

void push(stack *s, char c){
    if(s->top < SIZE-1){
        s->a[++(s->top)] = c;
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

    char c = s->a[s->top];
    // printf("%c ",c);
    (s->size)--;
    (s->top)--;
    return (int)c;
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





