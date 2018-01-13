package com.et;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启用分布式配置中心 读取远程git仓库获取配置
 * 所有spring的配置中心的配置文件 都有一下几种格式组成
 * 1.配置文件属于那个应用的（application）
 * 2.配置文件属于那个阶段（profile）开发阶段 测试阶段  产品阶段
 * 3.在git仓库中的那个分支下（label）
 * @author Administrator
 *
 */

@SpringBootApplication
public class Main {
	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
