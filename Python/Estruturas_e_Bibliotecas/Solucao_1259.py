n = 0
lista_num = []
lista_num_pares = []
lista_num_impares = []
while True:
    n = int(input())
    n_esta_entre_um_e_ummilhao = 1 < n <= 1000000
    if n_esta_entre_um_e_ummilhao:
        break

while len(lista_num) != n:
    x = int(input())
    if x >= 1:
        lista_num.append(x)
        if x % 2 == 0:
            lista_num_pares.append(x)
        else:
            lista_num_impares.append(x)

lista_ordena_pares = sorted(lista_num_pares)
lista_ordena_impares = (sorted(lista_num_impares, reverse=True))

for num in lista_ordena_pares:
    print(num)
for num in lista_ordena_impares:
    print(num)



