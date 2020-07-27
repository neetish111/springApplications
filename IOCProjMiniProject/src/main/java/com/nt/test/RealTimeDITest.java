package com.nt.test;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class RealTimeDITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=null;
		String eid, ename,   eaddress,result;
		float  ebasicpay,  eda, epersonalallowance;
		EmployeeVO vo=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		MainController controller=null;
		sc=new Scanner(System.in);
		System.out.println("enter eid");
		eid=sc.nextLine();
		System.out.println("enter ename");
		ename=sc.nextLine();
		System.out.println("enter eaddress");
		eaddress=sc.nextLine();
		System.out.println("enter ebasicpay");
		ebasicpay=Float.parseFloat(sc.nextLine());
		System.out.println("enter eda");
		eda=Float.parseFloat(sc.nextLine());
		System.out.println("enter epersonalallowance");
		epersonalallowance=Float.parseFloat(sc.nextLine());
		vo=new EmployeeVO();
		vo.setEid(eid);
		vo.setEname(ename);
		vo.setEaddress(eaddress);
		vo.setEbasicpay(ebasicpay);
		vo.setEda(eda);
		vo.setEpersonalallowance(epersonalallowance);
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		controller=factory.getBean("oraMainControll",MainController.class);
		try {
			result=controller.processEmployee(vo);
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Internal problem");
			e.printStackTrace();
		}

	}

}
