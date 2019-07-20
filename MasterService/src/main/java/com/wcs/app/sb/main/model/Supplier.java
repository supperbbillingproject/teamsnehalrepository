package com.wcs.app.sb.main.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Supplier {
	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int supplierid;
	private String suppliername;
	private String supplieraddress;

	@OneToOne(cascade=CascadeType.MERGE)
	private District district;
	@OneToOne(cascade=CascadeType.MERGE)
	private State state;
	private String gstin;
	@OneToOne(cascade=CascadeType.MERGE)
	private Country country;
	@Temporal(TemporalType.DATE)
	private Date date;
	private String suppliercompanyname;
	
	public String getSuppliercompanyname() {
		return suppliercompanyname;
	}
	public void setSuppliercompanyname(String suppliercompanyname) {
		this.suppliercompanyname = suppliercompanyname;
	}

	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getSuppliername() {
		return suppliername;
	}
	public void setSuppliername(String suppliername) {
		this.suppliername = suppliername;
	}
	public String getSupplieraddress() {
		return supplieraddress;
	}
	public void setSupplieraddress(String supplieraddress) {
		this.supplieraddress = supplieraddress;
	}
	public District getDistrict() {
		return district;
	}
	public void setDistrict(District district) {
		this.district = district;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	public String getGstin() {
		return gstin;
	}
	public void setGstin(String gstin) {
		this.gstin = gstin;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}	

	
}
