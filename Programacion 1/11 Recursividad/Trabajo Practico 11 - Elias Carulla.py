#Ejercicio 1
def fact(n):
    if(n==1):
        return 1
    else:
        return n*fact(n-1)

num=int(input("calcular los factoriales hasta el numero: "))

for i in range (1,num+1):
    print(f"factorial de {i}: {fact(i)}")


#ejercicio 2
def fibo(n):
    if n==0:
        return 0
    elif n==1:
        return 1
    else:
        return fibo(n-1)+fibo(n-2)

num=int(input("calcular la serie fibonacci hasta el numero: "))

for i in range (1,num+1):
    print(f"serie de fibonacci de {i}: {fibo(i)}")

#ejercicio 3
def potencia(n,m):
    if m==1:
        return 1
    else:
        return n*n**(m-1)

n=int(input("ingrese numero para calcular su potencia: "))
m=int(input("ingrese el exponente del numero: "))

print(potencia(n,m))

#ejercicio 4
def binario(n):
    if n<2:
        return str(n)
    else:
        return binario(n//2) + str(n%2)

n=int(input("ingrese numero para convertir a binario: "))


print(binario(n))

#ejercicio 5
def palindromo(p):
    if len(p) <=1:
        return True
    
    if p[0] != p[-1]:
        return False
    
    return palindromo(p[1:-1])

p=input("ingrese una palabra: ")
print("es palindromo") if palindromo(p) else print("no es palindromo")

#ejercicio 6
def SumaDigitos(n):
    if(n<10):
        return n
    else:
        return n%10 + SumaDigitos(n//10)

n=int(input("ingrese numero para sumar sus digitos: "))

print(SumaDigitos(n))

#Ejercicio 7
def Contar_bloques(n):
    if(n==1):
        return 1
    else:
        return n+Contar_bloques(n-1)

num=int(input("ingrese bloques del nivel mas bajo: "))
print(Contar_bloques(num))

#Ejercicio 8

def contar(n, valor):
    if n < 10:
        return 1 if n == valor else 0
    elif(n%10==valor):
        contador=1
    else:
        contador=0
    return contador + contar(n//10, valor)

num=int(input("Ingrese un numerito: "))
valor=int(input("ingrese el valor a buscar (entre 0-9): "))

print(contar(num,valor))