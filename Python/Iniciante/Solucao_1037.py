def esta_em_qual_intervalo(num):
    match num:
        case s if  0 <= num <= 25:
            print("Intervalo [0,25]")
        case s if 25 < num <= 50:
            print("Intervalo (25,50]")
        case s if 50 < num <= 75:
            print("Intervalo (50,75]")
        case s if 75 < num <= 100:
            print("Intervalo (75,100]")
        case _:
            print("Fora de intervalo")

num = float(input())
esta_em_qual_intervalo(num)