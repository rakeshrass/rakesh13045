
package com.cg.client;

import java.util.Scanner;

import com.cg.bean.EmployeeBean;
import com.cg.service.EmpServiceImpl;
import com.cg.service.IEmpService;

public class EmpClient {
	IEmpService empserv=null;
	public static void main(String[] args) {
		EmpClient ob = new EmpClient();
		EmployeeBean emp=null;
		
		System.out.println("Welcome...");
		System.out.println("1. add Employee");
		System.out.println("2. update Employee");
		System.out.println("3. delete Employee");
		System.out.println("4. retrieve by id");
		System.out.println("5. view All Employee");
		System.out.println("========================");
		Scanner scann = new Scanner(System.in);
		int option = scann.nextInt();
		// pass to switch //char //int //Enum //String
		// only for equality - use else if conditional optr has to used
		switch (option) {

		case 1:
			// get data from user
			System.out.println("enter employee name :");
			String name = scann.next();
			System.out.println("enter employee mobile number :");
			String mob = scann.next();
			System.out.println("enter salary :");
			int salary = scann.nextInt();
			System.out.println("enter employee mail :");
			String mail = scann.next();
			// validate - validateDetails();
			// do while
			// add all the data to the bean obj
			emp = new EmployeeBean(name,mob,salary,mail);
			int id=ob.addEmployee(emp);
			System.out.println("your data has been successfully inserted ");
			System.out.println("your emp id is <<"+id+">>");
			break;
		case 2:
			ob.updateEmployee();
			break;

		default:
			System.out.println("enter a valid option between 1 to 5");
			break;

		case 3:
			ob.deleteEmployee();
			break;
		case 4:
			break;
		case 5:
			break;

		}

	}

	public int addEmployee(EmployeeBean emp) {
		//System.out.println("called add emp");
		//create object of service class
		empserv=new EmpServiceImpl();
		int empId=empserv.addEmployee(emp);
		return empId;
	}

	public int updateEmployee() {
		System.out.println("called update emp");
		return 0;
	}

	public int deleteEmployee() {
		System.out.println("called delete emp");
		return 0;
	}
}