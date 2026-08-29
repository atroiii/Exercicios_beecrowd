a, b, c, d = map(int, input().split())

def eh_par(num):
    return num % 2 == 0

def eh_maior(num1, num2):
    return num1 > num2

def soma_a_b_maior_que_c_d(a, b, c, d):
    return  c + d > a + b

def eh_positivo_c_d(c,d):
    return c >= 0 and d >= 0

if eh_maior(b,c) and eh_maior(d,a) and soma_a_b_maior_que_c_d(a,b,c,d) and eh_positivo_c_d(c,d) and eh_par(a):
    print("Valores aceitos")
else:
    print("Valores nao aceitos")