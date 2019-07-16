package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.City;

public interface ICityRepository extends PagingAndSortingRepository<City, Integer>{

}
