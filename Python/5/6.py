# -- coding: utf-8 --
a = 0
b = 0
n= int(input("Введите число"))
while n != 0:
    a += n
    b += 1
    n = int(input())
print(a / b)