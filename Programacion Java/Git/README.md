# Programacion Git UTN - PROFESOR: ARIEL BETANCUD
# ***Comandos Git***
## _Clase 1_
### pwd Vemos la ruta de la carpeta en la que estamos
### cd Es para navegar a una carpeta: change directory -> cambiar de directorio
### cd / Nos llava al home, en la raíz del disco
### cd ~ La virgulilla significa que estamos en el lugar de los documentos o del usuario
### ls Esto es listar los archivos, nos muestra todos los archivos en la raíz
![CapturaGit1](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/b5b93cd6-f105-4c3a-a5fa-aa92bc07e5cb)
### ls -al El espacio -al significa que es un argumento especial para ver archivos ocultos
![CapturaGit2](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/3d7ea6f1-265d-4ca1-b5f6-04114ad27386)
### ls -l Muestra casi todos los archivos sin los que están ocultos
![CapturaGit3](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/9f59e304-fc4d-476d-8b87-560e7c3a7153)
### ls -a Muestra el grupo de archivos pero no en una lista
![CapturaGit4](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/d301f1a0-2d76-4235-8bcb-453e0b5ca408)
### clear Limpia la consola o ctrl + l
### cd .. Nos devuelve a la carpeta anterior
### cd U + tab Esto se usa para un autocompletado o para buscar una referencia
### cd /D #Cambiamos de disco en window
![CapturaGit5](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/0c9a4705-fcf3-4117-97e4-640bdca30d2f)
### df -h #Muestra todos los directorios en Ubuntu
### cd /mnt/d #Cambia de directorio usando WSL Ubuntu en window

## AHORA COMENZAMOS CON LA CREACIÓN DE CARPETAS
### cd ..
### cd /mnt/c
### cd ~ #Vamos a la raíz
### mkdir TecnicaturaTUP (Ya tenia una carpeta tecnicatura.)
### cd tecnicatura
![CapturaGit6](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/6a0f3c90-6e6d-462a-9704-c3ff816a8d2b)
### mkdir Python
### mkdir Java
### mkdir JavaScript
![CapturaGit7](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/0050fb17-8c60-416b-b95d-69e7afd53038)

## _Clase 2_
### touch vacio.txt Crea un archivo con su extención: ESCRIBIR DENTRO
### ctrl + s Guardamos lo que escribimos en el archivo
### ./ Significa la carpeta actual
### ../ Significa la carpeta anterior
### cat vacio.txt Vemos el contenido del archivo
### history Veremos la historia completa de los comandos que hemos utilizado
### !72 + enter Veremos el comando que utilizamos en ese número
![CapturaGit8](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/d64d6810-9e31-48b7-9376-c53066b59acf)
### rm vacio.txt Borra el archivo seleccionado, ¡¡¡¡CUIDADO!!!!
### rm --help Muestra como funciona el comando
![CapturaGit9](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/44f57b0d-98c9-473c-bb32-83be8c475515)

## CREAR UN REPOSITORIO DE GIT Y HAZ TU PRIMER COMMIT
### cd tecnicatura
### mkdir class-git
### cd class-git Entramos en la carpeta que necesitamos trabajar
### git init Creamos un repositorio en la carpeta central, se crea el archivo .git
### code .  Abrimos VSC, el punto hace que se abra el archivo en el que estamos situados
### ctrl + n Creamos un archivo nuevo y escribimos en el, como lo hicimos antes
### ctrl + s Guardamos poniendo el nombre: historia.txt
### git status Vemos el estado del proyecto en tiempo real, esta en el área de trabajo
![CapturaGit10](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/55d5b855-d25d-4876-93a6-19149ae2263d)
### git add historia.txt Enviamos el archivo al área de preparación
### git status Para ver el estado de cambios
### git rm --cached historia.txt Quitamos el archivo del área de preparación, cached significa que esta en memoria ram
### git config Tendremos la lista de como funciona la configuración
![CapturaGit11](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/5207cfb6-e541-438d-aa11-1970a975b53b)
### git config --list Configuraciones por defecto, faltan cosas importantes
![CapturaGit12](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/2a175f3e-6c5f-4ccc-8e42-87485476c373)
### git config --list --show-origin Veremos donde están las configuraciones guardadas
![CapturaGit13](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/9a8f8457-572d-4495-93c2-ed60d1243e97)
### git config --global user.name "Maria Mercedes Atim"
### git config --global user.email "guerra.mercedes@hotmail.com" El correo debe ser el mismo que usaremos en GitHub
### git config --list Ahora veremos que ya están todos los datos completos
![CapturaGit14](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/ead3cb34-dd4c-4d5b-9cb6-f937ca8ebed4)
### git add . Ingresamos todos los archivos al área de preparación (ram)
### git commit -m "Mensaje importante del commit" El primer commit esta hecho
### code . Hacemos cambios en el archivo y guardamos
### git status Hay cambios para commitear
### git add .
### git commit -m "Mi segundo commit"
### git log historia.txt Vemos toda la historia de este archivo, el número largo es el hash del commit
![CapturaGit15](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/db99bc78-a0e8-4c50-b51c-4c4799795a5a)

