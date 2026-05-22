import random
rand=random.randint(1,100)
count=1
while count<=10:
    number=eval(input('我心中有个数，请你猜一猜：'))
    if number==rand:
        print('猜对了')
        break
    elif number>rand:
        print('猜大了')
    else:
        print('猜小了')
    count+=1#
if count<=3:
    print('真聪明，猜了',count,'次')
elif count<=6:
    print('还可以，猜了',count,'次')
else:
    print('猜的次数有点多，一共猜了',count,'次')
