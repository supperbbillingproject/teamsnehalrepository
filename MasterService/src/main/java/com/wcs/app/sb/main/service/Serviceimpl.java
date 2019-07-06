package com.wcs.app.sb.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wcs.app.sb.main.model.Customer;
import com.wcs.app.sb.main.model.Ledger;
import com.wcs.app.sb.main.model.Product;
import com.wcs.app.sb.main.model.ProductCategory;
import com.wcs.app.sb.main.repository.ICustomerRepository;
import com.wcs.app.sb.main.repository.ILedgerRepository;
import com.wcs.app.sb.main.repository.IProductCategoryRepository;
import com.wcs.app.sb.main.repository.IProductRepository;

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

}
