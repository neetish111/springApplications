package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.scheduling.quartz.SpringBeanJobFactory;

import com.nt.beans.College;
import com.nt.beans.ContactsInfo;
import com.nt.beans.UniversityInfo;

public class CollectionInjectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultListableBeanFactory factory=null;
       XmlBeanDefinitionReader reader=null;
       factory=new DefaultListableBeanFactory();
       reader=new XmlBeanDefinitionReader(factory);
       ContactsInfo contact=null;
       College clg=null;
       UniversityInfo uInfo=null;
       reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
       clg=factory.getBean("clg",College.class);
       System.out.println(clg);
       System.out.println("------------------");
       contact=factory.getBean("cInfo",ContactsInfo.class);
       System.out.println(contact);
       System.out.println("-------------------");
       uInfo=factory.getBean("uInfo",UniversityInfo.class);
       System.out.println(uInfo);
       

	}

}
