def devuelve_el_mayor_2():
    mayor=input("Dame un numero: ")
    for cont in range(1,11):
        num=(input("Dame otro numero: "))
        if (num>mayor):
            mayor=num
    print(mayor)
devuelve_el_mayor_2()