## _Clase 3_
### cd tecnicatura Ingresamos al direcotorio donde están nuestras carpetas de trabajo
### ls Vemos los archivos y directorios que ya tenemos
### cd git No hay nada
### cd .. Salimos
### rm historia.txt Eliminamos el archivo que habíamos hecho, esto en git bash (window) esto es para practica
### rm Git rm: cannot remove 'Git': Is a directory
### rm --recursive -R Git By default, rm does not remove directories.  Use the --recursive (-r or -R) arguments option to remove each listed directory, too, along with all of its contents. Esto es para practica
![CapturaGit16](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/5349e449-0f7f-4f6b-aec3-a06477681993)
### rm --help Nos muestra lo que les puse arriba como documentación en Inglés.
![CapturaGit17](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/7794edff-f8f7-4c3a-9716-a87d1c7d2575)
### mkdir class-git Creamos la carpeta o directorio para trabajar en Git local por ahora.
### cd class-git Entramos para crear el README.md para este sector.
### touch README.md Vamos a crear un archivo nuevo, md significa markdown y se pueden trabajar con editores de texto, este es un lenguaje que transforma el texto a html.
### _Enlace a la documentación en GitHub de MARKDOWN_
### Leemos la documentación para ir creando en README.md como lo enseña GitHub.
### code . Abrimos VSC para editar el archivo.
### Empezamos a cargar lo visto en las clases anteriores (Comandos) en el README y pasamos a commitear
![CapturaGit18](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/b39ecc53-c22c-47ca-b741-62e656e7b6ca)
### git status
### git add .
### git status
### git commit -m "Cargamos el README dentro del directorio class-git"
![CapturaGit19](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/762ccf70-a8c0-41f5-a5ff-a6566c0277a0)
### git status
### git log Para ver los dos commits hechos: Si tienes commiteada alguna clase anterior veras mas commits de los que yo tengo.
![CapturaGit20](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/65ebcb16-1789-4655-b629-7e99b8841fc8)
### cd ..
### cd ..
![CapturaGit21](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/eca965a3-c083-45ff-a571-85395d65abeb)


## _Clase 4_
### TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.
### cd tecnicatura
### cd class-git
### ls
### touch historia.txt
### code .
![CapturaGit22](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/681bee6c-9985-4c58-a68b-b7c3c1166d2e)
### Modificamos el archivo historia.txt colocando lo siguiente: Bienvenido Mi nombre es Mercedes
### ctrl + s
### git status
### git add .
### git status
### git commit Sin agregar -m veremos que pasa
![CapturaGit23](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/eff438aa-1732-4aaf-8c1f-ab20ab2e8171)
![CapturaGit24](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/eb4abceb-c2e6-4e6e-8cd7-567be97e005a)
### Agregar mensaje y salir con Esc -Presionamos Escape 
### :wq! + enter Y ya salimos si estamos en git bash con window
### Esc + shift + z + z Salimos del mensaje para el commit, en linux, esto anda en algunas terminales
### Agregamos otra línea de mensaje en historia.txt desde VSC: estoy estudiando programación
### ctrl + s
### git add .
### git commit
### Se abre un editor de código basado en línea de comandos, editor de texto como VSC llamado vim
### Esc + i Para comenzar a escribir mensaje del commit, no suele ser necesario
### ctrl + x Para salir en linux
### s + enter #Para decir si al cambio y aceptar el nombre, ósea no cambiamos el nombre, la (s) es de si y la (y) es de yes, no olvidar enter en linux
![CapturaGit25](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/272e5820-6ac5-4597-b164-cf0a64506834)
### git show Vemos todos los cambios en el último commit
### git log historia.txt Vemos todos los commit
### q -Para salir del registro de commits
![CapturaGit26](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/032e4649-ad6d-4ce6-aeb7-b07be0e17782)
### Copiamos un hash mas antiguo y otro reciente, ingresamos el siguiente comando
### git diff hash_commit_numerico hash_commit_numerico Comparamos diferentes commits y sus cambios, poner la versión mas vieja primero, luego la mas nueva
### q -Para salir
![CapturaGit27](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/6980cec8-4814-4830-8236-a873425666e0)
### cd ..
### cd ..
### La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.

