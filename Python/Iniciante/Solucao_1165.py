import math


lista_numeros = []
flag = True
n = 0

while flag:
    n = int(input())
    if 1 < n <= 100:
        flag = False
while len(lista_numeros) != n:
    numeros = int(input())
    if 1 < numeros <= 10**7:
        lista_numeros.append(numeros)

for numeros in lista_numeros:
    flagPrimos = True
    for divisores in range(2, int(math.sqrt(numeros))+1):
        if numeros % divisores == 0:
            flagPrimos = False
            break
    if flagPrimos:
        print(f"{numeros} eh primo")
    else:
        print(f"{numeros} nao eh primo")


