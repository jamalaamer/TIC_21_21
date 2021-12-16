#include<stdio.h>

int main(){
	char letras[5];
	int cont;
	//for cont in range(1,10):
	for(cont=0;cont<=5;cont++){
		printf("Introduce la letra %d: ",cont);
		scanf(" %c",&letras[cont]);
	}
	printf("\nHas escrito la palabra: ");
	for(cont=0;cont<=5;cont++){
		printf("%c",letras[cont]);
	}
	
	return(0);
}

