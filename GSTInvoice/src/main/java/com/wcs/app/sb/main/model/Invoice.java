package com.wcs.app.sb.main.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Invoice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@OneToOne(cascade=CascadeType.ALL)
	private Customer customer;
	private String invoiceNo;
	@Temporal(TemporalType.DATE)
	private Date date;
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Invoicequantity> map = new HashMap<>();
	//@OneToOne(cascade=CascadeType.ALL)
	//private Map<String, Discount> dmap = new HashMap<>();
	private float discount;
	@OneToMany(cascade= CascadeType.ALL)
	private Map<String, InvoiceProductUnitPrice> pmap = new HashMap<>();
	private float totalamount;
	private float totaldiscountamount;
	private float payableamount;
	private String invoicegeneratedby;
	private float totaltaxamount;
	private float servicecharges;
	private float deliverycharges;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Map<String, Invoicequantity> getMap() {
		return map;
	}
	public void setMap(Map<String, Invoicequantity> map) {
		this.map = map;
	}	
	
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public Map<String, InvoiceProductUnitPrice> getPmap() {
		return pmap;
	}
	public void setPmap(Map<String, InvoiceProductUnitPrice> pmap) {
		this.pmap = pmap;
	}
	public float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(float totalamount) {
		this.totalamount = totalamount;
	}
	public float getTotaldiscountamount() {
		return totaldiscountamount;
	}
	public void setTotaldiscountamount(float totaldiscountamount) {
		this.totaldiscountamount = totaldiscountamount;
	}
	public float getPayableamount() {
		return payableamount;
	}
	public void setPayableamount(float payableamount) {
		this.payableamount = payableamount;
	}
	public String getInvoicegeneratedby() {
		return invoicegeneratedby;
	}
	public void setInvoicegeneratedby(String invoicegeneratedby) {
		this.invoicegeneratedby = invoicegeneratedby;
	}
	public float getTotaltaxamount() {
		return totaltaxamount;
	}
	public void setTotaltaxamount(float totaltaxamount) {
		this.totaltaxamount = totaltaxamount;
	}
	public float getServicecharges() {
		return servicecharges;
	}
	public void setServicecharges(float servicecharges) {
		this.servicecharges = servicecharges;
	}
	public float getDeliverycharges() {
		return deliverycharges;
	}
	public void setDeliverycharges(float deliverycharges) {
		this.deliverycharges = deliverycharges;
	}
	
	
}
