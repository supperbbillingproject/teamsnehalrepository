package com.wcs.app.sb.main.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.wcs.app.sb.main.model.ProductPriceMapping;

public interface IProductPriceMappingRepository extends PagingAndSortingRepository<ProductPriceMapping, Integer>{

}
