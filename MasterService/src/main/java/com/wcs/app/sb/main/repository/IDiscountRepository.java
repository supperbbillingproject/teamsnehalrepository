package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.Discount;

public interface IDiscountRepository extends PagingAndSortingRepository<Discount, Integer>{

}
