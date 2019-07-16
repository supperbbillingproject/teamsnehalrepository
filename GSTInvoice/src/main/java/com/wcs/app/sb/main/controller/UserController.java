package com.wcs.app.sb.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.wcs.app.sb.main.model.Customer;
import com.wcs.app.sb.main.model.Product;
import com.wcs.app.sb.main.model.ProductCategory;
@CrossOrigin("*")
@RestController
public class UserController {
	@Autowired 
	RestTemplate rstemp;
	
	@RequestMapping("/")
	public String beforeLogin()
	{
		System.out.println("gstinvoice");
		return "GSTInvoice";
	}	
	
	//to get product by product code for creating bill
	
	@RequestMapping(value="/product/{productcode}", method=RequestMethod.GET, produces="application/json")
	public Product getProduct(@PathVariable String productcode)
	{
		System.out.println("in gst controller");
		String url="http://localhost:8081/getProduct/getProduct/"+productcode;
		RestTemplate rstemp1=new RestTemplate();
		Product p = rstemp1.getForObject(url, Product.class);
		System.out.println(p);
		return p;
		
	}
	
	//to get product category by category name
	
	@RequestMapping(value="/productCategory/{productcategoryname}", method=RequestMethod.GET, produces="application/json")
	public List<ProductCategory> getCategory(@PathVariable String productcategoryname)
	{
		System.out.println("in gst controller");
		String url="http://localhost:8081/getCategory/getProductCategory/"+productcategoryname;
		RestTemplate rstemp1=new RestTemplate();
		List<ProductCategory> li = rstemp1.getForObject(url, List.class);
		System.out.println(li);
		return li;
		
	}
	
	//to get customer by phone number
	@RequestMapping(value="/customer/{customermobile}", method=RequestMethod.GET, produces="application/json")
	public Customer getCustomer(@PathVariable long customermobile)
	{
		System.out.println("in gst controller");
		String url="http://localhost:8081/getCustomer/getCustomer/"+customermobile;
		RestTemplate rstemp1=new RestTemplate();
		Customer customer = rstemp1.getForObject(url, Customer.class);
		System.out.println(customer);
		return customer;
		
	}
	
	
	
}
