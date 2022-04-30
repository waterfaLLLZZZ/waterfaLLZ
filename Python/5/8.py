# -- coding: utf-8 --
p = -1
c = 0
m = 0
n = int(input("Введите число"))
while n != 0:
    if p == n:
        c += 1
    else:
        p = n
        m = max(m, c)
        c = 1
    n = int(input())
m = max(m, c)
print(m)