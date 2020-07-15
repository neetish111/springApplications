package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource res=null;
		BeanFactory factory=null;
		Object obj=null;
		WishMessageGenerator generator=null;
		String result=null;
		res=new FileSystemResource("src/com/nt/config/applicationContext.xml");
        factory=new XmlBeanFactory(res);
        obj=factory.getBean("wmg");
        generator=(WishMessageGenerator)obj;
        result=generator.generateWishMessage("Shyam");
        System.out.println(result);

	}

}
