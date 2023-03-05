运行localstack:

docker-compose up

localstack后台运行：

docker-compose up -d

在4566端口新建aws s3的 bucket:

aws --endpoint-url=http://localhost:4566 s3 mb s3://demo-bucket

打开：
http://localhost:4566/health

各个服务应该都显示 available


