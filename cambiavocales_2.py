def cambiavocales_2():
    palabra=raw_input("Dime una palabra ")
    vocal=raw_input("Dime una vocal ")
    cont=0
    while(cont<len(palabra)):
        if(palabra[cont]=='a'):
           print(vocal)
        else:
            if(palabra[cont]=='u'):
                print(vocal)
            else:
                if(palabra[cont]=='i'):
                    print(vocal)
                else:
                    if(palabra[cont]=='o'):
                        print(vocal)
                    else:
                        if(palabra[cont]=='e'):
                            print(vocal)
                        else:
                            print(palabra[cont])
        cont=cont+1
           
    print("palabra transformada "+palabra)

cambiavocales_2()
