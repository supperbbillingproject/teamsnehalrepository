import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material';
import { ProductInformation } from 'app/model/ProductInformation.interface';
import { HttpClient } from '@angular/common/http';
import { ProductCategory } from 'app/model/productCategory.interface';
import { CustomerInformation } from 'app/model/customerinformation.interface';
import { ProductDTO } from 'app/model/ProductDTO.interface';
import { Router } from '@angular/router';
import { CloseScrollStrategy } from '@angular/cdk/overlay';
import { forEach } from '@angular/router/src/utils/collection';
import { Invoice } from 'app/model/invoice.interface';
import { InvoiceDetails } from 'app/model/InvoiceDetails.interface';

@Component({
  selector: 'app-dialog-content-example-dialog',
  templateUrl: 'dialog-content-example-dialog.html',
})
export class DialogContentExampleDialogComponent {
  url = 'http://localhost:8084';
  customerdata: CustomerInformation[];

  cust: CustomerInformation = {
    customerId: null,
    customerName: '',
    customerType: '',
    customerMobileNo: '',
    customerMailId: '',
    customerPanCardNo: '',
    customerDoorNo: '',
    customerStreetname: '',
    customerLaneName: '',
    customerArea: '',
    custmerZipcode: null,
    customerState: null,
    customerCountry: null,
    customerCity: null,
    customerGSTIN: ''
  }
  constructor(private http: HttpClient) { }

  getCustomer(customer) {
    console.log(customer.customerMobileNo);
    this.http.get(this.url + '/customer/' + customer.customerMobileNo).subscribe(
      (data: CustomerInformation[]) => {
        this.customerdata = data;
        console.log(this.customerdata);

      }
    )
  }





}
/******************************************************************** */
@Component({
  selector: 'app-bill',
  templateUrl: './bill.component.html',
  styleUrls: ['./bill.component.scss']
})
export class BillComponent implements OnInit {
  product: ProductInformation = {
    productid: null,
    productcode: '',
    productname: '',
    hsncode: '',
    productdescription: ''
  }

  cust: CustomerInformation = {
    customerId: null,
    customerName: '',
    customerType: '',
    customerMobileNo: '',
    customerMailId: '',
    customerPanCardNo: '',
    customerDoorNo: '',
    customerStreetname: '',
    customerLaneName: '',
    customerArea: '',
    custmerZipcode: null,
    customerState: null,
    customerCountry: null,
    customerCity: null,
    customerGSTIN: ''
  }

  productCat: ProductCategory = {
    productcategoryId: null,
    productcategoryName: ''
  }

  cartData: ProductDTO[] = [];
  // tslint:disable-next-line: no-unused-expression



  url = 'http://localhost:8084';
  productsdata: ProductDTO[];
  productcategoriesdata: ProductCategory[];
  customerdata: CustomerInformation[];

  totaltax: number = 0;
  taaax: number = 0;

  totalprice = 0;
  totalamount = 0;
  totalorderamount = 0;
  discount: number;
  subtotal = 0;
  servicecharges = 0;
  deliverycharges = 0;

  invoice: Invoice = {
    customer: {
      customerId: null,
      customerName: '',
      customerType: '',
      customerMobileNo: null,
      customerMailId: '',
      customerPanCardNo: null,
      customerDoorNo: null,
      customerStreetname: '',
      customerLaneName: '',
      customerArea: '',
      customerCity: { cityId: null, cityName: '', cityDistrict: null },
      customerState: { stateid: null, statename: '', country: null },
      customerCountry: { countryid: null, countryname: '' },
      custmerZipcode: null,
      customerGSTIN: null
    },
    invoiceNo: null,
    date: '',
    totalamount: null,
    totaldiscountamount: null,
    payableamount: null,
    totaltaxamount: null,
    servicecharges: null,
    deliverycharges: null,
    discount: null,
    invoicegeneratedby: '',
    map: null,
    pmap: null
  }

  invoicedata: InvoiceDetails;


  constructor(public dialog: MatDialog, private http: HttpClient, private router: Router) { }



  openDialog(customerdata) {
    const dialogRef = this.dialog.open(DialogContentExampleDialogComponent, customerdata);

    dialogRef.afterClosed().subscribe(customerdata => {
      console.log(`Dialog result: ${customerdata.customername}`);
      this.cust = customerdata;
    });
  }


  getProduct(product) {
    this.http.get(this.url + '/product/' + product.productCode).subscribe();
  }

  ngOnInit() {
    this.getAllProductCategories();
    this.getAllProducts();
  }

  getAllProductCategories() {
    this.http.get(this.url + '/productCategory').subscribe(
      (categorydata: ProductCategory[]) => {
        this.productcategoriesdata = categorydata;
        console.log(this.productcategoriesdata);
      }
    );
  }

  getAllProducts() {
    this.http.get(this.url + '/product').subscribe(
      (productdata: ProductDTO[]) => {
        this.productsdata = productdata;
        console.log(this.productsdata);

      }
    );
  }

  addProductCart(pro) {
    console.log(this.cartData)
    if (this.cartData.indexOf(pro) === -1) {
      pro.quantity = 1;
      this.cartData.push(pro);
    }
    else {
      pro.quantity++;
    }
    pro.taxableprice = pro.sellingprice * pro.quantity;
    pro.totaltaxperqty = (pro.sellingprice * pro.taxgroup / 100);
    console.log('proTax' + pro.totaltaxperqty);
    this.taaax = this.totaltax + pro.totaltaxperqty;
    pro.totaltaxperqty = 0;
    this.totaltax = this.taaax;
    console.log('taax' + this.taaax);
    console.log('totaltax: ' + this.totaltax);

    this.totalamount = this.totalprice + pro.sellingprice;
    this.totalprice = this.totalamount;
    console.log('Total: ' + this.totalamount);
    this.totalorderamount = (this.totalamount + this.taaax);
    this.discount = this.totalorderamount * 10 / 100;
    console.log('discount : ' + this.discount);
    this.servicecharges = 40;
    this.deliverycharges = 60;
    this.totalorderamount = this.totalorderamount - this.discount + this.servicecharges + this.deliverycharges;
    console.log('totalorderamount' + this.totalorderamount);
  }


  gotoDashboard() {
    console.log('go to dashboard');
    this.router.navigateByUrl('role/admin/dashboard');
  }

  deleteFromCart(pro) {
    console.log(pro);
    this.cartData.splice(pro, 1);
    console.log(this.cartData);
  }

  gotoPayment(info, customerinfo) {
    /* console.log('orderamt: ' + this.totalorderamount);
    console.log('tax: ' + this.totaltax);
    console.log('service' + this.servicecharges);
    console.log('delivery ' + this.deliverycharges);

    console.log('payment mode: ' + info);
    info.forEach(cart => {
      console.log(cart.productname);
      console.log(cart.sellingprice);
      console.log(cart.taxgroup);
      console.log(cart.productcategoryname);
    }); */
    this.invoicedata = new InvoiceDetails();
    console.log(customerinfo);
    this.invoicedata.info = info;
    this.invoicedata.customerinfo = customerinfo;
    console.log(this.invoicedata);
    this.invoicedata.payableamount = this.totalorderamount;
    this.invoicedata.totaltaxamount = this.totaltax;
    this.invoicedata.deliverycharges = this.deliverycharges;
    this.invoicedata.servicecharges = this.servicecharges;
    this.invoicedata.totaldiscountamount = this.discount;
    this.invoicedata.totalamount = this.totalamount;

    this.http.post(this.url + '/invoice', this.invoicedata).subscribe();
  }

}


