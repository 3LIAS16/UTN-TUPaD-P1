# ejercicio 1

def imprimir_hola_mundo():
    print("Hola Mundo!")

imprimir_hola_mundo()

#Ejercicio 2
def saludar_usuario(nombre):
    print("Hola " + nombre)

name=input("ingrese su nombre: ")
saludar_usuario(name)


# ejercicio 3

def informacion_personal(nombre, apellido, edad, residencia):
    print(f"Soy {nombre} {apellido}, tengo {edad} aÃ±os y vivo en {residencia}")


nombre = input("Ingrese su nombre: ")
apellido= input("Ingrese su apellido: ")
edad = int(input("Ingrese su edad: "))
residencia = input("Ingrese su residencia: ")
informacion_personal(nombre, apellido, edad, residencia)

#Ejercicio 4
import math
def calcular_area_circulo(radio):
    area=math.pi*radio**2.0
    return area
def calcular_perimetro_circulo(radio):
    perimetro=2*math.pi*radio
    return perimetro

r=int(input("Ingrese el radio: "))
print(calcular_area_circulo(r))
print(calcular_perimetro_circulo(r))



# ejercicio 5

def segundos_a_horas(segundos):
    horas=0
    horas=segundos/3600
    print(f"La cantidad de horas son: {horas}")

segundos= int(input("Ingrese la cantidad de segundos: "))
segundos_a_horas(segundos)


#Ejercicio 6
def tabla_multiplicar(numero):
    for i in range (1,11):
        print(f"{numero} X {i} = {numero*i}")

num=int(input("ingrese un numero: "))
tabla_multiplicar(num)



# ejercicio 7

def operaciones_basicas(a, b):
    suma= a+b
    resta= a-b
    div= a/b
    multi= a*b
    print(f"La suma de los numeros ingresados es: {suma}")
    print(f"La resta de los numeros ingresados es: {resta}")
    print(f"La division de los numeros ingresados es: {div}")
    print(f"La multiplicacion de los numeros ingresados es: {multi}")



a=int(input("Ingrese el primer numero: "))
b=int(input("Ingrese el segundo numero: "))
operaciones_basicas(a,b)


#Ejercicio 8
def calcular_imc(peso, altura):
    imc=peso/altura**2
    print(imc)

peso=float(input("Ingrese su peso en kg: "))
altura=float(input("Ingrese su altura en Metros: "))

calcular_imc(peso,altura)




# ejercicio 9

def celsius_a_fahrenheit(celsius):
    grados= ((celsius* 1.8)+32)
    print(f"La temperatura en fahrenheit es de: {grados}")


celsius= float(input("Ingrese los grados celcius a convertir: "))
celsius_a_fahrenheit(celsius)


#Ejercicio 10
def calcular_promedio(a,b,c):
    promedio=(a+b+c)/3
    print(promedio)

a=int(input("Ingrese el primero numero: "))
b=int(input("Ingrese el segundo numero: "))
c=int(input("Ingrese el tercer numero: "))

calcular_promedio(a,b,c)