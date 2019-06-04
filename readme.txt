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
	
