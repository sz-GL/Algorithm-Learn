s='helloworld'
print('e在s中存在吗？',('e'in s))
print('v在s中存在吗？',('v'in s))#in的使用
#not in使用
print('e在s中不存在吗？',('e'not in s))
print('v在s中不存在吗？',('v'not in s))
#内置函数使用
print('lens():',len(s))
print('max():',max(s))
print('min():',min(s))
#序列对象的方法
print('s.index():',s.index('o'))#o在s中第一次出现的索引位置
print('s.count():',s.count('o'))#统计s中o的个数

