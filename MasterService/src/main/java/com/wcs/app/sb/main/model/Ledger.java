package com.wcs.app.sb.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ledger {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String ledgername;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getLedgername() {
	return ledgername;
}
public void setLedgername(String ledgername) {
	this.ledgername = ledgername;
}

	
}
