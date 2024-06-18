numero = int(input("Ingrese un numero entre 1 y 3: "))
numeroTexto = ""
if numero == 1:
    numeroTexto = "Numero uno"
elif numero == 2:
    numeroTexto = "Numero dos"
elif numero == 3:
     numeroTexto = "Numero tres" 
else:
   numeroTexto = "Numero ingresado fuera de rango"

print(f'El numero ingresado es: {numero} - {numeroTexto}')