## _Clase 5_
### Teoria sobre GIT FLOW

## _Clase 6_
### Volver en el tiempo en nuestro repositorio utilizando reset y checkout parte 6  Ingresamos de la siguiente manera:
### Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.
## TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.
### cd tecnicatura
### cd class-git
### ls
### code .
### git log Vemos los commit hechos hasta ahora
### Copiar el hash El número largo que tiene el commit
![CapturaGit28](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/d8c99e45-35e8-43ce-ab94-1bdd765e93c5)
### git reset hash-nombre-commit Este nos permite volver a una versión anterior, hay 2 tipos de reset: el duro y el suave
### git status
### git add .
### git commit -m "Agregamos datos de estudios en historia.txt"
### git config --list Veremos la configuración que ya hemos hecho con en nombre y email
![CapturaGit29](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/d31ae48f-39a1-456d-b5f0-b98066a2bd5d)
### git reset hash-nombre-commit --hard Es el duro, todo vuelve a su estado anterior, es el más usado, desaparece todo
### git reset hash-nombre-commit --soft Este es el suave, lo que tengamos en staging segirá allí
### crear un archivo portafolio.html introducir el código y
### touch portafolio.html
### html : 5 #Con esto se carga el código básico de html y modificamos
### ctrl + s #Guardamos
### Clic derecho en VSC Open with Live Server para ver en el navegador
### git status
![CapturaGit30](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/eeacf387-32aa-4924-ad56-ad3f141b7926)
### ls
### ls -al
### git add .
### git status
### git commit -m "Agregamos el html para nuestro portafolio"
![CapturaGit31](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/a3387e0e-d6ee-431f-974e-0a4c41eb366d)
### creamos CSS #Este es un archivo de estilos, para esto creamos una nueva carpeta llamada css
### mkdir css
### ls
### cd css
### touch style.css creamos un archivo dentro: estilos.css le cargamos el código.
### ctrl + s abrimos en el navegador y todo esta allí, pero todo esto supuestamente en git no existe.
### git status tenemos cosas en el área de trabajo, en staging distintas
### git diff + enter y nos muestra los cambios en memoria ram y en disco
### git add . Agregamos todo al staging
### git status Ya esta todo en memoria ram, a git solo le importan los archivos, guarda las carpetas como rutas y automaticamente las crea
![CapturaGit32](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/2709b4e7-42c7-4719-8e47-c65b6823cd1d)
### git commit -m "Creamos el css para darle algo de estilo a nuestro portafolio"
### git log vemos lo nuevo que hemos hecho sin lo que borramos con el reset fuerte
![CapturaGit33](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/fbc2c4d8-4693-4dc6-8f74-e042131c543e)
### hacer cambios en historia.txt Cambiamos la última línea y ctrl + s 
### git diff
### git commit -am "cambio en la última línea del historia.txt"
### git log
### q  -Esto para salir
![CapturaGit34](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/511d8c58-506b-455f-b26b-690da7bcf487)
### git log --stat #veremos los cambios especificos que hicimos en cuales archivos por medio del commit y veremos los cambios en bits
### q -salimos de la línea de commits, ahora queremos ver como era originalmente el archivo, osea la primera versión, copiamos el nombre del primer commit
![CapturaGit35](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/42c92f11-a671-4dbc-8a7c-1bafd87b450b)
### git checkout hash-nombre-commit historia.txt Veremos el archivo en su estado original
### git status Nos sugiere hacer un commit, si lo hacemos borramos todo lo que hicimos antes, debemos seguir con el siguiente commando
### git checkout master historia.txt Volvemos a la versión master del archivo historia.txt, esto es muy peligroso
![CapturaGit36](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/dc1fda11-a96a-4250-a375-84e928ea6891)
### git checkout hash-nombre-commit historia.txt Volvemos a hacer esto y cambiamos cosas del archivo
### git commit -am "Reemplazo de una versión por otra de la historia"
### git log Veremos los cambios sin tocar ningun otro archivo, esta es la forma de volver a una versión hacía atrás y llevarla a la cabeza de la master
![CapturaGit37](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/fe47fbc0-0fc9-4548-8921-7f59d017ee5a)
### cd ..
### cd ..
### La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.

