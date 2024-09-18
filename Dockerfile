# Sử dụng hình ảnh OpenJDK 17 làm hình ảnh cơ sở
FROM openjdk:17-jdk-slim as builder

# Đặt thư mục làm việc
WORKDIR /app

# Sao chép file JAR từ máy chủ vào trong container
COPY target/postman-0.0.1-SNAPSHOT.jar app.jar

# Giai đoạn chạy ứng dụng
FROM openjdk:17-jdk-slim

# Đặt thư mục làm việc
WORKDIR /app

# Sao chép file JAR từ giai đoạn build vào giai đoạn chạy
COPY --from=builder /app/app.jar app.jar

# Mở cổng mà ứng dụng Spring Boot sử dụng (thay đổi nếu cần)
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
