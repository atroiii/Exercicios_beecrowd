
flag = False
lista_notas = [100,50,20,10,5,2,1]
lista_moedas = [0.50, 0.25, 0.10, 0.05, 0.01 ]
lista_moedas_vezes_100 = []
for x in lista_moedas:
    lista_moedas_vezes_100.append(x * 100)
try:
    contador_100 = contador_50 = contador_20 = contador_10 = contador_5 = contador_2 = contador_1 = contador_050 = contador_025 = contador_010 = contador_005 = contador_001 = 0
    entrada = float(input())

    while True:
        match entrada:
            case e if entrada >= 100:
                contador_100 = entrada // 100
                entrada = entrada % 100
            case e if 50 <= entrada < 100:
                contador_50 = entrada // 50
                entrada = entrada % 50
            case e if 20 <= entrada < 50:
                contador_20 = entrada // 20
                entrada = entrada % 20
            case e if 10 <= entrada < 20:
                contador_10 = entrada // 10
                entrada = entrada % 10
            case e if 5 <= entrada < 10:
                contador_5 = entrada // 5
                entrada = entrada % 5
            case e if 2 <= entrada < 5:
                contador_2 = entrada // 2
                entrada = entrada % 2
            case e if 1 <= entrada < 2:
                contador_1 = entrada // 1
                entrada = entrada % 1
            case e if entrada < 1:
                break
            case _:
                exit()

    if entrada == 0:
        flag = True
    entrada = entrada * 100

    while True:
        if flag:
            break
        match entrada:
            case e if 50 <= entrada < 100:
                contador_050 = entrada // 50
                entrada = entrada % 50
            case e if 25 <= entrada < 50:
                contador_025 = entrada // 25
                entrada = entrada % 25
            case e if 10 <= entrada < 25:
                contador_010 = entrada // 10
                entrada = entrada % 10
            case e if 5 <= entrada < 10:
                contador_005 = entrada // 5
                entrada = entrada % 5
            case e if 1 <= entrada < 5:
                contador_001 = entrada // 1
                entrada = entrada % 1
            case e if entrada == 0 or entrada < 1:
                break
            case _:
                exit()
except ValueError:
    exit()


print("NOTAS:")
print(f"{contador_100:.0f} nota(s) de R$ 100.00")
print(f"{contador_50:.0f} nota(s) de R$ 50.00")
print(f"{contador_20:.0f} nota(s) de R$ 20.00")
print(f"{contador_10:.0f} nota(s) de R$ 10.00")
print(f"{contador_5:.0f} nota(s) de R$ 5.00")
print(f"{contador_2:.0f} nota(s) de R$ 2.00")

print("MOEDAS:")
print(f"{contador_1:.0f} moeda(s) de R$ 1.00")
print(f"{contador_050:.0f} moeda(s) de R$ 0.50")
print(f"{contador_025:.0f} moeda(s) de R$ 0.25")
print(f"{contador_010:.0f} moeda(s) de R$ 0.10")
print(f"{contador_005:.0f} moeda(s) de R$ 0.05")
print(f"{contador_001:.0f} moeda(s) de R$ 0.01")
