def mayor():
  
    suma=0
    num=input("dame un numero")
    mayor=num
    menor=num
    suma=suma+num
    for cont in range(1,4):
        num=input("dame un numero")
        if(num>mayor):
            mayor=num
        if(num<menor):
            menor=num
        suma=suma+num
    media=suma/4
    print("MAYOR= "+str(mayor))
    print("MENOR= "+str(menor))
    print("MEDIA= "+str(media))


    

mayor()
