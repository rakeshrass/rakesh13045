package com.niit.shoppingcart.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity   //it specifies a class as a entity
@Table(name = "Product")  //it will creates the name
@Component
/*@Component annotation marks a java class as a bean ,
so the component-scanning mechanism of spring can pick it up and pull it into the application context. 
JavaBeans are classes that encapsulate many objects into a single object (the bean). 
They are serializable, have a zero-argument constructor, and allow access to properties using getter and setter methods.
*/
//Public variables, are variables that are visible to all classes
public class Product {   

	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.AUTO) // it will auto generate the id.
	@Column(name = "Id") //column name
	private int id; /* Private variables, are variables that are visible only to the class to which they belong. 
	Protected variables, are variables that are visible only to the class to which they belong, and any subclasses.*/
	@NotNull
	@Size(min=2,max=30,message="Username Must be more than 2 letters")
	@Column(name="Name",unique=true)
	private String Name;
	@NotNull
	@Size(min=2,max=30)
	@Column(name="Description")
	private String Description;
	@NotNull
	@Size(min=2,max=30)
	@Column(name="primarymaterial")
	private String primarymaterial;
	@NotNull
	@Size(min=2,max=30)
	@Column(name="style")
	private String style;
	@NotNull
	@Size(min=2,max=30)
	@Column(name="warranty")
	private String warranty;
	@NotNull
	@Size(min=2,max=30)
	@Column(name="capacity")
	private String capacity;
	@OneToOne(cascade=CascadeType.PERSIST)  //which will joins the one class column to another class column
	@JoinColumn(name="supplier")
	private Supplier supplier;
	private int quantity;
	private double Price;
	@Column(name = "image", columnDefinition = "varchar(255)")
	@Size(min = 3, message = "Please Select the Image")
	private String image;
	@JsonIgnore  // 
	transient private MultipartFile img;  //A representation of an uploaded file received in a multipart request.
	public Product(int id,String Name,String Description,String primarymaterial,String style,String warranty,String capacity,Supplier supplier,int supplierid,String suppliername,int quantity,double Price,String image,MultipartFile img) {
	this.id=id;
	this.Name = Name;
	this.Description = Description;
	this.primarymaterial = primarymaterial;
	this.style = style;	
	this.warranty = warranty;
	this.capacity = capacity;
	this.supplier = supplier;
	this.quantity = quantity;	
	this.Price = Price;	
	this.image = image;
	this.img = img;	
	}
	 public Product() {
	}
	 /*Getter and setter methods are used to retrieve and manipulate private variables in a different class. 
	  A "getter" method does as it name suggest, retrieves a the attribute of the same name. 
	  A setter method allows you to set the value of the attribute.
	  */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getPrimarymaterial() {
		return primarymaterial;
	}
	public void setPrimarymaterial(String primarymaterial) {
		this.primarymaterial = primarymaterial;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getWarranty() {
		return warranty;
	}
	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public MultipartFile getImg() {
		return img;
	}
	public void setImg(MultipartFile img) {
		this.img = img;
	}
	 
	
}