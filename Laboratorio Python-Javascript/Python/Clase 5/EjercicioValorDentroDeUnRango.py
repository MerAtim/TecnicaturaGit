# Verificar si el numero ingresado esta entre el rango de 0 a 5
numero = int(input("Por favor, ingrese un numero: "))

if numero >= 0 and numero <= 5:
    print(f'El numero {numero} se encuentra dentro del rango de 0 a 5')
else:
    print(f'El numero {numero} no se encuentra dentro del rango de 0 a 5')