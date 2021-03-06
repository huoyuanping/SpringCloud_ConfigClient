package com.et;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class Config {
	@Value("${url}")
	private  String url;
	@Value("${driverClass}")
	private  String driverClass;
	@Value("${username1}")
	private  String username1;
	@Value("${password2}")
	private  String password2;
	/**
	 * 一旦创建了datasource它的优先级高于系统内置的datasoruce
	 * @return
	 */
	 @Bean
	 public DataSource myDataSource(){
		 DruidDataSource dds=new DruidDataSource();
		 dds.setUrl(url);
		 dds.setDriverClassName(driverClass);
		 dds.setUsername(username1);
		 dds.setPassword(password2);
		 return dds;
	 }
}
