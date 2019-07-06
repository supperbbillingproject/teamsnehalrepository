package com.wcs.app.sb.main.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ReturnInvoice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Returnquantity> map = new HashMap<>();
	private String date;
	private String invoiceno;
	@OneToOne(cascade=CascadeType.ALL)
	private Status returnstatus;
	private float returnamount;
	private String returnby;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Map<String, Returnquantity> getMap() {
		return map;
	}
	public void setMap(Map<String, Returnquantity> map) {
		this.map = map;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}
	public Status getReturnstatus() {
		return returnstatus;
	}
	public void setReturnstatus(Status returnstatus) {
		this.returnstatus = returnstatus;
	}
	public float getReturnamount() {
		return returnamount;
	}
	public void setReturnamount(float returnamount) {
		this.returnamount = returnamount;
	}
	public String getReturnby() {
		return returnby;
	}
	public void setReturnby(String returnby) {
		this.returnby = returnby;
	}
	
}
