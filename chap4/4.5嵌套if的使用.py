answer=input('请问您喝酒了吗？')
if answer == 'y':
    proof=eval(input('请输入酒精含量'))
    if proof<20:
        print('不构成酒驾')
    elif proof<=80:
        print('已构成酒驾标准')
    else:
        print('您已醉驾')
else:
    print('你走吧，没你啥事')
