s='3.14+3'
print(s,type(s))
x=eval(s)#用eval函数去除s这个字符串左右的引号,执行了加法
print(x,type(x))

#eval函数经常与input函数一起使用，常用于获取用户输入的数值型
age=eval(input('请输入您的年龄：'))#将字符串类型转成int类型，相当于int(age)
height=eval(input('请输入你的身高'))