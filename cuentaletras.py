def cuentaletras():
    palabra=raw_input("dime una palabra: ")
    cont=0
    for letra in palabra:
        if letra in "aeiou":
            cont+=1
    print(str(cont)+ " vocales")
    for letra in palabra:
        if letra in"rtypsdfghjklzxcvbnm":
            cont+=1
    print(str(cont)+ " letras")

cuentaletras()
    
