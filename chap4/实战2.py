answer=('y')
while answer=='y':
    print('------------------欢迎使用10086查询功能----------------')
    print('1.查询当前余额')
    print('2.查询当前剩余流量')
    print('3.查询当前剩余通话时长')
    print('0.退出系统')
    choice=input('请输入你要执行的操作:')#input的结果是字符串类型
    if choice=='1':
        print('当前余额为：234.5元')
    elif choice=='2':
        print('剩余流量为：4GB')
    elif choice=='3':
        print('剩余通话时长为：300分钟')
    elif choice=='0':
        print('感谢您的使用')
        break
    else:
        print('对不起你输入有错误，请重新输入')
    answer=input('还继续操作吗？')
else:
    print('感谢使用')