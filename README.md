# 开发运行说明
_初学参考_
## 下载代码
首先需要用到git命令。推荐在命令行界面使用git。
```
git clone https://github.com/wanghaifeng/cucumber-selenium-test.git
```
## 命令列表
_Linux或者Mac系统使用"./gradlew"命令_<br>
_Windows系统使用"gradlew.bat"命令_<br>
_下面命令需要进入上面下载到的代码所在的目录_
### 生成Eclipse或者Idea(推荐)项目
```
./gradlew eclipse
```
或者 
```
./gradlew idea
```
### 调整Java代码样式
```
./gradlew goJF
```
### 执行测试
```
./gradlew test
```
### 清理项目
```
./gradlew clean cleanIdea
```

## 查看修改代码、增加功能等
* Eclipse需要添加Cucumber插件， 插件下载地址： https://cucumber.io/cucumber-eclipse/
* 测试用的Java代码写到src/test/java 下，可以直接用上面的执行测试命令在命令行执行。
