import { Component, OnInit,ViewChild } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Invoice } from 'app/model/invoice.interface';
import { MatDialog,MatPaginator,MatTableDataSource } from '@angular/material';
import { SalesreportService } from 'app/Shared/salesreport.service';
import { SalesDetailComponent } from '../sales-detail/sales-detail.component';
import { State } from 'app/model/state.interface';
import { AdminserviceService } from 'app/Shared/adminservice.service';
import { District } from 'app/model/district.interface';

// const ELEMENT_DATA:Invoice []=[

//   { invoiceNo:'101', totalAmount:500, branchInformation:{ branchName:'pune' },
//   executiveInformation:{ relationshipExecutiveName:'abc'},customerInformation:{
//     customerId:'',customerName:''}
//  },
//   { invoiceNo:'102', totalAmount:800, branchInformation:{ branchName:'pune'},
//   executiveInformation:{relationshipExecutiveName:'xyz'}, customerInformation:{
//     customerId:'',customerName:''}
//   }

// ]

@Component({
  selector: 'app-salesreport',
  templateUrl: './salesreport.component.html',
  styleUrls: ['./salesreport.component.scss']
})
export class SalesreportComponent implements OnInit {

  // totalAmount: null;
  //  customerId:'';
  //  customerName:'';

listallInvoice:Invoice[];
listofInvoice:Invoice[];
getdist:District[];

displayedColumns: String[] = ['invoiceNo','Date','totalAmount','branchName','relationshipExecutiveName','Details'];
dataSource:MatTableDataSource<Invoice>;
getallState:State[];
distId:number;
  // constructor(public dialog: MatDialog) { }
  
constructor(public dialog: MatDialog,private salesservice:SalesreportService,private adminservice:AdminserviceService){}

ngOnInit()
{
  this.getall();  
}

// @ViewChild(MatPaginator) paginator: MatPaginator;

getallData(){

this.salesservice.getAllInvoice().subscribe(

(data:Invoice[])=>{
  console.log('in ts')
  console.table(data);
  this.listallInvoice=data;
  console.log("listalldata"+this.listallInvoice)
  this.dataSource=new MatTableDataSource<Invoice>(this.listallInvoice);
}

)

}
getDistId(did:number)
{
  this.distId=did;
  console.log(this.distId);
}
getDist(id:number)
{
  console.log(id)
  
  this.adminservice.getDist(id).subscribe((data:District[])=>{this.getdist=data;});
   
 }
getall()
   {
    this.adminservice.getAllState().subscribe((data:State[])=>{this.getallState=data;});
    
   }
Search(fromdate,todate)
{
    fromdate=fromdate.toDateString();
    todate=todate.toDateString();
   this.salesservice.SearchByDate(fromdate,todate,this.distId).subscribe(
     (data:Invoice[])=>
        {
          this.listallInvoice=data;
          console.table(this.listallInvoice);
          this.dataSource=new MatTableDataSource<Invoice>(this.listallInvoice);
          console.table(this.dataSource); 
        },
        (error)=>
        {
           console.log('error occured ',error);   
        },
        ()=>
        {
          console.log('get all invoice completed');
        }   
   );
}

  openDialog(singlereport:Invoice)  {

    console.log('in opendialog');
    const dialogRef = this.dialog.open(SalesDetailComponent, {
      width: '1000px',
      height:'300px',
      data:singlereport
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
    });
  }

  // @ViewChild(MatPaginator) paginator: MatPaginator;
  // ngOnInit()

  //  { this.dataSource.paginator = this.paginator;
  //  }
  //   displayedColumns: String[] = ['id','invoiceNo','totalAmount','branchInformation',
  //   'executiveInformation',' '];
  //   dataSource = new MatTableDataSource<Invoice>(ELEMENT_DATA);
 

  //   invoicee:Invoice={
  //     id:null,
  //      invoiceNo:'',
  //      totalAmount: null,
    
  //      branchInformation:{
  //       branchName:''
  //      },
  //      executiveInformation:{
  //       relationshipExecutiveName:''
  //      },
  //       customerInformation:{
  //        customerId:'',
  //        customerName:''
  //       },
  //       // productQuantity:{
  //       //   sellingPrice:null,
  //       // } 
         
    
    // }
 }



