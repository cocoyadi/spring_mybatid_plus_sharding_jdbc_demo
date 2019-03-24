package com.coco;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;

/**
 * Created by yadi_coco on 2019/3/24.
 */
@SpringBootConfiguration
@MapperScan("com.coco.mapper")
public class Application {
    public static void main(String args[]){
        SpringApplication.run(Application.class);
    }
}
