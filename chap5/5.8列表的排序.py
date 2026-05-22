lst=[10,12,58,58,12]
print('原列表：',lst)

#lst.sort(key,reverse);key表示排序规则，reverse表示排序方式

#排序，默认升序
lst.sort()
print('升序：',lst)
#降序
lst.sort(reverse=True)
print('降序：',lst)

print('-----------------------------------')
lst2=['baba','cat','dog']
lst2.sort()
print('升序：',lst2)
lst2.sort(reverse=True)
print('降序：',lst2)

#忽略大小写进行比较
lst2.sort(key=str.lower,reverse=True)
print(lst2)