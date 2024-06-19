# Realizar un programa que, cuando el usuario ingrese su edad, 
# le diga o imprima la etapa de vida en la que se encuentra en una breve oración:
edad = int(input("Ingrese su edad: "))
mensaje = None;

if 0 <= edad <= 10:
    mensaje = "La infancia es increíble y bella."
elif 11 <= edad <= 19:
    mensaje = "Tienes muchos cambios, mucho que estudiar."
elif 20 <= edad <= 29:
    mensaje = "Amor y comienza el trabajo."
elif 30 <= edad <= 39:
    mensaje = "Tiempo de consolidar tu vida."
elif 40 <= edad <= 49:
    mensaje = "Madurez y responsabilidades plenas."
elif 50 <= edad <= 59:
    mensaje = "La sabiduría se refleja en cada decisión."
elif 60 <= edad <= 69:
    mensaje = "Una nueva aventura comienza con la jubilación."
elif 70 <= edad <= 79:
    mensaje = "Tiempo de disfrutar los frutos del trabajo."
elif 80 <= edad <= 89:
    mensaje = "Cada día es un regalo, lleno de recuerdos."
elif 90 <= edad <= 99:
    mensaje = "Las historias y experiencias son tesoros para compartir."
elif 100 <= edad <= 110:
    mensaje = "Más de un siglo de vida, un siglo de sabiduría."
else:
    mensaje = "Edad fuera de rango"

if mensaje is not None:
    print(mensaje)