package com.niit.shoppingcart.controllers;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Product;
import com.niit.shoppingcart.model.Supplier;

@Controller //class as a controller class
public class ProductController {



	@Autowired //it will connects with ProductDAO with below object
	ProductDAO pd;
	@Autowired  //it will connects with SupplierDAO with below object
	SupplierDAO sd;
	@ModelAttribute("Product")  //@ModelAttribute refers to a property of the Model object (the M in MVC ;). @ModelAttribute is a Spring-MVC specific annotation used for preparing the model data. It is also used to define the command object that would be bound with the HTTP request data. The annotation works only if the class is a Controller class (i.e. annotated with @Controller).
	public Product createProduct() {
		return new Product();
	}

	@RequestMapping("Products") //Reference of Product.jsp
	public ModelAndView display6() {
		ModelAndView m4 = new ModelAndView("Products"); //it will read the Product.jsp(name should be same as jsp)
		return m4;
	}
	
	@RequestMapping("/ShowProducts") //Reference of ShowProduct.jsp
	public ModelAndView display7() {
		ModelAndView m4 = new ModelAndView("ShowProducts"); //it will read the ShowProduct.jsp(name should be same as jsp)
		return m4;
	}
	
	@RequestMapping("addproduct")
	public ModelAndView display3() {

		ModelAndView mv3 = new ModelAndView("addproduct");
		mv3.addObject("supplier", new Supplier()); //we are adding the products to the particular supplier
        List suppliers= sd.list(); //it will show the list of suppliers
        mv3.addObject("suppliers", suppliers);
        return mv3;
	}
	@RequestMapping("/viewproducts") //refrence of viewproducts.jsp
	public ModelAndView display8() {
		ModelAndView m4 = new ModelAndView("viewproducts"); //read the particular jsp (we should give the same name)
		return m4;
	}
	@RequestMapping("/viewproductsuser") 
	public ModelAndView display10() {
		ModelAndView m4 = new ModelAndView("viewproductsuser");
		return m4;
	}
	
	@RequestMapping("/ShowProductsuser") //reference to show the products to the users
	public ModelAndView display1() {
		ModelAndView m4 = new ModelAndView("ShowProductsuser");
		return m4;
	}

	@RequestMapping("storeproduct")//it will connects the pojo (table)and the jsp file
	public String addproduct(HttpServletRequest request, @Valid @ModelAttribute("Product") Product product,BindingResult result) {
		if (result.hasErrors()) {
			return "addproduct";
		}
		String filename = product.getImg().getOriginalFilename(); //to store the product image
		product.setImage(filename);

		try {
			byte[] bytes = new byte[product.getImg().getInputStream().available()];
			product.getImg().getInputStream().read(bytes);
			BufferedInputStream buffer = new BufferedInputStream(product.getImg().getInputStream());
			MultipartFile file = product.getImg();
			String path = request.getServletContext().getRealPath("/") + "resources/images";
			File rootPath = new File(path);
			if (!rootPath.exists())
				rootPath.mkdirs();
			File store = new File(rootPath.getAbsolutePath() + "/" + filename);
			System.out.println("Image path :" + path);
			OutputStream os = new FileOutputStream(store);
			os.write(bytes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		pd.save(product);
		return "ManageProducts";

	}
	@RequestMapping("ManageProducts")
	public ModelAndView display11() {
		ModelAndView m10 = new ModelAndView("ManageProducts");
		return m10;
	}
	
	
	@RequestMapping(value = "list", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String showList()
	{
		List list = pd.list(); 
		Gson x = new Gson(); //Gson is a Java library that can be used to convert Java Objects into their JSON representation.
		//It can also be used to convert a JSON string to an equivalent Java object.
		String json = x.toJson(list);
		return json;
	}

	@RequestMapping("/delete")
	public ModelAndView deleteProduct(@RequestParam int id) {
		pd.delete(id);
		ModelAndView m1 = new ModelAndView("ManageProducts");
		return m1;
	}
	

	
	@RequestMapping("viewproductuser")
	public ModelAndView display13() {
		ModelAndView m6 = new ModelAndView("viewproductuser");
		return m6;

	}
	
	@RequestMapping("ShowProductuser")
	public ModelAndView display23() {
		ModelAndView m6 = new ModelAndView("ShowProductuser");
		return m6;

	}
@ModelAttribute ("Product")
public ModelAndView display9(){
	ModelAndView m9 = new ModelAndView("Product");
	return m9;
}
	@RequestMapping(value = "viewproducts", method = RequestMethod.GET)
	public ModelAndView viewPro(@RequestParam int id, @ModelAttribute Product products) {
		Product product = pd.get(id);
		return new ModelAndView("viewproducts", "product", product);
	}
	
	@RequestMapping(value = "ShowProducts", method = RequestMethod.GET)
	public ModelAndView ShowPro(@RequestParam int id, @ModelAttribute Product products1) {
		Product product1 = pd.get(id);
		return new ModelAndView("ShowProducts", "product", product1);
	}
	/*@RequestMapping(value = "viewproductuser", method = RequestMethod.GET)
	public ModelAndView viewProuser(@RequestParam int id, @ModelAttribute Product products) {
		Product product = pd.get(id);
		return new ModelAndView("viewproductuser", "product", product);
	}
	 	
	@RequestMapping(value = "ShowProductuser", method = RequestMethod.GET)
	public ModelAndView ShowProuser(@RequestParam int id, @ModelAttribute Product products) {
		Product product = pd.get(id);
		return new ModelAndView("ShowProductuser", "product", product);
	}*/
	 @RequestMapping("editproduct")
		public ModelAndView display15() {
			ModelAndView m6 = new ModelAndView("editproduct");
			return m6;

		}		 		 
	 @RequestMapping(value="editproduct",method=RequestMethod.GET)
	    public ModelAndView editPro(@RequestParam int id,@ModelAttribute Product product){
		 Product product1=pd.get(id);
	    	return new ModelAndView("editproduct","Product",product1);
	    	
	    }
	 
	/* @RequestMapping(value="updateProduct",method=RequestMethod.POST)
	    public ModelAndView updateProduct(HttpServletRequest request,@Valid @ModelAttribute("product")Product editPro,BindingResult result,Model model)
	    {
			pd.update(editPro);
			return new ModelAndView("ManageProducts");
	    }	
	*/
	 @RequestMapping(value="/update",method=RequestMethod.POST)
	    public ModelAndView updateProduct(HttpServletRequest request,@Valid @ModelAttribute("Product")Product product,BindingResult result)
	    {
	    	
	    	String filename=product.getImg().getOriginalFilename();
	    	
	    	product.setImage(filename);
     	
	    	try{
     		byte[] bytes=new byte[product.getImg().getInputStream().available()];
     		product.getImg().getInputStream().read(bytes);
     		BufferedInputStream buffer=new BufferedInputStream(product.getImg().getInputStream());
     		MultipartFile file=product.getImg();
     		String path=request.getServletContext().getRealPath("/")+"resources/images";
     		File rootPath=new File(path);
     		if(!rootPath.exists())
     			rootPath.mkdirs();
     		File store=new File(rootPath.getAbsolutePath()+"/"+filename);
     		System.out.println("Image path :"+path);
     		OutputStream os=new FileOutputStream(store);
     		os.write(bytes);
     	}
     	catch(Exception e){
     		System.out.println(e.getMessage());
     	}
     		        
	    	pd.Update(product);
	    	return new ModelAndView("ManageProducts");
	    }	


}
