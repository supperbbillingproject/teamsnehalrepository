package com.wcs.app.sb.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.wcs.app.sb.main.dto.InvoiceDTO;
import com.wcs.app.sb.main.model.Invoice;

@Repository
public interface IinvoiceRepository extends PagingAndSortingRepository<Invoice, Integer> {
	@Query("select new com.wcs.app.sb.main.dto.InvoiceDTO(i.invoiceNo)"+ "from Invoice i")
	List<InvoiceDTO> findInvoiceNumber();
}
