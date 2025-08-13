#Ejercicio 1
edad=int(input("Ingrese su edad: "))
print("Es mayor de edad") if(edad>18) else print("Es menor de edad")

#Ejercicio 2
nota= int(input("Escriba su nota: "))
if nota >= 6:
    print("Esta aprobado")
else:
    print("Esta desaprobado")

#Ejercicio 3
num=int(input("Ingrese un numero par: "))
print("Ha ingresado un numero par") if(num%2==0) else print("Por favor, ingrese un numero par")

#Ejercicio 4
edad= int(input("Escriba su edad: "))
if edad < 12:
    print("Niño/a")
elif edad >= 12 or edad <18:
    print("Adolecente")
elif edad >= 18 or edad <30:
    print("Adulto/a joven")
else:
    print("Esta desaprobado")

#Ejercicio 5
password=input("Ingrese su contraseña, debe tener entre 8 y 14 caracteres: ")
print("Ha ingresado una contraseña correcta") if(len(password)>=8 and len(password)<=14) else print("Por favor, ingrese una contraseña de entre 8 y 14 caracteres")

#Ejercicio 6
from statistics import mode, median, mean
import random
aleatorios = [random.randint(1, 100) for i in range(50)]
moda=mode(aleatorios)
media=mean(aleatorios)
mediana=median(aleatorios)
if(media>mediana>moda):
    print("Sesgo positivo o a la derecha")
elif(media<mediana<moda):
        print("Sesgo negativo o a la izquierda")
else:
    print("sin sesgo")

#Ejercicio 7
palabra=input("Ingrese una palabra: ")

if palabra[-1].lower() in "aeiou":
    palabra +="!"

print(palabra)

#Ejercicio 8
name = input("Escriba su nombre: ")
print("1: Si quiere su nombre en mayúsculas.")
print("2: Si quiere su nombre en minúsculas.")
print("3: Si quiere su nombre con la primera letra mayúscula.")
formato = int(input("Escriba que opcion quiere indicando con el numero correspondiente: "))
if formato == 1 :
    change1 = name.upper()
    print(change1)
elif formato == 2: 
    change2 = name.lower()
    print(change2)
else:
    change3 = name.title()
    print(change3)

#Ejercicio 9
magnitud=int(input("ingrese la magnitud del terremoto: "))
if(magnitud<3):
    print("Muy leve")
elif(magnitud>=3 and magnitud<4):
    print("Leve")
elif(magnitud>=4 and magnitud<5):
    print("Moderado")
elif(magnitud>=5 and magnitud<6):
    print("Fuerte")
elif(magnitud>=6 and magnitud<7):
    print("Muy fuerte")
elif(magnitud>=7):
    print("Extremo")

#Ejercicio 10
hemisferio=input("Ingrese su hemisferio (N/S): ")
if(hemisferio.lower() == "s"):
    hemisferio=1
elif(hemisferio.lower() == "n" ):
    hemisferio=0

mes_num=int(input("Ingrese el numero de mes  "
"1-Enero " \
"2-Febrero " \
"3-Marzo " \
"4-Abril " \
"5-Mayo " \
"6-Junio " \
"7-Julio " \
"8-Agosto " \
"9-Septiembre " \
"10-Octubre " \
"11-Noviembre " \
"12- Diciembre:\n "))

dia=int(input("Ingrese el dia del mes: "))

if (mes_num==12 and dia>=21) or mes_num in [1,2,] or (mes_num == 3 and dia <= 20) :
    norte="invierno"
    sur="verano"
elif (mes_num == 3 and dia >= 21) or mes_num in [4, 5] or (mes_num == 6 and dia <= 20):
    norte="primavera"
    sur="otoño"
if (mes_num == 6 and dia >= 21) or mes_num in [7, 8] or (mes_num == 9 and dia <= 20):
    norte="verano"
    sur="invierno"
if (mes_num == 9 and dia >= 21) or mes_num in [10, 11] or (mes_num == 12 and dia <= 20):
    norte="otoño"
    sur="primavera"

if(hemisferio==0):
    print(f"Estacion = {norte}")
elif(hemisferio==1):
    print(f"Estacion = {sur}")
else:
    print("error")