def area_triangulo(base, altura):
    return (base * altura) / 2

def area_raio_circulo(raio):
    pi = 3.14159
    return pi * pow(raio, 2)

def area_trapezio(base_maior,base_menor,altura):
    return ((base_maior + base_menor)* altura) /2

def area_quadrado(lado):
    return lado * lado

def area_retangulo(lado, altura):
    return lado * altura
try:
    a ,b , c = map(float, input().split())
    #explicação da linha acima isso e utilizando para pega
    #vários elementos de uma vez em python funciona da seguinte forma
    #map e meio que um casting para um lote de elementos para não precisar
    #utilizar um for para fazer um casting de cada elemento
    #a função map tem como pârametro o tipo para a conversão e o iteravel
    #ja input().split() faz a seguinte coisa o input vai ler a String que o usario digitar
    #e o split() pega a strings tira todos os espaços e joga dentro de um vetor
    #exemplo ser chegar 10 90.90 20 isso vai chegar como string então "10 90.90 20"
    #ele pega e faz isso aqui ['10','90.90','20']
    #após isso o map transforma cada item em float então [10,90.90,20]
    #como temos a,b,c = [10,90.90,20] acontecer um desestruturação
    #ou seja a = 10 b = 90.90 c = 20

    print(f"TRIANGULO: {area_triangulo(a,c):.3f}\n"
          f"CIRCULO: {area_raio_circulo(c):.3f}\n"
          f"TRAPEZIO: {area_trapezio(a,b,c):.3f}\n"
          f"QUADRADO: {area_quadrado(b):.3f}\n"
          f"RETANGULO: {area_retangulo(a,b):.3f}")
except (ValueError, TypeError):
    exit()
