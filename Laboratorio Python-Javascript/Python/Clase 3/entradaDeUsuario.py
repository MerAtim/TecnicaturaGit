# Procesar la entrada del usuario
# Funcion input regresa un dato tipo String
resultado = input("Digite un número: ")
print(resultado)

# Conversion de la entrada de datos
numero1 = input("Escribe tu primer numero: ") # tambien podemos encerrar la funcion input con int()
numero2 = input("Escribe el segundo numero: ")
resultado = int(numero1) + int(numero2)
print("El resultado de la suma es: ", resultado)