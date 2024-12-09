# Sử dụng base image OpenJDK với Java 21
FROM openjdk:21-jdk-slim as build

# Thiết lập thư mục làm việc trong container
WORKDIR /app

# Copy toàn bộ mã nguồn dự án vào container
COPY . .

# Cài đặt Gradle Wrapper (nếu chưa có) và xây dựng ứng dụng
RUN ./gradlew build -x test

# Bắt đầu một stage mới, chỉ copy các file cần thiết từ stage build
FROM openjdk:21-jdk-slim

# Thiết lập thư mục làm việc
WORKDIR /app

# Copy file JAR từ giai đoạn build
COPY --from=build /app/build/libs/*.jar app.jar

# Cổng mặc định mà ứng dụng sẽ chạy
EXPOSE 8080

# Lệnh chạy ứng dụng Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
