#include<stdio.h>

int main(){
	int x[10];
	int cont;
	float media;
	float suma=0;
	//for cont in range(1,10):
	for(cont=0;cont<=10;cont++){
		printf("Dame un numero: ");
		scanf("%d",&x[cont]);
		suma+=x[cont];
	}
	media=suma/cont;
	printf("\nLA MEDIA VALE= %f",media);
	return(0);


}
