#include "cststack.h"
#include <string.h>

int main(){
    stack s;
    init_stack(&s);

    char word[50], reverse[50];
    printf("Enter a string: ");
    scanf("%s",word);

    int i = 0;
    while (word[i] != '\0'){
        push(&s, word[i]);
        i++;
    }

    int c;
    i = 0;
    while ((c=pop(&s)) != -1){
        reverse[i] = (char)c;
        i++;
    }
    reverse[i] = '\0';

    if(strcmp(word, reverse) == 0)
        printf("String is Palindrom..\n");
    else
        printf("String is not Palindrom..\n");

    return 0;
}