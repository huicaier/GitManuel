--------git 常用命令讲解-------
1.创建本地仓库
	git clone git_repository new_name3
2.新建一个分支并关联到远程分支

	git branch -a 
	git checkout -b branch_name remote_branch

3.回退版本
	add or edit file
	git add file or .(当前所有变更的文件)
	git commit -m 'some commit message'
	
	git reset --hard or --soft HEAD~2  回退到指定的索引地址
	
