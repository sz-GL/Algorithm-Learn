#创建二维列表
lst=[
    ['城市','环比','同比'],
    ['北京',102,103],
    ['上海',104,504],
    ['深圳',100,39]
]
print(lst)

#遍历二维表使用双层for循环
for row in lst:
    for item in row:
        print(item,end='\t')
    print()

#用列表生成式生成四行五列的列表
import random
lst2=[[random.randint(1,100) for j in range(5)] for i in range(4)]
print(lst2)