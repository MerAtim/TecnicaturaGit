# Calcular la suma de 'n' primeros números.

n = int(input('Ingrese la cantidad de números a sumarse: '))

suma = 0
contador = 0

while contador <= n:
    suma += contador
    contador += 1
else:
    print('Fin del ciclo.')

print('La suma de los primeros', n, 'números es:', suma)