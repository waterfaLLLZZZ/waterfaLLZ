# -- coding: utf-8 --
a = int(input("Введите первое число"))
b = int(input("Введите второе число (больше первого)"))
if a<=b:
  for i in range(a, b + 1):
    print(i)