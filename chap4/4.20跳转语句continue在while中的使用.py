s=0
i=1
while i<=100:
    if i%2==1:#如果i是奇数
        i+=1
        continue
    s=s+i
    i=i+1
print(s)