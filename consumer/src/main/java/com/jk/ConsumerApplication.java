package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication//相当于@Configuration + @EnableAutoConfiguration + @ComponentScan 把启动类注入到spring
@ImportResource("classpath:spring-dubbo-consumer.xml")
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
