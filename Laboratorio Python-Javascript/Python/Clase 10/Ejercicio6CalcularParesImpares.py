# Ingresar N números enteros, visualizar la suma de los números pares de la lista. 
# ¿Cuántos números pares existen y cuál es el promedio de los números impares?

def sumaParesYPromedioImpares():
    lista = []
    while True:
        numero = input("Ingrese un número (o 's' para salir): ")
        if numero.lower() == 's':
            break
        lista.append(int(numero))

    sumaPares = sum(numero for numero in lista if numero % 2 == 0) # Suma cada numero par de la lista
    contadorPares = sum(1 for numero in lista if numero % 2 == 0) # Suma 1 al contador por cada numero par de la lista
    impares = [numero for numero in lista if numero % 2 != 0] # Crea una lista con los numeros impares de la lista
    promedioImpares = sum(impares) / len(impares) if impares else 0 # Calcula el promedio de los impares de lo contrario, el promedio es 0

    print("La suma de los números pares es:", sumaPares)
    print("La cantidad de números pares es:", contadorPares)
    print("El promedio de los números impares es:", promedioImpares)

sumaParesYPromedioImpares()