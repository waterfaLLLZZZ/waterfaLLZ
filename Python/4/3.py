# -- coding: utf-8 --
s = input("Введите строку")
z = int(len(s))
x = int(len(s))//2 +1
f = str(s[x:z]) + str(s[:x])
print(f)