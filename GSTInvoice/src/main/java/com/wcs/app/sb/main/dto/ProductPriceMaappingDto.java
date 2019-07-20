package com.wcs.app.sb.main.dto;



public class ProductPriceMaappingDto 
{
	private String productname;
	private String producthsncode;
	private String  producttype;
	private String productcode;
	private String productcategoryname;
	private String productbrand;
	private float sellingprice;
	private float taxgroup;
	private String suppliername;
		
	
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public float getTaxgroup() {
		return taxgroup;
	}
	public void setTaxgroup(float taxgroup) {
		this.taxgroup = taxgroup;
	}
	public void setProductcategoryname(String productcategoryname) {
		this.productcategoryname = productcategoryname;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
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
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public String getProductcategoryname() {
		return productcategoryname;
	}
	public void setProductcategorynam(String productcategorynam) {
		this.productcategoryname = productcategoryname;
	}
	public String getProductbrand() {
		return productbrand;
	}
	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}
	public float getSellingprice() {
		return sellingprice;
	}
	public void setSellingprice(float sellingprice) {
		this.sellingprice = sellingprice;
	}
	
	
	

}
