luck_number=8#创建一个整型变量，并赋值
my_name='孙长'#字符串型变量
print('luck_number的变量是',type(luck_number))
print(my_name,'的幸运数字是',luck_number)

#python动态修改变量的数据类型，通过赋不同的值就可以直接修改
#在python中准许多个变量指向同一个值
print(id(my_name),id(luck_number))#id函数用于查看变量内存地址
