package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nt.bo.EmployeeBO;

public class OracleEmployeeDAOImpl implements EmployeeDAO {
	private static final String EMPLOYEE_INSERT_QUERY="INSERT INTO EMPLOYEE18 VALUES (?,?,?,?,?,?,?,?,?)";
	
	private DataSource ds;
	

	public OracleEmployeeDAOImpl(DataSource ds) {
		super();
		this.ds = ds;
	}


	@Override
	public int insert(EmployeeBO bo) throws Exception {
		// TODO Auto-generated method stub
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		 con=ds.getConnection();
		 ps=con.prepareStatement(EMPLOYEE_INSERT_QUERY);
		 ps.setString(1, bo.getEid());
		 ps.setString(2, bo.getEname());
		 ps.setString(3, bo.getEaddress());
		 ps.setFloat(4, bo.getEbasicpay());
		 ps.setFloat(5, bo.getEda());
		 ps.setFloat(6, bo.getEpersonalallowance());
		 ps.setFloat(7, bo.getIncometaxrate());
		 ps.setFloat(8, bo.getEgrosssalary());
		 ps.setFloat(9, bo.getEnetsalary());
		 count=ps.executeUpdate();
		 ps.close();
		 con.close();
		
		
		return count;
	}

}
