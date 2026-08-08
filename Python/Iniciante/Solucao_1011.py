
def calcular_volume_esfera(raio):
    return (4.0/3) * 3.14159 * raio**3

try:
    raio = float(input())
    print(f"{ calcular_volume_esfera(raio):.3f}")
except (ValueError, TypeError):
    exit()