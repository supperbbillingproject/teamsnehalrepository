package com.wcs.app.sb.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.wcs.app.sb.main.dto.ProductPriceMaappingDto;
import com.wcs.app.sb.main.model.ProductPriceMapping;
@Repository
public interface IProductPriceMappingRepository extends PagingAndSortingRepository<ProductPriceMapping, Integer>{
	
	@Query("select new com.wcs.app.sb.main.dto.ProductPriceMaappingDto(p.productname, p.producthsncode,p.producttype,p.productcode, pc.productcategoryname, ppm.sellingprice, ppm.taxgroup, s.suppliername)"+ "from ProductPriceMapping ppm left join ppm.product p left join p.productcategory pc left join ppm.supplier s "+"where productcode=:productcode")
	public ProductPriceMaappingDto fetchdata(String productcode);

	@Query("select new com.wcs.app.sb.main.dto.ProductPriceMaappingDto(p.productname, p.producthsncode,p.producttype,p.productcode, pc.productcategoryname, ppm.sellingprice, ppm.taxgroup, s.suppliername)"+ "from ProductPriceMapping ppm left join ppm.product p left join p.productcategory pc left join ppm.supplier s ")
	public List<ProductPriceMaappingDto> getAllProducts();
}
