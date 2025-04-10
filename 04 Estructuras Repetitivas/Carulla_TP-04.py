#Ejercicio 1
for i in range(101):
    print(i)

#Ejercicio 2
Digitos=0
num = int(input("Ingrese un numero: "))

while num > 0:
    num=num//10
    Digitos +=1

print("La cantidad de digitos es: " , Digitos)

    #Ejercicio 3
min=int(input("Ingrese el valor minimo: "))
max=int(input("Ingrese el valor maximo: "))
suma=0
for i in range(min+1, max):
    suma+=i
print(suma)

#Ejercicio 4
Suma=0
num= int(input("Ingrese un numero: "))
Suma += num
while num != 0:
    num= int(input("Ingrese un numero: "))
    Suma += num

print ("La suma de los numeros ingresados es de: ", Suma)

#Ejercicio 5
import random
numRandom=random.randint(1,9)
num=0
intentos=0
while num!=numRandom:
    intentos+=1
    num=int(input(f"Intento N° {intentos}\nIngrese su numero para adivinar: "))
print(f"NUMERO ADIVINADO\nEl numero era el: {numRandom}")

#Ejercicio 6
for i in range(100,0,-2):
    print(i)

#Ejercicio 7
max=int(input("Ingrese el valor maximo: "))
suma=0
for i in range(max+1):
    suma+=i
print(suma)

#Ejercicio 8
pares=0
impares=0
positivos=0
negativos=0
for i in range(0,101):
    num=int(input("Escriba un numero: "))
    if num % 2 == 0:
        pares+=1
    elif num % 2 == 1:
        impares+=1
    if num >=0:
        positivos+=1
    else:
        negativos+=1
print("Los numeros pares son:",pares)
print("Los numeros impares son:",impares)
print("Los numeros positivos son:",positivos)
print("Los numeros negativos son:",negativos)

#Ejercicio 9
cant=100
suma=0
for i in range(cant):
    num=int(input("Ingrese el numero a sumar: "))
    suma+=num
print(f"El promedio de los numeros ingresados es: {suma/cant}")


#Ejercicio 10
num_invertido=0
num = int(input("Ingrese un numero: "))

while num > 0:
    digito=num%10
    num_invertido= num_invertido*10 + digito
    num =num//10

print("El numero inveritdo es : " , num_invertido)