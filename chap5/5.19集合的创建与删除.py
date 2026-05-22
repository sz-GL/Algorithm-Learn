#使用{}直接创建集合
s={10,20,30,40}
print(s)
#集合只能存不可变数据,不可存储列表

#使用set()创建集合,集合是无序的
s=set('helloworld')
print(s)
#集合属于系列的一种
s3=set(range(1,10))
print('max:',max(s3))
print('min:',min(s3))
print('len:',len(s3))
print('9在集合中存在吗',(9 in s3))

#集合的删除
del s3
