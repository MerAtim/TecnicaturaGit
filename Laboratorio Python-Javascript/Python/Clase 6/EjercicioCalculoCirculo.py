# Hacer un programa para ingresar el radio de un circulo y se reporte su área y la longitud de la circunferencia.

import math
radio = float(input("Ingrese el radio del círculo: "))
area = math.pi * radio ** 2
longitud = 2 * math.pi * radio
print(f"El área del círculo es: {area} y la longitud de la circunferencia es: {longitud}")