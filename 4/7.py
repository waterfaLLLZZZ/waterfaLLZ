# -- coding: utf-8 --
x=input("Введите строку, в которой h встречается не меньше 2-х раз ")
y=x[:x.find('h')]
z=x[x.rfind('h')+1:]
print(y+z)