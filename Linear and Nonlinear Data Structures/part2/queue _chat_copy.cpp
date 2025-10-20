#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

#define tamanho 3

struct tipo_fila{
    int dados[tamanho];
    int ini;
    int fim;
    int count; // contador de elementos
};

struct tipo_fila fila = {{0}, 0, 0, 0}; //variavel global inicializada 

void enfileirar(int valor){ //push-back
    if(fila.count == tamanho){
        printf("Fila cheia\n");
        system("pause");
    }else{
        fila.dados[fila.fim] = valor;
        fila.fim = (fila.fim + 1) % tamanho; // fila circular
        fila.count++;
        printf("Elemento enfileirado: %d\n", valor);
    }
}

int desenfileirar(){ //pop
    int elemento = -1; // valor padrão para fila vazia
    if(fila.count == 0){
        printf("Fila vazia\n");
        system("pause");
    }else{
        elemento = fila.dados[fila.ini];
        fila.dados[fila.ini] = 0; // limpa a posição
        fila.ini = (fila.ini + 1) % tamanho; // fila circular
        fila.count--;
        printf("Elemento desenfileirado: %d\n", elemento);
    }
    return elemento;
}

void remover_elemento(int elemento){
    int posicao = -1, i;
    if(fila.count == 0){
        printf("\nFila Vazia!\n");
        system("pause");
    }else{
        // Procura o elemento na fila
        for(i = 0; i < fila.count; i++){
            int indice = (fila.ini + i) % tamanho;
            if(fila.dados[indice] == elemento){
                posicao = indice;
                break;
            }
        }
        if(posicao < 0){
            printf("\nValor não encontrado na fila.\n");
        }else{
            // Move os elementos após a posição encontrada
            for(i = 0; i < fila.count; i++){
                int atual = (fila.ini + i) % tamanho;
                if(atual == posicao){
                    // Remove o elemento movendo todos os posteriores
                    for(int j = i; j < fila.count - 1; j++){
                        int pos_atual = (fila.ini + j) % tamanho;
                        int pos_prox = (fila.ini + j + 1) % tamanho;
                        fila.dados[pos_atual] = fila.dados[pos_prox];
                    }
                    break;
                }
            }
            // Limpa a última posição e ajusta o fim
            fila.fim = (fila.fim - 1 + tamanho) % tamanho;
            fila.dados[fila.fim] = 0;
            fila.count--;
            printf("\nElemento %d removido da fila.\n", elemento);
        }
    }
}

void mostrar_fila(){
    if(fila.count == 0){
        printf("\nFila vazia!\n");
    }else{
        printf("\nConteúdo da fila: ");
        for(int i = 0; i < fila.count; i++){
            int indice = (fila.ini + i) % tamanho;
            printf("%d ", fila.dados[indice]);
        }
        printf("\n");
    }
}

int main(){
    setlocale(LC_ALL, "Portuguese");

    int op, valor, elemento;

    do{
        printf("\n---------------------------------");
        printf("\n-        simulação fila         -");
        printf("\n---------------------------------");
        printf("\n 1. enfileirar");
        printf("\n 2. desenfileirar");
        printf("\n 3. mostrar fila");
        printf("\n 4. remover elemento específico");
        printf("\n 0. Sair");
        printf("\n---------------------------------\n");	
        scanf("%d", &op);


        switch (op)
        {
        case 1:
            printf("\ndigite um valor: \n");
            scanf("%d", &valor);
            enfileirar(valor);
            break;
        case 2:
            elemento = desenfileirar();
            break;
        case 3:
            mostrar_fila();
            break;
        case 4:
            printf("\nDigite o valor a ser removido: ");
            scanf("%d", &valor);
            remover_elemento(valor);
            break;
        default:
            break;
        }
        
    } while (op!=0);

    printf("Fim do Programa");
}
