12023.3.12:
docker-compose up
将从docker hub pull下来 server2-demo 和 client2-demo同时运行，（前端有点慢），打开localhost:3000访问sopra的实验网页。

what lefts to be done:
integrate MongoDB and MongoDB express: https://www.youtube.com/watch?v=3c-iBn73dDE&t=645s








下面不再适用：


运行localstack:

docker-compose up

localstack后台运行：

docker-compose up -d

（需要创建 AWS 账号，设置 credentials）

在4566端口新建aws s3的 bucket:

aws --endpoint-url=http://localhost:4566 s3 mb s3://demo-bucket

打开：
http://localhost:4566/health

各个服务应该都显示 available





架构：

参考去年项目 https://github.com/Hack3rz-Official/annotation-web-service/wiki

或前年项目：https://github.com/melihcatal/aseTermProject

