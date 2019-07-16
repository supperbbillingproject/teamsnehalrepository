package com.wcs.app.sb.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productid;
	private String productname;
	private String productcode;
	private String producthsncode;
	
	private String producttype;
	@OneToOne(cascade=CascadeType.ALL)
	private ProductCategory productcategory;
	private String productbrand;
	@OneToOne(cascade=CascadeType.ALL)
	private Status returnstatus;
	private String productdiscription;
	private String productdate;
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getProducthsncode() {
		return producthsncode;
	}
	public void setProducthsncode(String producthsncode) {
		this.producthsncode = producthsncode;
	}
	public String getProducttype() {
		return producttype;
	}
	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}
	public ProductCategory getProductcategory() {
		return productcategory;
	}
	public void setProductcategory(ProductCategory productcategory) {
		this.productcategory = productcategory;
	}
	public String getProductbrand() {
		return productbrand;
	}
	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}
	public Status getReturnstatus() {
		return returnstatus;
	}
	public void setReturnstatus(Status returnstatus) {
		this.returnstatus = returnstatus;
	}
	public String getProductdiscription() {
		return productdiscription;
	}
	public void setProductdiscription(String productdiscription) {
		this.productdiscription = productdiscription;
	}
	public String getProductdate() {
		return productdate;
	}
	public void setProductdate(String productdate) {
		this.productdate = productdate;
	}
	
	
}