## _Clase 7_
### mkdir git_reset_test Vamos a hacer pruebas, es por esto que creamos una carpeta nueva
### cd git_reset_test Entramos en la carpeta
### git init Inicializamos el repositorio
### touch reset_file.txt
### git add reset_file.txt
### git commit -m "Iniciando el primer commit"
![CapturaGit38](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/1bf2743a-9378-48e4-9f15-f3cbb93b22a7)

## _Clase 8_
## ***Comandos para trabajo remoto con GIT***
### git clone url_del_servidor_remoto Nos permite descargar los archivos de la última versión de la rama principal y todo el historial de cambios en la carpeta .git
### git push Luego de hacer git add y git commit debemos ejecutar este comando para mandar los cambios al servidor remoto.
### git fetch Lo usamos para traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local (en caso de que hayan, por supuesto).
### git merge También usamos el comando git merge con servidores remotos. Lo necesitamos para combinar los últimos cambios del servidor remoto y nuestro directorio de trabajo.
### git pull Básicamente, git fetch y git merge al mismo tiempo.
![CapturaGit39](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/8ae9173b-821a-4e4d-ae92-7c7a309708d4)
## Adicionalmente, tenemos otros comandos que nos sirven para trabajar en proyectos muy grandes:
### git log --oneline Te muestra el id commit y el título del commit.
### git log --decorate Te muestra donde se encuentra el head point en el log.
![CapturaGit40](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/847778e3-2da5-422d-be09-51d80f4acac4)
### git log --stat Explica el número de líneas que se cambiaron brevemente.
![CapturaGit41](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/fc51d9ba-ad83-4849-933b-8364d145cb6d)
### git log -p Explica el número de líneas que se cambiaron y te muestra que se cambió en el contenido.
![CapturaGit42](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/685aa0c2-198e-43e5-bd8c-20bafa34c94f)
### git shortlog Indica que commits ha realizado un usuario, mostrando el usuario y el título de sus commits.
### git log --graph --oneline --decorate --all
![CapturaGit43](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/77187766-c39b-4ec2-b303-250459ed62ee)
### git log --pretty=format "%cn hizo un commit %h el dia %cd": Muestra mensajes personalizados de los commits.
![CapturaGit44](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/d6b90a3a-0d8a-4f6c-8064-4fbc34fc4c6a)
### git log -3 Limitamos el número de commits.
### git log --after=“2018-1-2”
![CapturaGit45](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/599f23b2-0cae-40d0-aad8-09deac461692)
### git log --after=“today” 
### git log --after=“2018-1-2” --before=“today” Commits para localizar por fechas.
![CapturaGit46](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/eb790d45-caaf-4e6e-967b-df3bfbebfb51)
### git log --author=“Name Author” Commits hechos por autor que cumplan exactamente con el nombre.
![CapturaGit47](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/a0d35120-3168-498a-8d73-8486e9ccaddb)
### git log --grep=“INVIE” Busca los commits que cumplan tal cual está escrito entre las comillas.
### git log --grep=“INVIE” –i Busca los commits que cumplan sin importar mayúsculas o minúsculas.
### git log – index.html Busca los commits en un archivo en específico.
### git log -S “Por contenido” Buscar los commits con el contenido dentro del archivo.
### git log > log.txt guardar los logs en un archivo txt
![CapturaGit48](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/b364297a-184e-41cb-8562-9e303b100e37)
### La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.

