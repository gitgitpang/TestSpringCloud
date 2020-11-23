package cn.enjoy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan(value = "cn.enjoy.mapper")
@EnableEurekaClient
public class ProdoctApp {
    public static void main(String[] args) {
        SpringApplication.run(ProdoctApp.class);
        System.out.println("ProdoctApp服务启动起来了");
    }
}
