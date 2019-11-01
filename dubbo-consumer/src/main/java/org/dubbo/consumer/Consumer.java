package org.dubbo.consumer;

import java.io.IOException;
import java.util.List;

import org.dubbo.api.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.alibaba.dubbo.rpc.service.GenericService;

public class Consumer {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		DemoService demoService = (DemoService) context.getBean(DemoService.class);
		System.out.println("consumer");
		List<String> list = demoService.getPermissions(1L);
		System.out.println(list.toString());
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
//		genericTest(context);
		System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟
	}

	public static void genericTest(ApplicationContext applicationContext) {
		GenericService sayHelloService = (GenericService) applicationContext.getBean("sayHelloService");
		Object result = sayHelloService.$invoke("sayHello", new String[] { "java.lang.Integer" }, new Object[] { 1 });
		System.out.println(result);
	}
}
