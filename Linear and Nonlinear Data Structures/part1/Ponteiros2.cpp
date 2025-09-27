#include <stdio.h>
#include <stdlib.h>
#include <locale.h>



int main(){
	setlocale(LC_ALL, "Portuguese");
	
	int x=22;
	int *ptrX=&x;
	
	printf("%d \n", x);
	printf("%d \n", *ptrX);
	printf("%p \n", &x);
	printf("%p \n\n", &ptrX);
	printf("%p \n\n", &*ptrX);
}
