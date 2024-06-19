# Pedir al usuario que ingrese un mes del año, el valor debe ser entre 1 y 12, 
# luego le decimos en que estacion del año esta: Verano: del 21/12 al 21/03 mes: 1, 2 y 3. 
# Otoño: del 21/03 al 21/06 mes: 4, 5 y 6. Invierno: 22/06 al 21/09 mes: 7, 8 y 9, Primavera: 21/09 al 21/12 mes: 10, 11, 12

mes = int(input("Ingrese un mes del año del 1 al 12 para verificar en que estación está: "))

if 1 <= mes <= 12:
    meses = {
    1: "Enero", 2: "Febrero", 3: "Marzo", 4: "Abril", 5: "Mayo", 6: "Junio",
    7: "Julio", 8: "Agosto", 9: "Septiembre", 10: "Octubre", 11: "Noviembre", 12: "Diciembre"
    }
    nombreDelMes = meses[mes]

    if mes in (1, 2, 3):
        print(f"El mes {mes}, {nombreDelMes}, está en la estacion Verano")
    elif mes in (4, 5, 6):
        print(f'El mes {mes}, {nombreDelMes}, está en la estacion Otoño')
    elif mes in (7, 8, 9):
        print(f'El mes {mes}, {nombreDelMes}, está en la estacion Invierno')
    elif mes in (10, 11, 12):
        print(f'El mes {mes}, {nombreDelMes}, está en la estacion Primavera')
else:
    print("Número de mes no válido. Por favor ingrese un valor entre 1 y 12.")