package com.luomo.spring.study.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author LiuMei
 * @date 2018-11-23.
 */
public class TestApplicationContext {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("classpath:beans.xml");
		System.out.println("numbers: " + applicationContext.getBeanDefinitionCount());
		((Person)applicationContext.getBean("person")).work();
	}

}
