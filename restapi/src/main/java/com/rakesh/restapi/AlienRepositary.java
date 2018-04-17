package com.rakesh.restapi;

import java.util.ArrayList;

import java.sql.*;

import java.util.List;

public class AlienRepositary {
	
	List<Alien> aliens;
	 Connection con =null;
	public AlienRepositary()
	{
		String url = "jdbc:mysql://localhost:3306/rest";
		String username= "root";
		String password= "rass";
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con =DriverManager.getConnection(url,username,password);
		}
		
		catch(Exception e){
			System.out.println(e);
		}
		
	}
	
	
	
	public List<Alien> getAliens()
	{
	List <Alien> aliens= new ArrayList<>();
	
	String sql ="select *from alien";
	 try{
		  Statement st =con.createStatement();
		  ResultSet rs = st.executeQuery(sql);
		  
		  while(rs.next()){
			  Alien a= new Alien();
			  a.setId(rs.getInt(1));
			  a.setName(rs.getString(2));
			  a.setPoint(rs.getInt(3));
			  
			  aliens.add(a);
		  }
	 }
		  catch (Exception e)
		  {
			  System.out.println(e);
			  
		  }
		  
	
		
	
		
		return aliens;
	}
	

	public Alien getAlien(int id){
		String sql ="select *from alien where id="+id;
		  Alien a= new Alien();
		 try{
			  Statement st =con.createStatement();
			  ResultSet rs = st.executeQuery(sql);
			  
			if(rs.next()){
				
				  a.setId(rs.getInt(1));
				  a.setName(rs.getString(2));
				  a.setPoint(rs.getInt(3));
				  
				  aliens.add(a);
			  }
		 }
			  catch (Exception e)
			  {
				  System.out.println(e);
				  
			  }
			  
		
		
				return a;
		

	}
	
	public void create(Alien a1){
		String sql = "insert into values(?,?,?)";
		
		try{
			  PreparedStatement st =con.prepareStatement(sql);
			  st.setInt(1, a1.getId());
			  st.setString(2, a1.getName());
			  st.setInt(3,a1.getPoint());
			 st.executeUpdate();
			  
			 
		 }
			  catch (Exception e)
			  {
				  System.out.println(e);
				  
			  }
		
	}
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	


