package cn.cloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("cn.cloud.mapper")
@SpringBootApplication
public class User {
    public static void main(String[] args) {
        SpringApplication.run(User.class, args);
    }
}