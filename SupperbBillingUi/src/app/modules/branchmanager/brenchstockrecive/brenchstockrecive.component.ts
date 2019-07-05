import { Component, OnInit } from '@angular/core';
import { BranchstockrecieveService } from '../service/branchstockrecieve.service';
import { branchProductStock } from 'app/model/branchProductStock.interface';
import { ProductPriceMapping } from 'app/model/productPriceMapping.interface';
import { BranchProductStockWiseQuantity } from 'app/model/BranchProductStockWiseQuantity.interface';
import { MatTableDataSource } from '@angular/material';
export interface PeriodicElement {
  name: string;
  position: number;
  weight: number;
  symbol: string;
}

const ELEMENT_DATA: PeriodicElement[] = [
  { position: 1, name: 'Hydrogen', weight: 1.0079, symbol: 'H' },
  { position: 2, name: 'Helium', weight: 4.0026, symbol: 'He' },
  { position: 3, name: 'Lithium', weight: 6.941, symbol: 'Li' },
  { position: 4, name: 'Beryllium', weight: 9.0122, symbol: 'Be' },

];
@Component({
  selector: 'app-brenchstockrecive',
  templateUrl: './brenchstockrecive.component.html',
  styleUrls: ['./brenchstockrecive.component.scss']
})
export class BrenchstockreciveComponent implements OnInit {

  in: number;
  fromdate: string;
  todate: string;
  listofbranchstockrecieve: branchProductStock[];
  displayedColumns: string[] = ['Date', 'ProductName', 'CreditStock', 'Submit'];
  dataSource = new MatTableDataSource<branchProductStock>();

  map = new Map<ProductPriceMapping, BranchProductStockWiseQuantity>();
  constructor(private branchstockrereceiveservice: BranchstockrecieveService) { }

  ngOnInit() {
    this.getbranchstockrecieve();
  }
  getbranchstockrecieve() {
    this.branchstockrereceiveservice.getbranchstockrecieve().subscribe(
      (data: branchProductStock[]) => {
        console.log(data);
        this.listofbranchstockrecieve = data;
        this.listofbranchstockrecieve.forEach(element => {
          //  this.map = element.pmap;
          //           const jsondata = this.map;
          const result = [];
          // tslint:disable-next-line:no-var-keyword
          // tslint:disable-next-line:forin
          for (const i in element.pmap) {
            result.push([i, element.pmap[i]]);
            this.map = new Map<ProductPriceMapping, BranchProductStockWiseQuantity>();
            for (let index = 0; index < result.length; index++) {
              console.log(result[index][0]);
              console.log(result[index][1]);
              this.branchstockrereceiveservice.getproductbyid(result[index][0]).subscribe(
                (da) => {
                  console.log(da);
                  element.pmap = new Map().set(da, result[index][1]);
                  console.log(element.pmap);
                })
            }
          }

        });
        this.dataSource = new MatTableDataSource<branchProductStock>(this.listofbranchstockrecieve);
      });

  }
  searchbydate(fromdate, todate) {
    console.log(fromdate + '' + fromdate.toDateString());
    console.log(todate + '' + todate.toDateString());
    fromdate.toDateString();

    this.branchstockrereceiveservice.searchbydate(fromdate.toDateString(), todate.toDateString()).subscribe(
      (d) => {
        console.log(d);
        this.listofbranchstockrecieve = d;
//        this.listofbranchstockrecieve = data;
        this.listofbranchstockrecieve.forEach(element => {
          //  this.map = element.pmap;
          //           const jsondata = this.map;
          const result = [];
          // tslint:disable-next-line:no-var-keyword
          // tslint:disable-next-line:forin
          for (const i in element.pmap) {
            result.push([i, element.pmap[i]]);
            this.map = new Map<ProductPriceMapping, BranchProductStockWiseQuantity>();
            for (let index = 0; index < result.length; index++) {
              console.log(result[index][0]);
              console.log(result[index][1]);
              this.branchstockrereceiveservice.getproductbyid(result[index][0]).subscribe(
                (da) => {
                  console.log(da);
                  element.pmap = new Map().set(da, result[index][1]);
                  console.log(element.pmap);
                })
            }
          }

        });
        this.dataSource = new MatTableDataSource<branchProductStock>(this.listofbranchstockrecieve);
      }
    )
  }
}
