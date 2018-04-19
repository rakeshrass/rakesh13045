package com.cg.bean;

public class EmployeeBean
{
	private int empId;//auto generated
	private String empName;
	private String mobileNum;
	private int salary;
	private String mail;
	
	public EmployeeBean() {
		// TODO Auto-generated constructor stub
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getMobileNum() {
		return mobileNum;
	}

	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public EmployeeBean(String empName, String mobileNum,
			int salary, String mail) {
		
		
		this.empName = empName;
		this.mobileNum = mobileNum;
		this.salary = salary;
		this.mail = mail;
	}
	
	
}
