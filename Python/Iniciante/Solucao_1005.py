try:

    def entre_0e10(num):#função para verificar ser o num esta entre 0 e 10
        if num >= 0 and num <= 10:
            return True# se esta entre 0 e 10 retorna true
        else:
            return False #senão false

    while True:#while infinito
        a = float(input()) #leitura de A e B
        b = float(input())
        a_valido = entre_0e10(a) # a_valido e b_valido chama a função entre_0e10 para ver se A e B estão entre 0 e 10
        b_valido = entre_0e10(b)
        peso_um = 3.5# peso de A e B
        peso_dois = 7.5

        if a_valido and b_valido:# Se apos a função A e B retornam true então
            resulto = (a * peso_um + b * peso_dois) / (peso_um + peso_dois)#resultado receber a media
            print(f"MEDIA = {resulto:.5f}")# print com 5 casas decimais
            break# aqui se a codição do if e verdadeira então trava o fluxo e para o while
except (ValueError, TypeError):
    exit()