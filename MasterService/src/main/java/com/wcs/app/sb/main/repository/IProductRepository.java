package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.Product;

public interface IProductRepository extends PagingAndSortingRepository<Product, Integer>{
	public Product findAllByProductcode(String productcode);
}
