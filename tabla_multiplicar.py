def tabla_multiplicar():
    n=input("Que tabla deseas: ")
    print("TABLA DEL "+str(n))
    cont=0
    while(cont<11):
        print(str(n)" x "+str(cont)+" = "+str(cont*n))
        cont=cont+1
    
tabla_multiplicar()
    
