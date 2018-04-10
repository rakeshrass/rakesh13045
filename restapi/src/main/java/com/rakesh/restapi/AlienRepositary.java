package com.rakesh.restapi;

import java.util.ArrayList;
import java.util.List;

public class AlienRepositary {
	
	List<Alien> aliens;
	
	public AlienRepositary()
	{
		aliens =new ArrayList<>();
		
		Alien a1 = new Alien();
	    a1.setId(101);
		a1.setName("rakesh");
		a1.setPoint(96);
		
		
		Alien a2 = new Alien();
		   a1.setId(102);
		a2.setName("swathi");
		a2.setPoint(27);
		
		
		aliens.add(a1);
		aliens.add(a2);
		
		
	}
	
	
	
	public List<Alien> getAliens()
	{
		return aliens;
	}
	

	public Alien getAlien(int id){
		
		Alien a1 = null;
		for(Alien a:aliens)
		{
			if(a.getId()==id)
		
				return a;
		
		
	}
	
		
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
