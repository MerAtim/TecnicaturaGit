'''Ejercicio: Tienda de libros
Mostrar: Ingrese los siguientes datos del libro
Digite el nombre del libro
Digite el ID del libro
Digite el precio del libro
Indicar si el envío es gratuito (True/False)
Mostrar:
	Nombre:
	ID: 
	Precio:
	Envío Gratuito?:'''

titulo = input("Ingrese el titulo del libro: ")
idLibro = input("Ingrese el codigo del libro: ")
precio = float(input("Ingrese el precio del libro: "))
envioGratuito = input("Es gratuito el envío SI/NO: ").upper()


if envioGratuito == "SI":
   envioGratuito = True
elif envioGratuito == "NO":
    envioGratuito = False
else:
   envioGratuito = "Ingrese si o no, por favor."


print(f'Nombre: {titulo}\nId: {idLibro}\nPrecio: $ {precio}\nEnvío gratuito: {envioGratuito}')