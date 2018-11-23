package com.luomo.spring.study.ioc;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author LiuMei
 * @date 2018-11-22.
 */
public class TestDefaultListableBeanFactory {

	public static void main(String[] args) {
		ClassPathResource classPathResource = new ClassPathResource("beans.xml");
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);
		xmlBeanDefinitionReader.loadBeanDefinitions(classPathResource);
		System.out.println("numbers: " + defaultListableBeanFactory.getBeanDefinitionCount());
		((Person)defaultListableBeanFactory.getBean("person")).work();
	}

}
