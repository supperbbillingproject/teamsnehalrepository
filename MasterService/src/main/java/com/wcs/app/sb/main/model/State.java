package com.wcs.app.sb.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class State {

	public State() {
		// TODO Auto-generated constructor stub
	}

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
	private int stateid;
	public int getStateid() {
	return stateid;
}
public void setStateid(int stateid) {
	this.stateid = stateid;
}
public String getStatename() {
	return statename;
}
public void setStatename(String statename) {
	this.statename = statename;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
	private String statename;
	@OneToOne(cascade=CascadeType.ALL)
	private Country country;
	
}
