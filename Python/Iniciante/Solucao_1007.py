def deferenca(a,b,c,d):#função de diferença dos produtos
    return  (a * b - c * d)
try:
    a = int(input())#leitura das variaveis
    b = int(input())
    c = int(input())
    d = int(input())
    print(f"DIFERENCA = {deferenca(a,b,c,d)}")#print da diferença dos produtos
except (ValueError, TypeError):
    exit()