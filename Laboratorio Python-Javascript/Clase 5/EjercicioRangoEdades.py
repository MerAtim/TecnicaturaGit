# Solicitar al usuario la edad y verificar si se encuentra dentro del rango de 20 o 30 años
edad = int(input("Ingrese su edad: "))
if edad >= 20 and edad <= 30:
    print(f'Usted tiene {edad} años, se encuentra dentro del rango de 20 a 30 años')
else:
    print(f'Usted tiene {edad} años, no se encuentra dentro del rango de 20 a 30 años')