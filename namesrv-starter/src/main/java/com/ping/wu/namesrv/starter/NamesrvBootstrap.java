package com.ping.wu.namesrv.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author wuping
 * @date 2019/1/11
 */

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class NamesrvBootstrap {
    public static void main(String[] args) {
        SpringApplication.run(NamesrvBootstrap.class);
    }
}
