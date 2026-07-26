def calcular_consumo(x,y):#formula para calcular consumo
    return x/y

x = int(input())
y = float(input())

print(f"{calcular_consumo(x,y):.3f} km/l")