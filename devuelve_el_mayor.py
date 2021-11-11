def el_mayor(num1,num2,num3):
    if(num1>num2):
        mayor=num1
    if(num3>num1):
        mayor=num3
    if(num2>num3):
        mayor=num2
    return(mayor)
def devuelve_el_mayor():
    num1=raw_input("Dime un numero:" )
    num2=raw_input("Dime otro numero: ")
    num3=raw_input("Dime uno mas: ")
    print("El mas grande es "+str(el_mayor(num1,num2,num3)))
devuelve_el_mayor()

