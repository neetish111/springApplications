package com.nt.controller;

import com.nt.dto.EmployeeDTO;
import com.nt.services.EmpMgmtService;
import com.nt.vo.EmployeeVO;

public class MainController {
	private EmpMgmtService empservice;

	public MainController(EmpMgmtService empservice) {
		super();
		this.empservice = empservice;
	}
	public String processEmployee(EmployeeVO vo) throws Exception {
		EmployeeDTO dto=null;
		String result=null;
		dto=new EmployeeDTO();
		dto.setEid(vo.getEid());
		dto.setEname(vo.getEname());
		dto.setEaddress(vo.getEaddress());
		dto.setEda(vo.getEda());
		dto.setEpersonalallowance(vo.getEpersonalallowance());
		result=empservice.calculateGrossandNetSalaries(dto);
		
		
		return result;
		
	}

}
