package com.wcs.app.sb.main.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wcs.app.sb.main.dto.InvoiceDTO;
import com.wcs.app.sb.main.model.Invoice;
import com.wcs.app.sb.main.repository.IinvoiceRepository;

@Service
public class serviceImpl implements serviceInterface{
	@Autowired
	IinvoiceRepository iir;

	@Override
	public Invoice saveInvoice(Invoice i) {
		Invoice i1 = iir.save(i);
		return i1;
	}

	@Override
	public List<InvoiceDTO> findInvoiceNumber() {
		List<InvoiceDTO> li = iir.findInvoiceNumber();
		return li;
	}

}
