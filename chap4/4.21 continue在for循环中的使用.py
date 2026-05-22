s=0
for i in range(1,101):
    if i%2==1:
        continue
    s=s+i
    i=i+1
print(s)