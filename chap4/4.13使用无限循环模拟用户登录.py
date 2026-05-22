#（1）初始化变量
i=0
while i<3:#(2）条件判断
   users_name=input('请输入用户名：')
   pwd=input('请输入您的密码：')
   if users_name=='sz' and pwd=='123456':
       print('系统正在登陆')
       i=8
   else:
       if i<2:
           print ('登陆失败,您还有',2-i,'次机会')
   i+=1
if i==3:
    print('三次均输入错误，系统锁定')
print(i)
