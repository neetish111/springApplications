package com.nt.services;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmpMgmtServiceImpl implements EmpMgmtService {
	private EmployeeDAO dao;
	private float incometaxrate=12;
	

	public EmpMgmtServiceImpl(EmployeeDAO dao) {
		super();
		this.dao = dao;
	}


	@Override
	public String calculateGrossandNetSalaries(EmployeeDTO dto) throws Exception {
		// TODO Auto-generated method stub
		
		float egrosssalary=0;
		float enetsalary=0;
		int count=0;
		EmployeeBO bo=null;
		egrosssalary=dto.getEbasicpay()+dto.getEda()+dto.getEpersonalallowance();
		float temp=(egrosssalary*incometaxrate)/100;
		enetsalary=(egrosssalary-temp);
		bo=new EmployeeBO();
		bo.setEid(dto.getEid());
		bo.setEname(dto.getEname());
		bo.setEaddress(dto.getEaddress());
		bo.setEda(dto.getEda());
		bo.setEbasicpay(dto.getEbasicpay());
		bo.setEpersonalallowance(dto.getEpersonalallowance());
		bo.setIncometaxrate(incometaxrate);
		bo.setEgrosssalary(egrosssalary);
		bo.setEnetsalary(enetsalary);
		 count=dao.insert(bo);
		 if(count==0)
		 {
			return "Query failed please try again!!!"; 
		 }
		 else {
			return "Query Sucessfull: grosssalary="+egrosssalary+" and netsalary="+enetsalary; 
		 }
		
	
	}

}
