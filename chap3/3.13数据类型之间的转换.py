x=10
y=3
z=x/y#在执行除法运算时，将运算结果赋值给z
print(z,type(z))#隐式转换

#float类型转化为int类型，只保留整数部分
print('float类型转成int类型',int(3.14))
print('float类型转成int类型',int(3.9))
print('float类型转成int类型',int(-3.14))
print('float类型转成int类型',int(-3.9))
#将int类型转换为float类型
print('int类型转换为float类型',int(10))
#将字符串转换为float类型
print(int('100')+int('200'))
#chr()与ord()
print(ord('杨'))#杨在unicode表中对应的整数值，是26472
print(chr(26472))#26472整数在Unicode表中对应字符是什么，是杨

#进制转换操作，十进制与其他进制之间的转换
print('十进制转成十六进制',hex(26472))
print('十进制转换为八进制',oct(26472))
print('十进制转化为二进制',bin(26472))

