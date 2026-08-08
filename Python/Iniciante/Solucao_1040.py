def calcular_media_ponderada( nota1, nota2, nota3, nota4):# fução para calcular media
        media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4 * 1)) / 10
        return media
try:
    nota1, nota2, nota3, nota4 = map(float, input().split())
    media = calcular_media_ponderada(nota1, nota2, nota3, nota4)

    if media >= 7:#logica como o exercicio pediu
        print(f"Media: {media:.1f}")
        print("Aluno aprovado.")
    elif media < 7 and media >= 5:
        print(f"Media: {media:.1f}")
        print("Aluno em exame.")
        notaExame = float(input())
        mediaComExame = (notaExame + media) / 2
        print(f"Nota do exame: {notaExame:.1f}" )
        if mediaComExame >= 5:
            print("Aluno aprovado.")
        else:
            print("Aluno reprovado.")

        print(f"Media final: {mediaComExame:.1f}")
    else:
        print(f"Media: {media:.1f}")
        print("Aluno reprovado.")
except (ValueError, TypeError):
    exit()