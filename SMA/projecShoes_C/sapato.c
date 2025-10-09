#include <stdio.h>
#include <stdlib.h>
#include <string.h>



void login(){
    char username[20];
    char password[20];

    int tentativas = 3;

    while(tentativas > 0){
        printf("Digite o nome de usuario: ");
        scanf("%s", username);
        printf("Digite a senha: ");
        scanf("%s", password);

        if(strcmp(username, "admin") == 0 && strcmp(password, "password") == 0){
            system("clear || cls");
            printf("\n# Login bem-sucedido! #\n");
            break;
        } else {
            tentativas--;
            printf("Nome de usuario ou senha incorretos. Tentativas restantes: %d\n", tentativas);
        }
        if(tentativas == 0){
            printf("Numero maximo de tentativas atingido. Encerrando o programa.\n");
            exit(1);
        }
    }
}

void menu(){
    printf("\n#######################################################################\n");
    printf("                            Loja de Sapatos\n");
    printf("\n#######################################################################\n");
    printf("                     Menu de Operacoes:\n");
    printf("                     1 - Cadastrar Produto\n");
    printf("                     2 - Listar Produtos\n");
    printf("                     3 - Vender Produto\n");
    printf("                     4 - Cadastrar Usuario\n");
    printf("                     0 - Sair\n");
    printf("\n#######################################################################\n");
}

void cadastrarProduto(){
    printf("Funcao cadastrarProduto chamada.\n");
}

void listarProdutos(){
    printf("Funcao listarProdutos chamada.\n");
}

void venderProduto(){
    printf("Funcao venderProduto chamada.\n");
}

void cadastrarUsuario(){
    printf("Funcao cadastrarUsuario chamada.\n");
}

int main(){
    int op, a, b;

    login();
    menu();

    scanf("%d", &op);


    switch(op){
        case 1:
            cadastrarProduto();
            break;
        case 2:
            listarProdutos();
            break;
        case 3:
            venderProduto();
            break;
        case 4:
            cadastrarUsuario();
            break;
        case 0:
            printf("Encerrando o programa.\n");
            break;
        default:
            printf("Operacao invalida\n");
    }

    return 0;
}