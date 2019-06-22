# test
normal first repository


如何删除git上的文件夹
在本地打开git bash
将需要修改的仓库pull下来

git clone https://github.com/lisuyu/ECMAScript

cd 找到目标文件夹

删除

git rm -r --cached es_server

提交修改

git commit -m '删除了es_server'

提交到远程仓库

git push -u origin master
