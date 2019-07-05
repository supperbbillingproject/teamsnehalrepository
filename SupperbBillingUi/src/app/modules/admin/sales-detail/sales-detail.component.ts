import { Component, OnInit, Inject } from '@angular/core';
import { Invoice } from 'app/model/invoice.interface';
import { MatDialogRef, MAT_DIALOG_DATA, MatTableDataSource, MatDialogModule } from '@angular/material';
import { SalesreportComponent } from '../salesreport/salesreport.component';

@Component({
  selector: 'app-sales-detail',
  templateUrl: './sales-detail.component.html',
  styleUrls: ['./sales-detail.component.scss']
})
export class SalesDetailComponent implements OnInit {

  invoicee: Invoice[]=[];


  constructor(public dialogRef: MatDialogRef<SalesreportComponent>,
    @Inject(MAT_DIALOG_DATA) public data: Invoice) 
    {this.invoicee.push(data); }

    onNoClick(): void {
      this.dialogRef.close();
    }

  ngOnInit() {
    imports: [MatDialogModule]
    console.log(this.invoicee);
    this.dataSource=new MatTableDataSource<Invoice>(this.invoicee);
  }

  displayedColumns:  string[] =['id','invoiceNo','totalAmount','branchName',
  'relationshipExecutiveName','customerId','customerName']

  dataSource: MatTableDataSource<Invoice>;

}
