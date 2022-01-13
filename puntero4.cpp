#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main(){
	char aux[10];
	int longitud;
	char *lista[3];
	int cont;
	for(cont=0;cont<3;cont++){	
		printf("\nDime el nombre del rey %d: ",cont);
		scanf("%s",aux);
		longitud=strlen(aux);
		lista[cont]=(char *)malloc(longitud*sizeof(char));
		strcpy(lista[cont],aux);
	}
	printf("\n LOS 3 REYES MAGOS SON: ");
	for(cont=0;cont<3;cont++){
		printf("\n %s",lista[cont]);
	}
	return(0);

}

