package wy.springboot01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//扫描当前类所在包以及子包中所有类型的注解，做swagger文档的定值
@SpringBootApplication
@EnableSwagger2()
public class SwaggerTest {
    public static void main(String[] args) {
        SpringApplication.run(SwaggerTest.class, args);
    }
}
