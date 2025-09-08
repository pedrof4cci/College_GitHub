#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
#include <windows.h>

/*																//1. Cadastro de Softwares para uma Loja de Aplicativos
typedef struct{
	int id, avaliacao;
	char nome[100];
}Software;

void cadastrar(Software softwares[]){
	int i=0;
	if(i <10){
		printf("Informe o ID: ");
        scanf("%d", &softwares[i].id);
        
        printf("Informe o nome: ");
        scanf("%s", softwares[i].nome);
        
        printf("Informe a avaliação de 1 - 10: ");
        scanf("%d", &softwares[i].avaliacao);
        i++;
	}
}

void listaSoftware(Software softwares[]) {
    printf("\n### lista de softwares ###\n");
    for (int i = 0; i < 10; i++) {
        printf("ID: %d, Nome: %s, Avaliação: %d\n", softwares[i].id, softwares[i].nome, softwares[i].avaliacao);
    }
}

void verAvaliacao(Software softwares[]) {
    printf("\n### softwares com nota acima de 8 ###\n");
    for (int i = 0; i < 10; i++) {
        if (softwares[i].avaliacao >= 8) {
            printf("ID: %d, Nome: %s, Avaliação: %d\n", softwares[i].id, softwares[i].nome, softwares[i].avaliacao);
        }
    }
}

int main(){										
	setlocale(LC_ALL,"Portuguese");
	
	Software softwares[10];
	
	int op;
	do{
	printf("\n---------------------------------");
	printf("\n-      loja de aplicativos      -");
	printf("\n---------------------------------");
	printf("\n 1. Cadastrar software  		 ");
	printf("\n 2. Listar Softwares ");
	printf("\n 3. Ver softwares mais avaliados ");
	printf("\n 0. Sair						 ");
	printf("\n---------------------------------\n");	
	scanf("%d", &op);
	
	if(op==1) cadastrar(softwares);
	if(op==2) listaSoftware(softwares);
	if(op==3) verAvaliacao(softwares);
	
	}while(op!=0);
}
*/





/*																	//4. Gerenciamento de Status de Equipamentos de Rede
int status;
int *ponteiroStatus;

void consultarStatus(int *status){
	if(*status > 0) printf("\n### Status: %d Ativo ###\n", *status);
	if(*status < 1) printf("\n### Status: %d Desativado ###\n", *status);
}
void atualizarStatus(int *status){
	if(*status > 0){
		*status = *status-1;
	}else{
		*status = *status+1;
	}
	printf("\n### Status alterado ###\n");
}

int main(){										
	setlocale(LC_ALL,"Portuguese");
	
	status = 1;
	ponteiroStatus=&status;
	
	int op;
	
	do{
	printf("\n---------------------------------");
	printf("\n- Gerenciamento de Equipamentos -");
	printf("\n---------------------------------");
	printf("\n 1. Consultar Status			 ");
	printf("\n 2. Atualizar Status			 ");
	printf("\n 0. Sair						 ");
	printf("\n---------------------------------\n");	
	scanf("%d", &op);
	
	if(op == 1)consultarStatus(ponteiroStatus);
	if(op == 2)atualizarStatus(ponteiroStatus);
	
	}while(op!=0);
	
  return 0;

}
*/


/*																//6. Análise de Consumo de Banda Larga dos Usuários
int vet[5]={50,501,82,16,204};
int *ponta;

void calculaMedia(int vet[], int tam){
	int sum = 0;
	for(int i=0; i<5; i++){
		sum=sum+vet[i];		
		//printf("A média é: %d", vet[i]);
	}
	int med = sum/tam;
	printf("A média é: %d", med);
}



void listaConsumo(int vet[], int tam){
	printf("Usuários com consumo acima de 100: ");
    for (int i = 0; i < tam; i++) {
        if (vet[i] > 100) {
            printf("%d ", vet[i]);
        }
    }
}

int main(){										
	setlocale(LC_ALL,"Portuguese");
	
	ponta=vet;
	
	int op;
	do{
	printf("\n---------------------------------");
	printf("\n-      Checagem de Consumo      -");
	printf("\n---------------------------------");
	printf("\n 1. Calcula Média geral  		 ");
	printf("\n 2. Lista Usuário maior consumo ");
	printf("\n 0. Sair						 ");
	printf("\n---------------------------------\n");	
	scanf("%d", &op);
	
	if(op==1) calculaMedia(vet, 5);
	if(op==2) listaConsumo(vet, 5);
	
	}while(op!=0);
}
*/