## _Clase 9_
### git branch nombre de la rama Con este comando se genera una nueva rama.
### git checkout nombre de la rama Con este comando puedes saltar de una rama a otra.
### git checkout -b rama #Genera una rama y nos mueve a ella automáticamente, Es decir, es la combinación de git branch y git checkout al mismo tiempo.
### git reset id-commit Nos lleva a cualquier commit no importa la rama, ya que identificamos el id del tag., eliminando el historial de los commit posteriores al tag seleccionado.
### git checkout rama-o-id-commit Nos lleva a cualquier commit sin borrar los commit posteriores al tag seleccionado.
---------------------------------------------------------------------------------------------------
### Abrir como adminstrados git bash En window
### cd Tecnicatura
### cd class-git
### code . En ubuntu
### code . En window, abrir como administrador
### ctrl + s Guardamos
### clic mouse derecho Abrimos en el navegador con Live Server vemos los cambios
### git status
### git commit -am "mensaje del commit" Este solo funciona con archivos creado previamente
### git commit -a -m "Mensaje del commit" Esto es lo mismo que el anterior
![CapturaGit49](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/60838f19-34d3-450b-bf5d-9fc48818e20a)
### git commit -a + enter Se abrira el entorno para editar el vim con el mensaje
### Escribir el mensaje
### ctrl + x
### s + enter No cambiar el nombre ni ruta de ubicación
### git log Veremos los cambios guardados
### q Para salir
![CapturaGit50](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/e8d1ddcc-96f4-47bd-831e-b049a82e5ff2)
### git log --stat Veremos los cambios nombrando cada archivo
### q Para salir
![CapturaGit51](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/cae7fb67-c0d5-4c44-b545-544e653d20c3)
### git branch Muestra en la rama que estamos, desde aquí crearemos una nueva
### git show Muestra el último cambio que hicimos, esto significa que desde el HEAD -> master es que haremos cambios
### q Para salir
### ctrl + l Limpiamos consola
![CapturaGit52](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/719962b9-38a6-490e-893b-b21f9fcbe2b4)
### git branch segunda creamos una nueva rama
### git show Nos muestra ahora que esta en el HEAD -> master, cabecera aquí es donde esta apuntando, es decir el último commit esta pegado a dos ramas distintas, aunque todavía estemos en master
### q Para salir
![CapturaGit53](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/1eadce40-33b1-406a-96ac-b16a7a12a3c2)
### git status No hay nada para hacer commit
### git chekout segunda Nos movemos hacía otras ramas, en este caso a segunda, esto no se ve en mac ni en ubuntu, para ver donde estamos hay que ingresar...
### git branch veremos en que rama estamos ubicados o ingresando...
### git status Veremos en que HEAD estamos apuntando
![CapturaGit54](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/86529139-1ffe-4daa-bcbc-38d11d5e391b)
### VSC hacemos cambios que veremos con Nico
### ctrl + s 
### F5 Actualizamos en el navegador para ver los cambios
### git status Veremos el archivo que modificamos
### git add .
### git commit
### vim escribimos el mensaje del commit
### ctrl + x
### s Para un si 
### enter Terminado el mensaje del commit
### git status No hay mas nada para commitear y estamos en la rama segunda
### git show Vemos todo lo que cambiamos
### q #Para salir
### git log Nos muestra donde estabamos con la rama master y el HEAD paso a la rama cabecera
### q Para salir
![CapturaGit55](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/241543c5-79b6-4a63-bfe3-956db5930e34)
### git checkout master Volvemos a la rama master, desaparese lo que habíamos hecho
### git log No muestra lo que hicimos en el portafolio
### q Para salir
### git checkout segunda Volvemos a ver todos los cambios que hicimos de nuevo
![CapturaGit56](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/5b6dc532-a039-4db2-9cee-acfd62e47361)
### La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.

