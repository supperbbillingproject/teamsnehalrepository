package com.wcs.app.sb.main.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.City;
import com.wcs.app.sb.main.model.Country;
import com.wcs.app.sb.main.model.State;

public interface IStateRepository extends PagingAndSortingRepository<State, Integer>{

	List<State> findAllByCountry(Country countryid);

}
