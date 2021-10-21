def cambiavocales():
    palabra=raw_input("Dime una palabra ")
    cont=0
    while(cont<len(palabra)):
        if(palabra[cont]=='a'):
           print('e')
        else:
            if(palabra[cont]=='u'):
                print('e')
            else:
                if(palabra[cont]=='i'):
                    print('e')
                else:
                    if(palabra[cont]=='o'):
                        print('e')
                    else:
                        print(palabra[cont])
        cont=cont+1
           
    print("palabra transformada "+palabra)

cambiavocales()
