#include<stdlib.h>
#include<stdio.h>

typedef struct{
    int *a;
    int top;
    int size;
}stack;

void push(stack *s, int n){
    if(s->a == NULL){
        s->a = (int *)malloc(sizeof(int));
        s->a[++s->top] = n;
        s->size++;
    }else{
        s->a = (int *)realloc(s->a, (sizeof(int)*s->size)+sizeof(int));
        s->a[++s->top] = n;
        s->size++;
    }
}


int isEmpty(stack s){
    if(s.top == -1)
        return 1;
    return 0;
}


int pop(stack *s){
    if(isEmpty(*s)){
        printf("Stack Underflow\n");
    }

    int n = s->a[s->top];
    s->size--;
    s->a = (int *)realloc(s->a, sizeof(int)*s->size);
    s->top--;
    printf("%d ", n);
    return n;
}

int peek(stack s){
    return s.a[s.top];
}


void init_stack(stack *s){
    s->top = -1;
    s->size = 0;
    s->a = NULL;
}
