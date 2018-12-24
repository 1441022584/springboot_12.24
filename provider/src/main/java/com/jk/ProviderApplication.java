package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication//相当于@Configuration + @EnableAutoConfiguration + @ComponentScan 把启动类注入到spring
@MapperScan("com.jk.mapper")  //扫描持久层
//@EnableTransactionManagement
//@Transactional(readOnly=true)//注解加在类 表示这个类中所有方法都是有事务的，加在方法上指当前方法有事务
@ImportResource("classpath:spring-dubbo-provider.xml")  //加载spring-dubbo-provider.xml文件
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
