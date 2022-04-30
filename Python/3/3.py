# -- coding: utf-8 --
a = int(input("Введите первое число"))
b = int(input("Введите второе число"))
if a>b:
  for с in range(a, b - 1, -1):
    if с%2!=0:
      print(с)