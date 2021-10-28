# -- coding: utf-8 --
def min(a,b,c):
	if a<b and a<c:
		print (a)
	if b<a and b<c:
		print (b)
	if c<a and c<b:
		print (c)
a=int(input("Введите первое число "))
b=int(input("Введите второе число "))
c=int(input("Введите третье число "))
min(a,b,c)