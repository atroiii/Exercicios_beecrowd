def calcular_salario(salario):
    match salario:
        case s if salario <= 400:
            percentual = 15
            novo_salario = salario + (salario * (percentual/100))
            ganho =  novo_salario - salario
            print(f"Novo salario: R${novo_salario:.2f}")
            print(f"Ganho: R${ganho:.2f}")
            print(f"Em percentual: {percentual}%")
            return
        case s if salario > 400 and salario <= 800:
            percentual = 12
            novo_salario = salario + (salario * (percentual / 100))
            ganho =  novo_salario - salario
            print(f"Novo salario: R${novo_salario:.2f}")
            print(f"Ganho: R${ganho:.2f}")
            print(f"Em percentual: {percentual}%")
            return
        case s if salario >= 800 and salario <= 1200:
            percentual = 10
            novo_salario = salario + (salario * (percentual / 100))
            ganho =  novo_salario - salario
            print(f"Novo salario: R${novo_salario:.2f}")
            print(f"Ganho: R${ganho:.2f}")
            print(f"Em percentual: {percentual}%")
            return
        case s if salario >= 1200 and salario <= 2000:
            percentual = 7
            novo_salario = salario + (salario * (percentual / 100))
            ganho =  novo_salario - salario
            print(f"Novo salario: R${novo_salario:.2f}")
            print(f"Ganho: R${ganho:.2f}")
            print(f"Em percentual: {percentual}%")
            return
        case s if salario >= 2000:
            percentual = 4
            novo_salario = salario + (salario * (percentual / 100))
            ganho =  novo_salario - salario
            print(f"Novo salario: R${novo_salario:.2f}")
            print(f"Ganho: R${ganho:.2f}")
            print(f"Em percentual: {percentual}%")
            return
        case _:
            exit()


salario = float(input())
calcular_salario(salario)