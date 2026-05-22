fp=open('note.txt','w') # 打开文件 w-->write
print('北京欢迎你',file=fp)
fp.close()