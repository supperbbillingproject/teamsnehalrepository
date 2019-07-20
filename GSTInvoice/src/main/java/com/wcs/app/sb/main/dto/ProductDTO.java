package com.wcs.app.sb.main.dto;

public class ProductDTO {
	private int productid;
	private int quantity;
	private String productname;
	private String hsncode;
	private String producttype;
	private String productcode;
	private String productcategoryname;
	private float sellingPrice;
	private int tax;
	private String suppliername;
	private float taxableprice;
	private float totaltaxperqty;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getHsncode() {
		return hsncode;
	}

	public void setHsncode(String hsncode) {
		this.hsncode = hsncode;
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

	public void setProductcategoryname(String productcategoryname) {
		this.productcategoryname = productcategoryname;
	}

	public float getSellingPrice() {
		return sellingPrice;
	}

	public void setSellingPrice(float sellingPrice) {
		this.sellingPrice = sellingPrice;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public String getSuppliername() {
		return suppliername;
	}

	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}

	public float getTaxableprice() {
		return taxableprice;
	}

	public void setTaxableprice(float taxableprice) {
		this.taxableprice = taxableprice;
	}

	public float getTotaltaxperqty() {
		return totaltaxperqty;
	}

	public void setTotaltaxperqty(float totaltaxperqty) {
		this.totaltaxperqty = totaltaxperqty;
	}

}
