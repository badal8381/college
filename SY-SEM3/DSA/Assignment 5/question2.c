#include "dystack.h"

int main(){
    stack s;
    int choice, num;
    init_stack(&s);


    do
    {
        printf("\nMenu\n");
        printf("1. Push\n");
        printf("2. Pop\n");
        printf("3. Peek\n");
        printf("4. Is Empty\n");
        printf("Enter your choice (-1 to stop): ");
        scanf("%d",&choice);

        switch(choice){
            case 1: printf("\nEnter a number to Push: ");
                    scanf("%d", &num);
                    push(&s, num);
                    break;
                
            case 2: num = pop(&s);
                    if(num != -1)
                        printf("\nPopped element is: %d\n", num);
                    break;

            case 3: printf("\nThe element at the top is: %d\n", peek(s));
                    break;
            case 4: if(isEmpty(s) == 1)
                        printf("\nStack is Empty..\n");
                    else
                        printf("\nStack is not Empty..\n");
                    break;

        }

    } while (choice != -1);

    return 0;
}