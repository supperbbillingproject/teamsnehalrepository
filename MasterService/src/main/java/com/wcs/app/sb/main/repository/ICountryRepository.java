package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.Country;

public interface ICountryRepository extends PagingAndSortingRepository<Country, Integer>{

}
