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

