package com.cg.service;

import java.util.ArrayList;

import com.cg.bean.EmployeeBean;
import com.cg.dao.EmpDaoImpl;
import com.cg.dao.IEmpDao;

public class EmpServiceImpl implements IEmpService{

	IEmpDao empdao=null;
	@Override
	public int addEmployee(EmployeeBean emp) {
		empdao=new EmpDaoImpl();
		
		return empdao.addEmployee(emp);
	}

	@Override
	public int updateEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteEmployee() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmployeeBean retrieveByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<EmployeeBean> RetrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}

}