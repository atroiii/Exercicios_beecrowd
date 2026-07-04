import math#Biblioteca matematica
n = 3.14159#Python não possui constante
def calcular_area_circulo(raio):#metodo para calcular a area do circulo
    area = n * (math.pow(raio,2))#formular
    return area #retorno do metodo
raio = float(input())#entrada do usuario
print(f"A={calcular_area_circulo(raio):.4f}")#saida usado o metodo com a formatação :.4 para 4 casas decimais