
def calcularhoras(horasTrabalhada, valorHora):
        return horasTrabalhada * valorHora

try:
    numeroFuncionario = int(input())
    horasTrabalhadas = int(input())
    valorHora = float(input())
    salario = calcularhoras(horasTrabalhadas,valorHora)

    print("NUMBER =", numeroFuncionario)
    print(f"SALARY = {salario:.2f}", )
except (ValueError, TypeError):
    exit()