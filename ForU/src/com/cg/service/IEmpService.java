package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.EmployeeBean;

public interface IEmpService {
	public int addEmployee(EmployeeBean emp);
	public int updateEmployee();
	public int deleteEmployee() ;
	public EmployeeBean retrieveByID(int id);
	public ArrayList<EmployeeBean> RetrieveAll() ;
	
}
