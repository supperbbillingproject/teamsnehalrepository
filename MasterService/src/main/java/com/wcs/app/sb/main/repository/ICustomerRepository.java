package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.Customer;

public interface ICustomerRepository extends PagingAndSortingRepository<Customer, Integer>{

	public Customer findAllByCustomermobile(long customermobile);

}
