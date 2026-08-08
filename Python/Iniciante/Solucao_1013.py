def maior_AB(a, b):
    return (a + b + abs(a - b)) / 2


a, b, c = map(int, input().split())
#map serve para percorrer um iteravel aplicador uma função e cada elemento
#.split pega todos os elementos com um espaço entre eles e joga dentro de um array
#a,b,c receber os elementos desse array via desetruturação
#o fluxo ocorre assim
# usuario digitou 10 20 30 isso chegar como um String entra "10 20 30"
#.split pega isso e coloca dentro de um array  ["10","20","30"]
#map vai pega cada elemento desse array e transforma todos em int então fica assim [10,20,30]
#a, b ,c recebem isso por meio de desetruturação ocorre isso aqui
# a = [0] b = [1] c = [2]

temp = maior_AB(a, b)#variavel para guarda o maior elemento entre a e b
if  temp > c: # ser o maior elemento entre entre a e b e maior que c então
    print(f"{int(temp)} eh o maior")
else:#senão
    print(f"{int(c)} eh o maior")
