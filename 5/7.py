# -- coding: utf-8 --
n = int(input("Введите число"))
i = 0
while n != 0:
    z = int(input())
    if (z != 0) and (n < z):
        i += 1
    n = z
print(i)