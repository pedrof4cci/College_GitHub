#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <locale.h>

#define tamanho 3

struct tipo_fila{
    int dados[tamanho];
    int ini=0; 
    int fim=0;
};

struct tipo_fila fila; //variavel global 

void enfileirar(int valor){ //push-back
    if(fila.fim==tamanho){
        printf("Fila cheia\n");
        system("pause");
    }else{
        fila.dados[fila.fim]=valor;
        fila.fim++;
        printf("elemento enfileirado");
    }
}

int desenfileirar(){ //pop
    int elemento;
    if(fila.fim==0){
        printf("Fila vazia\n");
        system("pause");
    }else{
        elemento = fila.dados[fila.ini];
        for(int i=0; i<tamanho; i++){
            fila.dados[i]=fila.dados[i+1];
        }
        fila.dados[fila.fim]=0;
        fila.fim--;
    }
    return elemento;
}

void desenfileirar2(int elemento){
    int posicao=-1, i;
    if(fila.fim==0){
        printf("\nFila Vazia!.");
        system("pause");
    }else{
        for(i=0; i<tamanho; i++){
            if(fila.dados[i]==elemento){
                posicao=i;
                break;
            }
        }
        if(posicao<0){
            printf("\nValor não encontrado na lista.\n");
        }else{
            for(i=posicao; i<=fila.fim;i++){
                fila.dados[i]=fila.dados[i+1];

                fila.dados[fila.fim]=0;
                fila.fim--;
                printf("\nElemento Removido");
            }
        }
    }
}

void monstra_fila(){
    for(int i=0; i<tamanho; i++){
        printf("%d", fila.dados[i]);
    }
}

int main(){
    setlocale(LC_ALL, "Portuguese");

    int op, valor, elemento;

    do{
        printf("\n---------------------------------");
        printf("\n-        simulação fila         -");
        printf("\n---------------------------------");
        printf("\n 1. enfileirar  		 ");
        printf("\n 2. desenfileirar ");
        printf("\n 3. mostrar fila ");
        printf("\n 0. Sair						 ");
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
            printf("Elemento desenfileirado: %d\n", elemento);
            break;
        case 3:
            monstra_fila();
            break;
        
        default:
            break;
        }
        
    } while (op!=0);

    printf("Fim do Programa");
}
