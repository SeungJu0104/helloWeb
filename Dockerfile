#실행에 필요한 Docker Image
FROM openjdk:17-jdk-slim

#가상 머신의 작업 경로
WORKDIR /app

# 파일복사
# 여기서는 실행가능한 Jar 파일이 위치한 경로로 설정
COPY  build/libs/helloWeb-0.0.1.jar app.jar
# app.jar는 변경된 파일명

#공개 포트 설정(필수 아님)
EXPOSE 8080

#실행
#java -jar app.jar
ENTRYPOINT [ "java", "-jar", "app.jar" ]