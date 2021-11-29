# -- coding: utf-8 --
n = int(input("Введите число"))
x = 0
i = 1
while x <= n:
    x = i**2
    i += 1
    if x <= n:
        print (x)