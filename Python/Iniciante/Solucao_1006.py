try:
    def calcular_media(peso_a,peso_b,peso_c,x,y,z):# formula para o calculo da media
        return ((x*peso_a) + (y*peso_b) + (z*peso_c)) / (peso_a + peso_b + peso_c)

    peso_a = 2# declaração de peso A, B e C
    peso_b = 3
    peso_c = 5
    x = float(input())#leitura de X,Y e Z
    y = float(input())
    z = float(input())
    resultado = calcular_media(peso_a,peso_b,peso_c,x,y,z)# variavel resultado receber a função calcular media passando os argumentos acima
    print(f"MEDIA = {resultado:.1f}")# print com uma casa decimal
except (ValueError, TypeError):
    exit()