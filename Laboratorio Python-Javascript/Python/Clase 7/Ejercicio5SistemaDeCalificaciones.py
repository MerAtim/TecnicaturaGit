'''El objetivo del programa será crear un sistema de calificaciones de la siguiente manera:
Pedirle al usuario que ingrese un valor del 1 al 10, si este ingresa:
9 o 10: Imprimir ‘A’.
Entre 8 y menor a 9: Imprimir ‘B’.
Entre 7 y menor a 8: Imprimir ‘C’.
Entre 6 y menor a 7: Imprimir ‘D’.	
0 y menor a 6: Imprimir ‘F’.
De lo contrario, el valor ingresado será ‘Incorrecto’.'''

calificacion = float(input("Por favor, ingrese la calificación: "))
mensaje = None

if 9 <= calificacion <= 10:
    mensaje = "A"
elif 8 <= calificacion < 9:
    mensaje = "B"
elif 7 <= calificacion < 8:
    mensaje = "C"
elif 6 <= calificacion < 7:
    mensaje = "D"
elif 0 <= calificacion < 6:
    mensaje = "F"
else:
    mensaje = None

if mensaje is not None:
    print(f"La calificacion {calificacion} es {mensaje}")
else:
    print("El valor ingresado es incorrecto.")