package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.domain.Student;

public class ConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	BeanFactory factory=null;
	factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
	Student std=factory.getBean("st",Student.class);
	System.out.println(std);
   }

}
