import { Component, OnInit } from '@angular/core';
import { MatDialog } from '@angular/material';
import { ProductInformation } from 'app/model/ProductInformation.interface';
import { HttpClient } from '@angular/common/http';
import { ProductCategory } from 'app/model/productCategory.interface';
import { CustomerInformation } from 'app/model/customerinformation.interface';

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

  url = 'http://localhost:8084';
  productsdata: ProductInformation[];
  productcategoriesdata: ProductCategory[];
  customerdata: CustomerInformation[];

  constructor(public dialog: MatDialog, private http: HttpClient) { }



  openDialog(customerdata) {
    const dialogRef = this.dialog.open(DialogContentExampleDialogComponent, customerdata);

    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  }

  getCustomer(customer) {
    console.log(customer.customerMobileNo);
    this.http.get(this.url + '/customer/' + customer.customerMobileNo).subscribe(
      (data: CustomerInformation[]) => {
        this.customerdata = data;
        console.log(this.customerdata);
        this.openDialog(this.customerdata);
      }
    )
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
      (productdata: ProductInformation[]) => {
        this.productsdata = productdata;
        console.log(this.productsdata);
      }
    );
  }

  addProductCart(pro) {
    console.log(pro);
  }

}
