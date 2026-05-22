lst=['hello','world','python']
print('原列表：',lst,id(lst))#id()求原列表的内存地址
#增加元素的操作
lst.append('spl')
print('增加元素之后:',lst,id(lst))#内存地址并未改变，lst为可变数据类型
#使用insert(index,x)在指定index位置上插入元素x
lst.insert(1,100)
print(lst)
#列表元素的删除操作
lst.remove('world')
print(lst)
#使用pop(index)根据索引将元素取出，然后再删除
print(lst.pop(1))
print(lst)
#使用clear()清除列表所有元素
# lst.clear()
# print(lst,id(lst))    ctrl+?注释掉
#列表的反向
lst.reverse()
print(lst)

#列表的拷贝
new_list=lst.copy()
print(lst,id(lst))
print(new_list,id(new_list))

#列表元素的修改，根据索引进行修改元素
lst[1]='myspl'
print(lst)


