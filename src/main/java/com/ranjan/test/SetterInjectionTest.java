package com.ranjan.test;

import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.FileSystemResource;

import com.ranjan.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
		//Hold name and location of spring bean cfg (xml)file in Resource object.
		FileSystemResource res = new FileSystemResource("src/main/java/com/ranjan/cfgs/applicationContext.xml");
		
		//create BeanFactory spring container (IOC container)Inversion of Control
		XmlBeanFactory factory = new XmlBeanFactory(res);
		Object obj = factory.getBean("wmg");
		WishMessageGenerator generator = (WishMessageGenerator)obj;
		String msg = generator.generateMessage("Anurag");
		System.out.println("Wish message is : "+msg);
	}

}
