package com.niit.shoppingcart.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shoppingcart.dao.LoginDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.dao.UserDetailsDAO;
import com.niit.shoppingcart.model.Login;
import com.niit.shoppingcart.model.Supplier;
import com.niit.shoppingcart.model.UserDetails;

@Controller //it specifies particular class as a controller class
public class HomeController 
{
	@Autowired  // it will connects with the UserDAO interface
	UserDetailsDAO ud;
	@Autowired // connects with the LoginDAO 
	LoginDAO ld;
	@Autowired
	SupplierDAO sd;  // connects with the SupplierDAO interface
	@RequestMapping("/") //it will map the landing page
	public ModelAndView display44() // method which will read the pojo and jsp files
	{
		ModelAndView m1=new ModelAndView("Home");
		return m1;
	}
	@RequestMapping("/refresh")   //reference of home.jsp
	public ModelAndView display2() // method which will read the pojo and jsp files
	{
		ModelAndView m1=new ModelAndView("Home");
		return m1; // the file will returns to the  Home.jsp
	}
	@RequestMapping("userhome") // to map the userhome.jsp
	public ModelAndView Userhome()  
	{
		ModelAndView m1=new ModelAndView("userhome");
		return m1;// the file will returns to the  Userhome.jsp
	} 
	@RequestMapping("Contact us")//it is the reference of the contact us.jsp
	public ModelAndView Contactus()
	{
		ModelAndView m1=new ModelAndView("Contact us"); //this method will read the jsp (we need to give jsp file name here)
		return m1;
	}
	
	@RequestMapping("/reg") //it is the reference of the Register.jsp
	public ModelAndView regi()
	{
		ModelAndView m1=new ModelAndView("Register"); //this method will read the jsp (we need to give jsp file name here)
		return m1;
	}
	
	@RequestMapping("/login") //it is the reference of the login.jsp
	public ModelAndView dis()
	{
		ModelAndView m1=new ModelAndView("Login"); //this method will read the jsp (we need to give jsp file name here)
		return m1;
	}
	
	@ModelAttribute("UserDetails") //@ModelAttribute refers to a property of the Model object (the M in MVC ;). @ModelAttribute is a Spring-MVC specific annotation used for preparing the model data. It is also used to define the command object that would be bound with the HTTP request data. The annotation works only if the class is a Controller class (i.e. annotated with @Controller).
	public UserDetails registerUser() 
	{                                    //it will returns the object of model class
		return new UserDetails();

	}
	@ModelAttribute("Supplier") //@ModelAttribute refers to a property of the Model object (the M in MVC ;). @ModelAttribute is a Spring-MVC specific annotation used for preparing the model data. It is also used to define the command object that would be bound with the HTTP request data. The annotation works only if the class is a Controller class (i.e. annotated with @Controller).
	public Supplier dream() 
	{
		return new Supplier();

	}
	
	@RequestMapping("/addsupplier") //it is the reference of the addsupplier.jsp
	public ModelAndView display3() {

		ModelAndView mv3 = new ModelAndView("addsupplier"); //this method will read the jsp (we need to give jsp file name here)
		return mv3;
	}
	@RequestMapping(value = "storeUser", method = RequestMethod.POST)
	public String addUser(@Valid @ModelAttribute("UserDetails") UserDetails registeruser,BindingResult result) {
		if (result.hasErrors()) {
			System.out.println("Errors");  
			return "Register";
		}
		System.out.println(registeruser.getUsername());
		ud.save(registeruser); 
		Login loginuser = new Login(); 
		loginuser.setId(registeruser.getId());
		loginuser.setUsername(registeruser.getUsername());
		loginuser.setPassword(registeruser.getPassword());
		loginuser.setStatus(registeruser.isStatus()); 
		ld.save(loginuser); 
		return "Home";
	}
    @ModelAttribute("Login") // it is the property of model (pojo) class object
    public Login createuser(){
    	return new Login();
    }
    
    @RequestMapping("/checkuser") //it will checks the user whether registered or not
    public ModelAndView chackedUser(@Valid @ModelAttribute("Login")Login user,BindingResult result,@RequestParam("userName") String userName,@RequestParam("password")String password) //parameters of particular table
    { 
    	System.out.println("UserName is............."+userName); 
    	System.out.println("Password is............."+password);  //print the user name and password
		return null;
    	
    }
    @RequestMapping("storesupplier")
	public String addsupplier(HttpServletRequest request, @Valid @ModelAttribute("Supplier") Supplier supplier,
			BindingResult result) {
		if (result.hasErrors()) {
			return "addsupplier";
		}
		sd.save(supplier);
		return "ManageSupplier";

	}
    @RequestMapping("admin")
	public ModelAndView Admin()
	{
		ModelAndView m80=new ModelAndView("Admin");
		return m80;
	}
    
}
	
