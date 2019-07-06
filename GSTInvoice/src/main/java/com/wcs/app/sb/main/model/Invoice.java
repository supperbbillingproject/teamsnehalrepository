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
public class Invoice {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@OneToOne(cascade=CascadeType.ALL)
	private Customer customer;
	private String invoiceNo;
	private String date;
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Invoicequantity> map = new HashMap<>();
	@OneToMany(cascade=CascadeType.ALL)
	private Map<String, Discount> dmap = new HashMap<>();
	private float totalamount;
	private float totaldiscountamount;
	private float payableamount;
	private String invoicegeneratedby;
	private float totaltaxamount;
	private float servicecharges;
	private float deliverycharges;
}
