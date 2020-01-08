package com.zk.zkprojects;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class ZkprojectsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZkprojectsApplication.class, args);
	}

}
