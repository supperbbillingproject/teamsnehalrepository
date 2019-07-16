package com.wcs.app.sb.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Country {
	
	@Id
	private int countryid;
	private String countryname;
	public int getCountryid() {
		return countryid;
	}
	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	
	
}
