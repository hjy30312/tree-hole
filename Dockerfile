FROM openjdk:8
MAINTAINER hjy
ADD tree-hole-0.0.1-SNAPSHOT.jar tree-hole-v1.jar
# 容器暴露的端口是多少，就是jar在容器中以多少端口运行
EXPOSE 10083
# 容器启动之后执行的命令，java -jar demo.jar 即启动jar
ENTRYPOINT ["java","-jar","tree-hole-v1.jar"]
