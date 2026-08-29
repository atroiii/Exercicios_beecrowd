import math

def calcular_delta(a,b,c):#função para calcular o delta
    delta  = pow(b,2) - 4 * a * c
    return delta

def calcular_bhaskara(a,b,c,delta):#função para calcular bhaskara
    r1 = (-b+math.sqrt(delta)) / (2 * a)
    r2 = (-b-math.sqrt(delta)) / (2 * a)
    raizes = [r1,r2]#retorna uma lista com as duas raizes
    return raizes

a, b, c = map(float,input().split())# aqui funcionar da seguinte forma map pega e transforma tudo em float split pega todos os
#elementos a partir de um limitador no caso aqui o espaço e jogar dentro de um array
#a, b e c estão recebendo os valores via desetruturação
delta = calcular_delta(a,b,c)
j = 1

if a == 0 or delta < 0:
    print("Impossivel calcular")
else:
    raizes = calcular_bhaskara(a,b,c,delta)

    for i in raizes:
        print(f"R{j} = {i:.5f}")
        j += 1