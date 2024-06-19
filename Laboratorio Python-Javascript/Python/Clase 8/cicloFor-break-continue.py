cadena = "python"
contador = 0
for letra in cadena:
    print(letra)
else:
    print("Fin del ciclo For")

print("")

for letra in "Alemania":
    if letra == "a":
        contador += 1
        print(f"Letra {letra} encontrada {contador} veces.")
        break # Encuentra el elemento la primera vez y corta con el ciclo
else:
    print("Fin del ciclo For")

print("")

for i in range(6):
    if i % 2 == 0:
        print(f'Valor: {i}')

print("")

for i in range(6):
    if i % 2 != 0:
        continue
    print(f'Valor: {i}')