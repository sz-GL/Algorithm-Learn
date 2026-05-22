#三行四列
for i in range(1,4):#外层循环行数
    for j in range(1,5):
        print('*',end='')
    print()

print('-----------------------')

for i in range(1,6):
    for j in range(1,i+1):
        print('*',end='')
    print()

print('-----------------------')

for i in range(1,6):
    for j in range(1,7-i):
        print('*', end='')
    print()

print('-----------------------')

for i in range(1,6):
    for j in range(1,6-i):
       print(' ', end='')
    for k in range(1,2*i):
      print('*', end='')
    print()