lst=['hello','world',90,100.5]#第一种创建列表方式,直接使用[]创建
print(lst)
lst2=list('hello，123')#第二种列表创建方式，用内置函数
print(lst2)
lst3=list(range(1,10,2))
print(lst3)
#列表是序列中的一种，对序列的操作符，运算符,函数均可以使用
print(lst+lst2+lst3)
print(lst*5)
print(len(lst2))
print(max(lst3))
print(min(lst3))
print(lst2.count('o'))
print(lst2.index('o'))
#列表删除操作
lst4=[10,12,58,58,12]
print(lst4)
del lst4