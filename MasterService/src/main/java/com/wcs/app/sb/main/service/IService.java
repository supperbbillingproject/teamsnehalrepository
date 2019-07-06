package com.wcs.app.sb.main.service;

import java.util.List;

import com.wcs.app.sb.main.model.Customer;
import com.wcs.app.sb.main.model.Ledger;
import com.wcs.app.sb.main.model.Product;
import com.wcs.app.sb.main.model.ProductCategory;

public interface IService {
	public Ledger addLedger(Ledger l);
	public List<Ledger> getLedger();
	public Product getProduct(String productcode);
	public List<ProductCategory> getProductCategory(String productcategoryname);
	public Customer getCustomer(long customermobile);
	
}
