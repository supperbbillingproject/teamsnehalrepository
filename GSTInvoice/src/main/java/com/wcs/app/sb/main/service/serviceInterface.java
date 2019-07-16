package com.wcs.app.sb.main.service;

import java.util.List;

import com.wcs.app.sb.main.dto.InvoiceDTO;
import com.wcs.app.sb.main.model.Invoice;

public interface serviceInterface {

	public Invoice saveInvoice(Invoice i);

	public List<InvoiceDTO> findInvoiceNumber();

}
