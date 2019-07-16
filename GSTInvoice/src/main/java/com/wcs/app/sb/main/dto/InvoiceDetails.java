package com.wcs.app.sb.main.dto;

import com.wcs.app.sb.main.model.Customer;

public class InvoiceDetails {
	private ProductDTO[] info;
	private Customer customerinfo;
	private float totalamount;
	private float totaldiscountamount;
	private float payableamount;
	private String invoicegeneratedby;
	private float totaltaxamount;
	private float servicecharges;
	private float deliverycharges;

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

	public ProductDTO[] getInfo() {
		return info;
	}

	public void setInfo(ProductDTO[] info) {
		this.info = info;
	}

	public Customer getCustomerinfo() {
		return customerinfo;
	}

	public void setCustomerinfo(Customer customerinfo) {
		this.customerinfo = customerinfo;
	}



}
