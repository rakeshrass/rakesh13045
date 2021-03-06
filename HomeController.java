package com.niit.shoppingcart;

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

@Controller
public class HomeController 
{
	@Autowired
	UserDetailsDAO ud;
	@Autowired
	LoginDAO ld;
	@Autowired
	SupplierDAO sd;
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView m1=new ModelAndView("Home");
		return m1;
	}
	@RequestMapping("/refresh")
	public ModelAndView display2()
	{
		ModelAndView m1=new ModelAndView("Home");
		return m1;
	}
	@RequestMapping("userhome")
	public ModelAndView Userhome()
	{
		ModelAndView m1=new ModelAndView("userhome");
		return m1;
	}
	@RequestMapping("Contact us")
	public ModelAndView Contactus()
	{
		ModelAndView m1=new ModelAndView("Contact us");
		return m1;
	}
	
	@RequestMapping("/reg")
	public ModelAndView regi()
	{
		ModelAndView m1=new ModelAndView("Register");
		return m1;
	}
	@RequestMapping("Registerunknown")
	public ModelAndView regis()
	{
		ModelAndView m1=new ModelAndView("Registerunknown");
		return m1;
	}
	@RequestMapping("/login")
	public ModelAndView dis()
	{
		ModelAndView m1=new ModelAndView("Login");
		return m1;
	}
	@RequestMapping("unknownlogin")
	public ModelAndView disp()
	{
		ModelAndView m1=new ModelAndView("unknownlogin");
		return m1;
	}
	@ModelAttribute("UserDetails")
	public UserDetails registerUser() 
	{
		return new UserDetails();

	}
	@ModelAttribute("Supplier")
	public Supplier dream() 
	{
		return new Supplier();

	}
	
	@RequestMapping("/addsupplier")
	public ModelAndView display3() {

		ModelAndView mv3 = new ModelAndView("addsupplier");
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
		return "Register";
	}
    @ModelAttribute("Login")
    public Login createuser(){
    	return new Login();
    }
    
    @RequestMapping("/checkuser")
    public ModelAndView chackedUser(@Valid @ModelAttribute("Login")Login user,BindingResult result,@RequestParam("userName") String userName,@RequestParam("password")String password) 
    { 
    	System.out.println("UserName is............."+userName);
    	System.out.println("Password is............."+password);
		return null;
    	
    }
    @RequestMapping("storesupplier")
	public String addBook(HttpServletRequest request, @Valid @ModelAttribute("Supplier") Supplier supplier,
			BindingResult result) {
		if (result.hasErrors()) {
			return "addsupplier";
		}
		sd.save(supplier);
		return "Managesuppliers";

	}
    @RequestMapping("admin")
    public ModelAndView rass()
    {
    return new ModelAndView("Admin");	
    	
    }
	}

	
