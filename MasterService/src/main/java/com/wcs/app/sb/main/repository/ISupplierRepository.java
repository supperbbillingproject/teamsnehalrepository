package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.City;
import com.wcs.app.sb.main.model.Supplier;

public interface ISupplierRepository extends PagingAndSortingRepository<Supplier, Integer>{
	Supplier save(Supplier s);
}
