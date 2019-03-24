package com.coco.config;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by yadi_coco on 2019/3/24.
 */
@Configuration
public class MybatisPlusConfig {
    @Bean
    @ConfigurationProperties("spring.datasource.user" )
    public DataSource dataSource() {
        return DataSourceBuilder
                .create()
                .build();
    }
}
