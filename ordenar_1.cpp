#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main(){
	char aux[10];
	int longitud;
	char *mispalabras[5];
	int cont;
	for(cont=0;cont<5;cont++){	
		printf("\nDime la palabra %d: ",cont);
		scanf("%s",aux);
		longitud=strlen(aux);
		mispalabras[cont]=(char *)malloc(longitud*sizeof(char));
		strcpy(mispalabras[cont],aux);
	}
	printf("\n LAS 5 PALABRAS SON: ");
	for(cont=0;cont<5;cont++){
		printf("\n %s",*(mispalabras+cont));
	}
	return(0);

}

