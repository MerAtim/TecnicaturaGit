# Se pide al usuario 3 valores de a, b, c para resolver la siguiente ecuación:
# a3 * (b2 - 2ac)/2b
a = float(input("Ingrese el valor de a: "))
b = float(input("Ingrese el valor de b: "))
c = float(input("Ingrese el valor de c: "))

resultado = (a**3 * (b**2 - 2*a*c)) / (2*b)
print(f'El resultado es {resultado}')
