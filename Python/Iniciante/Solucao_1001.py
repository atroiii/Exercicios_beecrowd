try:#Try para tratamento de erro
    #as variaveis a e b recebem um entrada do tipo int, variavel x receber a soma de a + b
    a = int(input())
    b = int(input())
    x = a + b
    print(f"X = {x}")#print para variavel x
except ValueError:
    exit()