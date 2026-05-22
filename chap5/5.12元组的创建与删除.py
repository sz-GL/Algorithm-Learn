#使用小括号创建元组
t=('hello',[10,20,30,40,50],'sha')
print(t)


t1=tuple('hadadaello')
print(t1)

t2=tuple([10,20,30,40,50])
print(t2)

print('10在元组中是否存在：',(10 in t))
print('10在元组中不存在：',(10 not in t))
print('最大值：',max(t2))
print('最小值：',min(t2))
print('元组中数据个数：',len(t2))
print('t2.index:',t2.index(10))
print('t2.count:',t2.count(10))

#元组只有一个元素
t=(10)
print(t,type(t))#此时数据类型为整数型

#元组只有一个元素，逗号不能省
t=(10,)
print(t,type(t))

#元组的删除
del t