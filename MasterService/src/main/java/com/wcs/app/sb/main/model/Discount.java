package com.wcs.app.sb.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Discount {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int discountid;
	private float discountpercentage;
	private String discountdiscription;
	private String discounttitle;
	private String discountdate;
	public int getDiscountid() {
		return discountid;
	}
	public void setDiscountid(int discountid) {
		this.discountid = discountid;
	}
	public float getDiscountpercentage() {
		return discountpercentage;
	}
	public void setDiscountpercentage(float discountpercentage) {
		this.discountpercentage = discountpercentage;
	}
	public String getDiscountdiscription() {
		return discountdiscription;
	}
	public void setDiscountdiscription(String discountdiscription) {
		this.discountdiscription = discountdiscription;
	}
	public String getDiscounttitle() {
		return discounttitle;
	}
	public void setDiscounttitle(String discounttitle) {
		this.discounttitle = discounttitle;
	}
	public String getDiscountdate() {
		return discountdate;
	}
	public void setDiscountdate(String discountdate) {
		this.discountdate = discountdate;
	}
	

}
