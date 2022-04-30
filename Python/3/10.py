# -- coding: utf-8 --
k = int(input("Введите колличество чисел"))
n = int(input("Введите порядковый номер числа"))
x = 0
y = 1
c = k+n
for i in range (1, c+1):
  z = x + y
  x = y
  y = z
print(z)