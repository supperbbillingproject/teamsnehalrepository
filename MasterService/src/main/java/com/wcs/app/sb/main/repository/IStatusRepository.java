package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.City;
import com.wcs.app.sb.main.model.Status;

public interface IStatusRepository extends PagingAndSortingRepository<Status, Integer>{

}
