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

4.查看历史提交和进行日志比对
	
	git reflog;
	git diff HEAD -- file   当前work tree和已提交分支的代码差异

5.撤销修改

	git checkout -- readme.txt 撤销文件修改到上一次commit或add状态

6.将本地分支修改推送到远程指定分支
	
	git push origin master

7.远程协作
查看远程库信息，使用git remote -v；

本地新建的分支如果不推送到远程，对其他人就是不可见的；

从本地推送分支，使用git push origin branch-name，如果推送失败，先用git pull抓取远程的新提交；

在本地创建和远程分支对应的分支，使用git checkout -b branch-name origin/branch-name，本地和远程分支的名称最好一致；

建立本地分支和远程分支的关联，使用git branch --set-upstream branch-name origin/branch-name；

从远程抓取分支，使用git pull，如果有冲突，要先处理冲突。	
