package com.zxw.transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
//开启事务
@EnableTransactionManagement
public class TransactionalApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransactionalApplication.class, args);
    }

}
