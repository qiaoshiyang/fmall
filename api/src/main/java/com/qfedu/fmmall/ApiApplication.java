package com.qfedu.fmmall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 项目启动类
 *
 * @author qiaoshiyang
 * @version 1.0.0
 * @date 2021/12/12 9:28
 */
@SpringBootApplication
@MapperScan("com.qfedu.fmmall.mapper")
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
