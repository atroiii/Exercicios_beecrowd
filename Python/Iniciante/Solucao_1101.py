
while True:
    soma = 0
    lista = []
    n,m = map(int,input().split())
    if n <= 0 or m <= 0:
        break
    if n > m:
        for i in range(m, n+1):
            lista.append(i)
            soma += i
    else:
        for i in range(n, m+1 ):
            lista.append(i)
            soma += i
    lista_str = map(str,lista)
    lista_str = " ".join(lista_str)

    print(f"{lista_str} Sum={soma}")
