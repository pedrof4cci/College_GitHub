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