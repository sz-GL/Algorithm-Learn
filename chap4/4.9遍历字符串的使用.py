#把字符串hello的各个字母依次取给i
for i in 'hello':
    print(i)
#range函数，在python中产生一个[n,m)的整数序列，包含n,但不包含m
for i in range(1,11):
    print(i)
    if i%2==0:
       print('i是偶数')
    else:
      print('i是奇数')
#计算累加和
s=0
for i in range(1,11):
    s=s+i
print(s)

for g in range(100,1000):
    sd=g%10
    tens=g//10%10
    hundreds=g//100
    if sd**3+tens**3+hundreds**3==g:
        print(g)