def calcular_salario_com_comisao(salario, vendas):
    comisao = 0.15
    return  (salario + (vendas*comisao))
try:
    nome = input()
    salario = float(input())
    vendas = float(input())
    total = calcular_salario_com_comisao(salario,vendas)

    print(f"TOTAL = R$ {total:.2f}")
except (ValueError, TypeError):
    exit()