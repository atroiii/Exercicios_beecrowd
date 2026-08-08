def valor_a_pagar(quantidade_pecas, valor_peca):
    return quantidade_pecas * valor_peca
try:
    num_peca1, quantidade_peca1, valor_peca1 = map(float, input().split())
    num_peca2, quantidade_peca2, valor_peca2 = map(float, input().split())

    num_peca1 = int(num_peca1)
    num_peca2 = int(num_peca2)
    quantidade_peca1 = int(quantidade_peca1)
    quantidade_peca2 = int(quantidade_peca2)

    print(f"VALOR A PAGAR: R$ {valor_a_pagar(quantidade_peca1,valor_peca1) + 
             valor_a_pagar(quantidade_peca2,valor_peca2):.2f}")
except (ValueError, TypeError):
    exit()