## _Clase 10_
### git checkout master
### git merge segunda
![CapturaGit57](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/5784fd61-9423-48cf-a7ac-5656feaad818)
### Comandos básicos de GitHub:
### git init crear un repositorio, si ya esta en la nube traerlo sin hacer git init
### git add . agregar un archivo a staging.
### git commit -m “mensaje” guardar el archivo en git con un mensaje.
### git branch nombre_rama crear una nueva rama.
### git checkout nombre_rama moverse entre ramas.
### git push origin rama #mandar cambios a un servidor remoto.
![CapturaGit58](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/a4e65b2c-ab56-451b-927e-dac2f3cf49f3)
### git fetch #traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local.
### git merge rama #tiene dos usos. Uno es la fusión de ramas, funcionando como un commit en la rama actual, trayendo la rama indicada. Su otro uso es guardar los cambios de un servidor remoto en nuestro directorio.
### git pull origin rama #fetch y merge al mismo tiempo.
![CapturaGit59](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/a724f8a7-ec69-4275-93a1-3e702c20180e)
### git checkout “codigo de version” “nombre del archivo” #volver a la última versión de la que se ha hecho commit.
### git reset #vuelve al pasado sin posibilidad de volver al futuro, se debe usar con especificaciones.
### git reset --soft #vuelve a la versión en el repositorio, pero guarda los cambios en staging. Así, podemos aplicar actualizaciones a un nuevo commit.
### git reset --hard #todo vuelve a su versión anterior
### git reset HEAD #saca los cambios de staging, pero no los borra. Es lo opuesto a git add.
### git rm #elimina los archivos, pero no su historial. Si queremos recuperar algo, solo hay que regresar. se utiliza así:
### git rm --cached #elimina los archivos en staging pero los mantiene en el disco duro.
### git rm --force #elimina los archivos de git y del disco duro.
### git status #estado de archivos en el repositorio.
### git log #historia entera del archivo.
### git log --stat #cambios específicos en el archivo a partir de un commit.
![CapturaGit60](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/18cd08d9-4513-4e51-9263-38c898d9986a)
### git show #cambios históricos y específicos hechos en un archivo.
### git diff “codigo de version 1” “codigo de version 2” #comparar cambios entre versiones.
### git diff #comparar directorio con staging.
![CapturaGit61](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/49042e02-262f-4408-8f80-be20f0821509)

## Comando en producción: TUVE QUE SOLUCIONAR UN CONFLICTO
### git status #En rama segunda: hacemos cambios en el archivo y guardamos
### git commit -am "Finalizado el cambio en rama segunda" #enter
### git status
### git checkout master #perdemos todo lo que ya habíamos hecho, hacemos cambios en el archivo agregando un nuevo parrafo y guardamos
### git commit -am "Agregado el contenido adicional del archivo y un mejor aporte"
### git checkout segunda #vemos como desaparecen los cambios
### git checkout master #Aquí es que vamos a hacer el merge
![CapturaGit62](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/773363a1-e7fb-43dd-babd-57f25bb3a84f)
### git merge segunda #En mi caso tuve algunos conflictos que solucione a través de VSC, aclaro que nunca debemos utilizar Fusionar los dos cambios
### git commit -am "Arreglando conflicto" #Una vez solucionado debemos commitear
### git status #Debemos revisar en el navegador y en el código si algo quedo mal y cambiarlo
### git commit -am "Solucionado el conflicto 2"
### git merge segunda #ahora todo va bien
### git commit -am "Volvi a comentar en este caso de mi area laboral" #Añado información al archivo
### git log
### q #Para salir
![CapturaGit63](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/37a55d50-fb1e-465c-a905-b0da1cee9ce6)
### git commit -am "Para guardar estos cambios en el README.md"
### git checkout segunda
### git merge master #Traemos todos los cambios
### git commit -am "Cargamos esto ahora" #vamos a master y mergeamos
### git checkout master
### git merge segunda #y terminamos con esto
![CapturaGit64](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/6c30e63c-16fc-4bb5-bffc-b5acec5a9d2d)
### La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.

## _Clase 11_
## Cómo revertir un merge Si nos hemos equivocado y queremos cancelar el merge, debemos usar el siguiente comando:
### git merge --abort Los merges también son commits.
### git checkout segunda #falta lo que cargamos en master
### git merge master #traemos los cambios desde la master y tenemos las dos ramas actualizadas
## Ahora vamos a crear un conflicto para ver como salimos de el, vamos a cargar datos nuevos creando archivos html y css estando en la rama segunda, y también vamos a hacer lo mismo estando en la master y veremos como lo solucionamos.
### Abrimos el html y modificamos estando en la rama segunda
### Luego commiteamos en la rama segunda y pasamos a la rama master, guardar y commitear, hacer un merge estando en master: pongo en orden los comandos abajo.
### ctrl + s #Guardamos los cambios en la rama segunda, ponemos cambios en css
### git commit -am "Modifique el css y el color del texto" es un ejemplo
### git checkout master #Modificamos el html, ponemos código y css ponemos texto blue
### ctrl + s #Guardamos los cambios
### git commit -am "Agregue suscripción, cambie el código y puse todo azul en css"
### git merge segunda #Hacemos un merge estando en master y veremos el conflicto
![CapturaGit65](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/009cd019-cd84-44e7-9c5b-de7619bc7110)
### Para solucionar el conflicto podemos abrir el archivo con el editor de texto y modificar lo que nos este señalando y guardamos, esto en el css y en el html, lo podemos hacer desde VSC seleccionando: el cambio entrante.
### Debemos ahora commitear estos cambios, abajo pongo los comandos.
### git status
### git commit -am "Solución de conflictos al mergear las ramas"
### git checkout segunda #Seguiremos con la versión anterior, porque el merge fue en master
### git merge master #Ahora pasamos los cambios a la rama segunda.
![CapturaGit66](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/c985c793-3d37-44bf-9007-858040bae397)
### La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.

