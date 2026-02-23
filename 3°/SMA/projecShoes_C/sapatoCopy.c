#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_PRODUTOS 100
#define MAX_USUARIOS 50

typedef struct {
    int id;
    char nome[50];
    char marca[30];
    int tamanho;
    float preco;
    int quantidade;
} Produto;

typedef struct {
    char username[20];
    char password[20];
    char nomeCompleto[50];
} Usuario;

Produto produtos[MAX_PRODUTOS];
int totalProdutos = 0;

Usuario usuarios[MAX_USUARIOS];
int totalUsuarios = 1; // Começa com 1 (admin)



void login(){
    char username[20];
    char password[20];

    // Inicializa o usuário admin
    strcpy(usuarios[0].username, "admin");
    strcpy(usuarios[0].password, "password");
    strcpy(usuarios[0].nomeCompleto, "Administrador");

    int tentativas = 3;

    while(tentativas > 0){
        printf("Digite o nome de usuario: ");
        scanf("%s", username);
        printf("Digite a senha: ");
        scanf("%s", password);

        // Verifica em todos os usuários cadastrados
        int loginValido = 0;
        for(int i = 0; i < totalUsuarios; i++){
            if(strcmp(username, usuarios[i].username) == 0 && strcmp(password, usuarios[i].password) == 0){
                loginValido = 1;
                break;
            }
        }

        if(loginValido){
            system("clear || cls");
            printf("\n# Login bem-sucedido! Bem-vindo! #\n");
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
    if(totalProdutos >= MAX_PRODUTOS){
        printf("\nLimite de produtos atingido!\n");
        return;
    }

    Produto p;
    p.id = totalProdutos + 1;

    printf("\n### Cadastro de Produto ###\n");
    printf("Nome do produto: ");
    scanf(" %[^\n]", p.nome);
    
    printf("Marca: ");
    scanf(" %[^\n]", p.marca);
    
    printf("Tamanho: ");
    scanf("%d", &p.tamanho);
    
    printf("Preco: R$ ");
    scanf("%f", &p.preco);
    
    printf("Quantidade em estoque: ");
    scanf("%d", &p.quantidade);

    produtos[totalProdutos] = p;
    totalProdutos++;

    printf("\nProduto cadastrado com sucesso! ID: %d\n", p.id);
}

void listarProdutos(){
    if(totalProdutos == 0){
        printf("\nNenhum produto cadastrado.\n");
        return;
    }

    printf("\n### Lista de Produtos ###\n");
    printf("%-5s %-30s %-20s %-10s %-10s %-10s\n", "ID", "Nome", "Marca", "Tamanho", "Preco", "Estoque");
    printf("--------------------------------------------------------------------------------\n");

    for(int i = 0; i < totalProdutos; i++){
        printf("%-5d %-30s %-20s %-10d R$ %-8.2f %-10d\n",
               produtos[i].id,
               produtos[i].nome,
               produtos[i].marca,
               produtos[i].tamanho,
               produtos[i].preco,
               produtos[i].quantidade);
    }
    printf("\nTotal de produtos: %d\n", totalProdutos);
}

void venderProduto(){
    if(totalProdutos == 0){
        printf("\nNenhum produto disponivel para venda.\n");
        return;
    }

    int id, quantidade;
    printf("\n### Venda de Produto ###\n");
    printf("Digite o ID do produto: ");
    scanf("%d", &id);

    int index = -1;
    for(int i = 0; i < totalProdutos; i++){
        if(produtos[i].id == id){
            index = i;
            break;
        }
    }

    if(index == -1){
        printf("Produto nao encontrado!\n");
        return;
    }

    printf("Produto: %s\n", produtos[index].nome);
    printf("Preco unitario: R$ %.2f\n", produtos[index].preco);
    printf("Estoque disponivel: %d\n", produtos[index].quantidade);
    
    printf("Quantidade a vender: ");
    scanf("%d", &quantidade);

    if(quantidade <= 0){
        printf("Quantidade invalida!\n");
        return;
    }

    if(quantidade > produtos[index].quantidade){
        printf("Estoque insuficiente!\n");
        return;
    }

    float total = quantidade * produtos[index].preco;
    produtos[index].quantidade -= quantidade;

    printf("\n### Venda Realizada ###\n");
    printf("Produto: %s\n", produtos[index].nome);
    printf("Quantidade: %d\n", quantidade);
    printf("Valor total: R$ %.2f\n", total);
    printf("Estoque restante: %d\n", produtos[index].quantidade);
}

void cadastrarUsuario(){
    if(totalUsuarios >= MAX_USUARIOS){
        printf("\nLimite de usuarios atingido!\n");
        return;
    }

    Usuario u;
    printf("\n### Cadastro de Usuario ###\n");
    printf("Nome completo: ");
    scanf(" %[^\n]", u.nomeCompleto);
    
    printf("Nome de usuario: ");
    scanf("%s", u.username);

    // Verifica se o username já existe
    for(int i = 0; i < totalUsuarios; i++){
        if(strcmp(usuarios[i].username, u.username) == 0){
            printf("Nome de usuario ja existe!\n");
            return;
        }
    }
    
    printf("Senha: ");
    scanf("%s", u.password);

    usuarios[totalUsuarios] = u;
    totalUsuarios++;

    printf("\nUsuario cadastrado com sucesso!\n");
}

int main(){
    int op;

    login();
    
    do {
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
                printf("\nEncerrando o programa. Ate logo!\n");
                break;
            default:
                printf("\nOperacao invalida! Tente novamente.\n");
        }

        if(op != 0){
            printf("\nPressione ENTER para continuar...");
            getchar(); // Limpa o buffer
            getchar(); // Espera o ENTER
            system("clear || cls");
        }

    } while(op != 0);

    return 0;
}