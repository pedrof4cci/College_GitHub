#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

#define tamanho 3

struct tipo_pilha{
    int dado[tamanho];
    int ini;
    int topo;
};

struct tipo_pilha pilha;

// empilhar (push)
void empilha (int elemento){
    if(pilha.topo == tamanho){
        printf("Fila cheia.\n");
        system("pause");
    } else {
        pilha.dado[pilha.topo] = elemento;
        pilha.topo++;
    }
}

// desempilhar (pop)
int desempilha(){
    int elemento;
    if(pilha.topo == pilha.ini){
        printf("Fila vazia.\n");
        system("pause");
    } else {
        elemento = pilha.dado[pilha.topo];
        pilha.dado[pilha.topo] = 0;
        pilha.topo--;
    }
    return elemento;
}


// mostrar elementos
void mostrar(){
    int i;
    if(pilha.topo == pilha.ini){
        printf("Fila vazia.\n");
        system("pause");
    } else {
        for(i = 0; i<pilha.topo; i++){
            printf("%d - ", pilha.dado[i]);
        }
    }
}

// menu
int main(){										
	setlocale(LC_ALL,"Portuguese");
	
	int op;
	do{
	printf("\n---------------------------------");
	printf("\n-        Simulação Stack        -");
	printf("\n---------------------------------");
	printf("\n 1. Inserir Valor  		 ");
	printf("\n 2. Remover Valor ");
	printf("\n 3. Mostrar Valores na Pilha ");
	printf("\n 0. Sair						 ");
	printf("\n---------------------------------\n");	
	scanf("%d", &op);
	
	if(op==1){
        printf("Digite o valor a ser inserido: ");
        int valor;
        scanf("%d", &valor);
        
        empilha(valor);
    }
    if(op==2){desempilha();}
    if(op==3){mostrar();}
	
	}while(op!=0);
}