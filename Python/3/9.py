# -- coding: utf-8 --
n = int(input("Введите колличество чисел"))
x = 0
y = 1
for i in range (1, n+1):
  z = x+y
  x = y
  y = z
print(z)