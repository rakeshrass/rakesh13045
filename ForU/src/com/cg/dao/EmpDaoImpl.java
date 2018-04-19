package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

import com.cg.bean.EmployeeBean;
import com.cg.util.DBUtil;

public class EmpDaoImpl implements IEmpDao{

	@Override
	public int addEmployee(EmployeeBean emp) {
		//code for db
		int returnId=0;
		try {
			Connection connection=DBUtil.getDbConnection();
			PreparedStatement pst=connection.prepareStatement(IQueryMapper.INSERT_QUERY);
			pst.setString(1, emp.getEmpName());
			pst.setString(2, emp.getMobileNum());
			pst.setInt(3, emp.getSalary());
			pst.setString(4, emp.getMail());
			int status=pst.executeUpdate();
			
			if(status>0){
				pst=connection.prepareStatement(IQueryMapper.GET_CURRENT_ID);
				ResultSet rs= pst.executeQuery();
				while(rs.next()){
					returnId=rs.getInt(1);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return returnId;
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
