package com.rakesh.restapi;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;





@Path("aliens")
public class AlienResource {
	
	
	AlienRepositary repo =new AlienRepositary();
	
	
	@GET
	@Produces(MediaType.APPLICATION_ATOM_XML)
public List<Alien> aliens(){
	
	System.out.println("get Alien called..");
	
	
	
	
	
	
	
	
	
	
	return repo.getAliens();
	
}

	
}


