package com.wcs.app.sb.main.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.District;
import com.wcs.app.sb.main.model.State;

public interface IDistrictRepository extends PagingAndSortingRepository<District, Integer>{

	List<District> findAllByState(State stateid);

}
