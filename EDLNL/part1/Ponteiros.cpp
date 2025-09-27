#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
#include <windows.h>

int main(){
	setlocale(LC_ALL, "Portuguese");
	
	int x;
	int *PTRx;	//declarando um ponteiro, precisa do * antes
	
	x=46784;
	PTRx=&x;	//declarando o valor do ponteiro, o & serve para reverir ao valor da memória
	
	printf("End. de Memória X: %d", &x);
	printf("\nValor de X: %d\n", x);
	
	printf("\nEnd. de Memória de Ponteiro: %d", &PTRx);
	printf("\nValor do Ponteiro: %d", PTRx);
	printf("\nValor para onde o ponteiro aponta: %d", *PTRx); //usando o * antes do ponteiro, nos mostra o valor para onde ele está apontando 
}
