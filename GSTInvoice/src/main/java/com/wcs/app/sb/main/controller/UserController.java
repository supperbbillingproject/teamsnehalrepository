package com.wcs.app.sb.main.controller;


import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.wcs.app.sb.main.dto.InvoiceDTO;
import com.wcs.app.sb.main.dto.InvoiceDetails;
import com.wcs.app.sb.main.dto.ProductDTO;
import com.wcs.app.sb.main.dto.ProductPriceMaappingDto;
import com.wcs.app.sb.main.model.Customer;
import com.wcs.app.sb.main.model.Invoice;
import com.wcs.app.sb.main.model.InvoiceProductUnitPrice;
import com.wcs.app.sb.main.model.Invoicequantity;
import com.wcs.app.sb.main.model.Product;
import com.wcs.app.sb.main.model.ProductCategory;
import com.wcs.app.sb.main.service.serviceInterface;
import com.wcs.app.sb.main.utility.InvoiceNoAutoGenerator;
import com.wcs.app.sb.main.model.Customer;
import com.wcs.app.sb.main.model.Product;
import com.wcs.app.sb.main.model.ProductCategory;

@CrossOrigin("*")
@RestController
public class UserController {
	@Autowired 
	RestTemplate rstemp;
	@Autowired
	serviceInterface si;
	
	@RequestMapping("/")
	public String beforeLogin()
	{
		System.out.println("gstinvoice");
		return "GSTInvoice";
	}	
	
	//to get product by product code for creating bill
	
	@RequestMapping(value="/product/{productcode}", method=RequestMethod.GET, produces="application/json")
	public ProductPriceMaappingDto getProduct(@PathVariable String productcode)
	{
		System.out.println("in gst controller");
		String url="http://localhost:8081/getProduct/getProduct/"+productcode;
		RestTemplate rstemp1=new RestTemplate();
		ProductPriceMaappingDto p = rstemp1.getForObject(url, ProductPriceMaappingDto.class);
		//System.out.println(p);
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
	

	//to get all products in a list
	@RequestMapping(value="/product", method=RequestMethod.GET, produces="application/json")
	public List<ProductPriceMaappingDto> getAllProducts()
	{
		System.out.println("in gst controller");
		String url="http://localhost:8081/getProduct/getAllProducts/";
		RestTemplate rstemp1=new RestTemplate();
		List<ProductPriceMaappingDto> li = rstemp1.getForObject(url, List.class);
		System.out.println(li);
		return li;
		
	}
	
	//to get all categories in list
	@RequestMapping(value="/productCategory", method=RequestMethod.GET, produces="application/json")
	public List<ProductCategory> getAllCategory()
	{
		System.out.println("in gst controller");
		String url="http://localhost:8081/getCategory/getAllProductCategories/";
		RestTemplate rstemp1=new RestTemplate();
		List<ProductCategory> li = rstemp1.getForObject(url, List.class);
		System.out.println(li);
		return li;
		
	}
	
	//to save invoice data
	@RequestMapping(value="/invoice", method=RequestMethod.POST, consumes="application/json")
	public Invoice saveInvoice(@RequestBody InvoiceDetails i) {
		/*System.out.println("ikkk");
		System.out.println(i);*/
		
		List<InvoiceDTO> li = si.findInvoiceNumber();
		String invoiceNumber = InvoiceNoAutoGenerator.invoiceNumberGenerator(li);

		System.out.println(i.getCustomerinfo().getCustomername());
		System.out.println(i.getCustomerinfo().getCustomermobile());
		System.out.println(i.getInfo());
		Customer cust = new Customer();
		cust.setCustomername(i.getCustomerinfo().getCustomername());
		cust.setCustomertype(i.getCustomerinfo().getCustomertype());
		cust.setCustomermobile(i.getCustomerinfo().getCustomermobile());
		cust.setEmail(i.getCustomerinfo().getEmail());
		cust.setDoorno(i.getCustomerinfo().getDoorno());
		cust.setLaneno(i.getCustomerinfo().getLaneno());
		cust.setArea(i.getCustomerinfo().getArea());
		cust.setStreetno(i.getCustomerinfo().getStreetno());
		cust.setCity(i.getCustomerinfo().getCity());
		cust.setState(i.getCustomerinfo().getState());
		cust.setCountry(i.getCustomerinfo().getCountry());
		cust.setZipcode(i.getCustomerinfo().getZipcode());
		
		Invoice ii = new Invoice();
		
		ii.setCustomer(cust);
		
		for (ProductDTO pro : i.getInfo()) {
			Invoicequantity iq = new Invoicequantity();
			iq.setQuantity(pro.getQuantity());
			InvoiceProductUnitPrice ipup = new InvoiceProductUnitPrice();
			ipup.setPrice(pro.getSellingPrice());
			ii.getMap().put(pro.getProductname(),iq);
			ii.getPmap().put(pro.getProductname(), ipup);
		}
		Date date = new Date(); 
		
		ii.setTotalamount(i.getTotalamount());
		ii.setTotaltaxamount(i.getTotaltaxamount());
		ii.setTotaldiscountamount(i.getTotaldiscountamount());
		ii.setPayableamount(i.getPayableamount());
		ii.setDeliverycharges(i.getDeliverycharges());
		ii.setServicecharges(i.getServicecharges());
		ii.setDate(date);
		ii.setInvoiceNo(invoiceNumber);
		
		Invoice i1 = si.saveInvoice(ii);
		return i1;
		
	}

	
}
