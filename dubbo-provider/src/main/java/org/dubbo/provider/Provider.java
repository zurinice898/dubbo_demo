package org.dubbo.provider;

import java.io.IOException;

import org.apache.dubbo.registry.RegistryService;
import org.apache.dubbo.registry.integration.RegistryDirectory;
import org.apache.dubbo.registry.zookeeper.ZookeeperRegistry;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * 服务提供方
 * 
 * @author Admin
 *
 */
public class Provider {
	public static void main(String[] args) throws IOException {
		// 测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
		System.out.println(context.getDisplayName() + ": here");
		context.start();
		System.out.println("服务已经启动...");
		System.in.read();
		RegistryDirectory RegistryDirectory;
		RegistryService RegistryService;
		ZookeeperRegistry ZookeeperRegistry;

	}
}
