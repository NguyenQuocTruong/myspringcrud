# myspringcrud
Ứng dụng CRUD đơn giản sử dụng spring boot.
mục đích: hiểu vể các khái niệm cơ bản trong spring boot

# Công nghệ sử dụng
Spring boot: để khởi tạo và cấu hình ứng dụng một cách nhanh nhất.
Spring MVC: để build ứng dụng
Spring Data: cụ thể là Spring Data JPA, dùng để giúp ứng dụng thao tác với tầng cơ sở dữ liệu.
DBMS: MySQL.
Template engine: Thymeleaf và Bootstrap css.
Tool IDE: Intellij JetBrain.
Công nghệ khác: Maven 3, 1. Tomcat Embed 8.
  
# Các chức năng chính sẽ xây dựng:
  Hiển thị quản lý Nhân viên (EMPLOYEE MANAGE).
  Thêm user (ADD EMPLOYEE)
  Sửa user. (EDIT EMPLOYEE)
  Xóa user. (DELETE EMPLOYEE)

# Tạo bảng csdl:
  CREATE TABLE `employee` (
    `id` int(11) NOT NULL AUTO_INCREMENT,
    `name` varchar(45) NOT NULL,
    `email` varchar(45) NOT NULL,
    `phone` varchar(45) NOT NULL,
    PRIMARY KEY (`id`)
  ) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

# Cấu hinh pom.xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.2.4.RELEASE</version>
        <relativePath/> <!-- lookup parent from repository -->
    </parent>
    <groupId>io.github.truong</groupId>
    <artifactId>myspringcrud</artifactId>
    <version>0.0.1-SNAPSHOT</version>
    <name>myspringcrud</name>
    <description>Demo project for Spring Boot</description>

    <properties>
        <java.version>1.8</java.version>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
<!--            <exclusions>-->
<!--                <exclusion>-->
<!--                    <groupId>org.junit.vintage</groupId>-->
<!--                    <artifactId>junit-vintage-engine</artifactId>-->
<!--                </exclusion>-->
<!--            </exclusions>-->
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>

</project>
