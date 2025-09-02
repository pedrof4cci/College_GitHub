#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

void imprimir(int vet[], int tam){
	int i;
	for(i=0; i<tam; i++){
		printf("%d ", vet[i]);
	}
}
void alterar(int vet[], int tam, int taxa){
	int i;
	for(i=0; i<tam; i++){
		vet[i]=vet[i]+taxa;
	}
}

int main(){
	setlocale(LC_ALL,"Portuguese");
	int vet[10]={0,1,2,3,4,5,6,7,8,9};
	int tam=sizeof(vet)/sizeof(int);
	int taxa;
	
	printf("\nDigite um valor para a taxa de crescimento: ");
	scanf("d", &taxa);
	
	imprimir(vet, tam);
	alterar(vet, tam, taxa);
	printf("\n\n");
	imprimir(vet, tam);
}
