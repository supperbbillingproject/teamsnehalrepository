package com.wcs.app.sb.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.wcs.app.sb.main.repository.ICountryRepository;
import com.wcs.app.sb.main.repository.ICustomerRepository;
import com.wcs.app.sb.main.repository.IDistrictRepository;
import com.wcs.app.sb.main.repository.ILedgerRepository;
import com.wcs.app.sb.main.repository.IProductCategoryRepository;
import com.wcs.app.sb.main.repository.IProductPriceMappingRepository;
import com.wcs.app.sb.main.repository.IProductRepository;
import com.wcs.app.sb.main.repository.IStateRepository;
import com.wcs.app.sb.main.repository.ISupplierRepository;

@Service
public class Serviceimpl implements IService{
	@Autowired
	ILedgerRepository ilr;
	@Autowired
	IProductRepository ipr;
	@Autowired
	IProductCategoryRepository ipcr;
	@Autowired

	ICustomerRepository icr;	
	@Autowired
	ICountryRepository icnr;	
	@Autowired
	ISupplierRepository isr;	
	@Autowired
	IStateRepository istr;
	@Autowired
	IDistrictRepository idr;
	@Autowired
	IProductPriceMappingRepository ppr;

	@Override
	public Ledger addLedger(Ledger l) {
		Ledger l1 = ilr.save(l);
		return l1;
	}

	@Override
	public List<Ledger> getLedger() {
		List<Ledger>li = ilr.findAll();
		return li;
	}

	@Override
	public Product getProduct(String productcode) {
		Product p = ipr.findAllByProductcode(productcode);
		return p;
	}

	@Override
	public List<ProductCategory> getProductCategory(String productcategoryname) {
		List<ProductCategory> li = ipcr.findAllByProductcategoryname(productcategoryname);
		return li;
	}

	@Override
	public Customer getCustomer(long customermobile) {
		Customer customer = icr.findAllByCustomermobile(customermobile);
		return customer;
	}

	@Override
	public List<ProductPriceMaappingDto> getAllProducts() {
		List<ProductPriceMaappingDto> li =(List<ProductPriceMaappingDto>) ppr.getAllProducts();
		return li;
	}

	@Override
	public List<ProductCategory> getAllProductCategories() {
		List<ProductCategory> li = (List<ProductCategory>) ipcr.findAll();
		return li;
	}

	@Override
	public Supplier save(Supplier s) {
		Supplier sup=isr.save(s);
		return sup;
	}

	@Override
	public List<Country> getCountryList() {
		List<Country> li = (List<Country>) icnr.findAll();
		return li;
	}

	@Override
	public List<State> getStateList(Country countryid) {
		List<State> li = istr.findAllByCountry(countryid);
		return li;
	}

	@Override
	public List<District> getDistrictList(State stateid) {
		List<District> li = idr.findAllByState(stateid);
		return li;
	}

	@Override
	public ProductPriceMaappingDto getdata(String productcode) {
		return ppr.fetchdata(productcode);
	}

	@Override
	public void savedata(ProductPriceMapping p) {
		ppr.save(p);
		
	}

}
