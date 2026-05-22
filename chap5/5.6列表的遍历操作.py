lst=['hello','world','python','php','java']
for item in lst:
    print(item)#每次将列表中的元素取一个出来赋值给item

for i in range(0,len(lst)):
    print(i,'-->',lst[i])

print()

for index,item in enumerate(lst):#index是序号，item是内容
    print(index,'-->',item)
#手动修改序号起始值
for index,item in enumerate(lst,start=1):
    print(index,'-->',item)