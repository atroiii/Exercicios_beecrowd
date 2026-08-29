a, b = map(int, input().split())

duracao = (b - a)

if duracao == 0:
    duracao = 24
elif duracao < 0:
    duracao =  duracao + 24

print(f"O JOGO DUROU {duracao} HORA(S)")