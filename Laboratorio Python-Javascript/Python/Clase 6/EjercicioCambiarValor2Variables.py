# Intercambiar el valor de dos variables.

a = input("Ingrese el valor de a: ")
b = input("Ingrese el valor de b: ")
auxiliar = ""

auxiliar = a
a = b
b = auxiliar

print(f'Ahora a vale: {a} y b vale: {b}')