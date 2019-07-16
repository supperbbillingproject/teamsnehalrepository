package com.wcs.app.sb.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String paymentmode;
	private String invoiceno;
	private float paymentamount;
	@OneToOne(cascade=CascadeType.ALL)
	private Status paymentstatus;
	private String paymentacceptedby;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public String getInvoiceno() {
		return invoiceno;
	}
	public void setInvoiceno(String invoiceno) {
		this.invoiceno = invoiceno;
	}
	public float getPaymentamount() {
		return paymentamount;
	}
	public void setPaymentamount(float paymentamount) {
		this.paymentamount = paymentamount;
	}
	public Status getPaymentstatus() {
		return paymentstatus;
	}
	public void setPaymentstatus(Status paymentstatus) {
		this.paymentstatus = paymentstatus;
	}
	public String getPaymentacceptedby() {
		return paymentacceptedby;
	}
	public void setPaymentacceptedby(String paymentacceptedby) {
		this.paymentacceptedby = paymentacceptedby;
	}
	

}
