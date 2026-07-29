
def calcular_consumo(tempo_gasto, velocidade_media):
    KM_POR_LITRO = 12
    return (tempo_gasto * velocidade_media) / KM_POR_LITRO

tempo_gasto = int(input())
velocidade_media = int(input())

print(f"{calcular_consumo(tempo_gasto,velocidade_media):.3f}")
