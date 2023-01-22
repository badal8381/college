#include "cststack.h"

void reverse(char *word);

int main(){
    char word[50];
    printf("Enter a string: ");
    scanf("%s",word);
    
    reverse(word);
    printf("\nReversed string: %s\n", word);

    return 0;
}

void reverse(char *word){
    stack s;
    init_stack(&s);

    int i = 0;
    while (word[i] != '\0'){
        push(&s, word[i]);
        i++;
    }

    int c;
    i = 0;
    while ((c=pop(&s)) != -1){
        word[i] = (char)c;
        i++;
    }
    word[i] = '\0';
}