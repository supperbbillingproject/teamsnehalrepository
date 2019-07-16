package com.wcs.app.sb.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class District {
	public District() {
		// TODO Auto-generated constructor stub
	}
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
    private int districtid;

	private String districtname;
	@OneToOne(cascade=CascadeType.ALL)
	private State state;
	public int getDistrictid() {
		return districtid;
	}
	public void setDistrictid(int districtid) {
		this.districtid = districtid;
	}
	public String getDistrictname() {
		return districtname;
	}
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
}
