#ej1
precios_frutas = {'Banana': 1200, 'Ananá': 2500, 'Melón': 3000, 'Uva':1450}
precios_frutas["naranja"]=1200
precios_frutas["manzana"]=1500
precios_frutas["pera"]=2300

#ej2
precios_frutas["Banana"]=1330
precios_frutas["manzana"]=1700
precios_frutas["Melón"]=2800

#ej3
lista_frutas=[precios_frutas.keys()]
print(lista_frutas)

#ej4
lista_numeros={}
for i in range(1,6):
    clave=input("Ingrese su nombre: ")
    valor=int(input("Ingrese su numero: "))
    lista_numeros[clave]=valor
    print("contacto agendado con exito!")

#ej5
frase=input("Ingrese una frase: ")
palabras_unicas=set(frase.split())
palabras=frase.split()
print(palabras)
frecuencia={}
for palabra in palabras:
    if palabra in frecuencia:
        frecuencia[palabra]+=1
    else:
        frecuencia[palabra]=1

print(palabras_unicas)
print(frecuencia)

#ej 6
nombre_notas={}
for i in range(1,4):
    nombre=input(f"ingrese el nombnre del alumno {i}: ")
    notas=input(f"ingrese las notas del alumno {nombre} separadas por espacios: ")
    nombre_notas[nombre]=tuple(map(float,notas.split()))


print("promedios: ")
for nombre, notas in nombre_notas.items():
    promedio= sum(notas) / len(notas)
    print(f"promedio de {nombre}: {promedio}")

#ej7
parcial1={1,2,3,4,6,8}
parcial2={2,5,7,8,9,10}

print(f"aprobaron ambos: {(parcial1.intersection(parcial2))}")
print(f"aprobaron uno de los dos: {(parcial1.difference(parcial2))} {(parcial2.difference(parcial1))}")
print(f"aprobaron al menos uno: {(parcial1.union(parcial2))}")