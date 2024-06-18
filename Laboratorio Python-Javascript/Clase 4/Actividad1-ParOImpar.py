# Solicitar al usuario que ingrese un numero, luego informarle si es par o impar

numero = int(input("Ingrese el numero a verificar: "))

if numero % 2 == 0:
    print(f'El numero {numero} es par')
else:
    print(f'El numero {numero} es impar')