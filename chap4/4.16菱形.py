row=eval(input('请输入菱形行数：'))
while row%2==0:
    print('重新输入菱形行数')
    row=eval(input('请输入菱形行数：'))
top_row=(row+1)//2
for i in range(1,top_row+1):
    for j in range(1,top_row+1-i):
       print(' ', end='')
    for k in range(1,2*i):
      print('*', end='')
    print()
bottom_row=(row-1)//2
for i in range(1,bottom_row+1):#i从1加到3
    for j in range(1,i+1):#2,3,4
        print(' ', end='')
    for k in range(1,2*bottom_row+2-2*i):#5,3,1
        print('*', end='')
    print()
