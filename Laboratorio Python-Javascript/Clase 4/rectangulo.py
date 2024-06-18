# Calcular area y perimetro de un rectángulo. Solicitar al usuario Base y altura
altura = int(input("Por favor, ingrese el alto del rectangulo: "))
base = int(input("Por favor, ingrese el ancho del rectangulo: "))
area = base * altura
perimetro = 2*(base + altura)

print(f'El área del rectángulo es: {area} y el perímetro es {perimetro}')