## _Clase 12_
## Cómo funcionan las llaves públicas y privadas TEORIA
 
## _Clase 13_
## Configura tus llaves SSH en local
## Comandos:
### abrir git bash #Esto en window
### abrir terminal #En ubuntu, y nos quedamos sin entrar a ningun proyecto o carpeta.
### git config -l #Recordamos nuestra configuración en Git, podemos hacer esto estando en la ruta de cualquier sitio en nuestro PC
![CapturaGit67](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/7ebe9bc1-f18f-492a-8d56-509c3c24e1ae)
### git config --global user.email "alumnos@mail.com" #Actualizamos el correo que usamos en GitHub.
### ssh-keygen -t rsa -b 4096 -C "alumnos@mail.com" #Dira que esta generando la llave pública y privada, también nos pregunta donde vamos a guardar la llave, presionamos enter, nos va a pedir otra contraseña
![CapturaGit68](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/5ec77ce7-3d5c-4bf9-8ead-fe51fdddaf37)
### eval $(ssh-agent -s) #Encendemos el servidor de llaves SSH, ya esta corriendo
### ~ #Se utiliza virgulilla para poner la ruta, es una variable que tiene el nombre de nuestra carpeta home, esto para el siguiente comando
### ssh-add ~/.ssh/id_ga35745 #Añadimos la llave, no la .pub ponemos la llave privada, recordar que es una ruta, se debe poner el nombre de la carpeta que contiene la clave privada.
![CapturaGit69](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/6bba6867-bf42-483f-8b1d-56c5ef66cda8)
## Cómo generar tus llaves SSH:
### a. Generar tus llaves SSH**
### Recuerda que es muy buena idea proteger tu llave privada con una contraseña.
### ssh-keygen -t rsa -b 4096 -C "tu@email.com"
### b. Terminar de configurar nuestro sistema.
### En Windows y Linux:
### Encender el “servidor” de llaves SSH de tu computadora:
### eval $(ssh-agent -s)
### Añadir tu llave SSH a este “servidor”:
### ssh-add ruta-donde-guardaste-tu-llave-privada
![CapturaGit70](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/9f82d6ca-82dc-4866-ad7d-46b59aa27c95)
## Por último les quiero hablar del 2FA: Segundo Factor de Autenticación. Este se puede hacer con varios dispositivos, y deberías hacerlo, ante el robo o perdida de un celular o ordenador, deberías tener un respaldo ante esto, este 2FA se puede hacer con diferentes generadores de códigos  de seguridad.
## Para añadir un 2FA:
### 1. Clic en nuestro perfil, arriba y a la derecha, seleccionamos...
### 2. Settings
### 3. Password and Authentication
### 4. GitHub Mobile: GitHub Mobile can be used for two-factor authentication by installing the GitHub Mobile app and signing in to your account. -> GitHub Mobile se puede utilizar para la autenticación de 2FA instalando la aplicación GitHub Mobile e iniciando sesión en su cuenta.
### Esto quiere decir que también se utiliza la app de GitHub donde al iniciar sesión desde cualquier dispositivo nos muestra un número que debemos ingresar en la app de nuestro dispositivo celular.
### 5. Authenticator app: Edit
### Esto para agregar a través de un QR una app que genere cada 1 segundo nuevos códigos numéricos para la autenticación, yo recomiendo la aplicación: Twilio Authy Authenticator
### Es recomendable iniciar sesión, osea registrarnos y guardar estos datos para que al cambiar un dispositivo sigamos teniendo acceso.
![CapturaGit71](https://github.com/MerAtim/ReadmePrgogramacion1/assets/127444671/04ae68c9-3532-42f1-8a3f-d88b1bf8c2a5)
### La tarea de hoy, agregar esta clase al README.md con el lenguaje de markdown, como lo hicimos en la clase pasada, luego deben hacer el commit correspondiente al cambio agregado.
