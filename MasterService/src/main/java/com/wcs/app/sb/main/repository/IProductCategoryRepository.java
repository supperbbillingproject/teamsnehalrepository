package com.wcs.app.sb.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.ProductCategory;

public interface IProductCategoryRepository extends PagingAndSortingRepository<ProductCategory, Integer>{

	@Query("select id,productcategoryname from ProductCategory where productcategoryname like '%productcategoryname%'")
	public List<ProductCategory> findAllByProductcategoryname(String productcategoryname);

}
