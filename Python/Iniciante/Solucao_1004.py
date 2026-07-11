try:
    a = int(input())
    b = int(input())
    prod = a*b
    print(f"PROD = {prod}")
except (ValueError, TypeError):
    exit()