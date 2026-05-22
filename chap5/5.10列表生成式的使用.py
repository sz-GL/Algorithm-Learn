import random
lst=[item for item in range(1,11)]
print(lst)

lst2=[item*item for item in range(1,11)]
print(lst2)

lst3=[random.randint(1,100) for item in range(10)]
print(lst3)

#从列表中选出符合条件的元素组成新列表
lst4=[i for i in range(10) if i%2==0]
print(lst4)