
try:#codigo deve ser refatorando, pois esta um lixo, porem passou no juiz do beecrow
    while True:# while infinito para rodar ate o 'n' ser (0 < N < 1000000).
        n = int(input())
        valor_de_n = n # variavel para guardar o valor de 'n' para o primeiro print
        if 0 < n < 1000000:#codição para sair do while

            notas = [100,50,20,10,5,2,1]#array para guarda as notas
            contador_notas_100 = contador_notas_50 = contador_notas_20 = contador_notas_10 = contador_notas_5 = contador_notas_2 = contador_notas_1 = 0
            # em cima esta dessa forma pois todos são 0

            for num in notas:# for para roda sobre notas
                # codições para cada nota onde eu vejo ser 'n' e maior igual a 100 para dividir por 100 ser sim
                if n >= notas[0]:
                        contador_notas_100 += n//notas[0]#contador de notas receber o tanto de vezes que foi possivel dividi por 100
                        n = n%notas[0]# e agora 'n' receber o oque sobrou
                        #agora ser não e maior vai para o proximo elif e assim por diante mesma logica nos elif
                elif n >= notas[1]:
                        contador_notas_50 += n//notas[1]
                        n = n%notas[1]
                elif n >= notas[2]:
                        contador_notas_20 += n//notas[2]
                        n = n%notas[2]
                elif n >= notas[3]:
                        contador_notas_10 += n//notas[3]
                        n = n%notas[3]
                elif n >= notas[4]:
                        contador_notas_5 += n//notas[4]
                        n = n%notas[4]
                elif n >= notas[5]:
                        contador_notas_2 += n//notas[5]
                        n = n%notas[5]
                elif n >= notas[6]:
                        contador_notas_1 += n//notas[6]
                        n = n%notas[6]
                if n <= 0:# agora ser passou por todos os elif e não e maior >= 1 então posso passa o for aqui mesmo pois
                    #ja sei que 'n' vale 0 e não preciso da mais voltas atoa
                    break

        #logo abaixo os print como foi pedindo
            print(f"{valor_de_n}")
            print(f"{contador_notas_100} nota(s) de R$ 100,00")
            print(f"{contador_notas_50} nota(s) de R$ 50,00")
            print(f"{contador_notas_20} nota(s) de R$ 20,00")
            print(f"{contador_notas_10} nota(s) de R$ 10,00")
            print(f"{contador_notas_5} nota(s) de R$ 5,00")
            print(f"{contador_notas_2} nota(s) de R$ 2,00")
            print(f"{contador_notas_1} nota(s) de R$ 1,00")
            break # eo break do for para trava o while
except ValueError:
    exit()
