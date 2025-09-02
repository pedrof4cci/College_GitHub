#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

typedef struct{
	int dia, mes, ano;
}Data;
void imprimirData(Data *x){
	printf("%d/%d/%d \n", x->dia,x->mes,x->ano);
	x->dia=19;
}

int main(){
	setlocale(LC_ALL,"Portuguese");
	
	Data data;
	Data *p;
	p=&data;
	printf("Endereço de data: %p conteudo de p: %p \n", &data, p);
	data.dia=17;
	data.mes=2;
	data.ano=2024;
	
	imprimirData(p);
	printf("%d/%d/%d \n\n",data.dia,data.mes,data.ano);
	system("pause");
	return 0; 
}
