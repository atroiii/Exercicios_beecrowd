import math

def calcular_distancia(x1, y1, x2, y2):
    return math.sqrt((x2 - x1)**2 + (y2 - y1)**2)

x1, y1 = map(float, input().split())
x2, y2 = map(float, input().split())

resultado = calcular_distancia(x1, y1, x2, y2)
print(f"{resultado:.4f}")