package com.wcs.app.sb.main.service;

import java.util.List;

import com.wcs.app.sb.main.dto.ProductPriceMaappingDto;
import com.wcs.app.sb.main.model.Country;
import com.wcs.app.sb.main.model.Customer;
import com.wcs.app.sb.main.model.District;
import com.wcs.app.sb.main.model.Ledger;
import com.wcs.app.sb.main.model.Product;
import com.wcs.app.sb.main.model.ProductCategory;
import com.wcs.app.sb.main.model.ProductPriceMapping;
import com.wcs.app.sb.main.model.State;
import com.wcs.app.sb.main.model.Supplier;


public interface IService {
	public Ledger addLedger(Ledger l);
	public List<Ledger> getLedger();
	public Product getProduct(String productcode);
	public List<ProductCategory> getProductCategory(String productcategoryname);
	public Customer getCustomer(long customermobile);

	public List<ProductPriceMaappingDto> getAllProducts();
	public List<ProductCategory> getAllProductCategories();
	public Supplier save(Supplier s);
	public List<Country> getCountryList();
	public List<State> getStateList(Country country);
	public List<District> getDistrictList(State stateid);
	
	public ProductPriceMaappingDto getdata(String productcode);
	
	public void savedata(ProductPriceMapping p);

	
}
