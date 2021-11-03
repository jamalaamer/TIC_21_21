def fecha_mes():
    fecha=raw_input("Dime una fecha(dd/mm/aa): ")
    meses="EneFebMarAbrMayJunJulAgoSepOctNovDic"
    int(fecha[3])
    int(fecha[4])
    mimes=(int(fecha[3])*10)+(int(fecha[4]))
    mes_elegido=meses[(mimes-1)*3:(mimes-1)*3+3]
    print("Enhorabuena estas en "+str(mes_elegido))



fecha_mes()
        
