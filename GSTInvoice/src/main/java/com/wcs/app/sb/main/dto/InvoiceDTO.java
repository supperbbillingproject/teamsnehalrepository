package com.wcs.app.sb.main.dto;

public class InvoiceDTO {
	private String invoiceNo;

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	
	public InvoiceDTO(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
}
