import { Component, OnInit } from '@angular/core';
import { State } from 'app/model/state.interface';
import {AdminserviceService} from'app/Shared/adminservice.service';
import { from } from 'rxjs';
import { District } from 'app/model/district.interface';
import { ProductInformation } from 'app/model/ProductInformation.interface';
import { BranchInformation } from 'app/model/branchInformation.interface';
import { branchProductStock } from 'app/model/branchProductStock.interface';
@Component({
  selector: 'app-branchordertrasnfer',
  templateUrl: './branchordertrasnfer.component.html',
  styleUrls: ['./branchordertrasnfer.component.scss']
})
export class BranchordertrasnferComponent implements OnInit {

 
  
  constructor(private adminservice:AdminserviceService) { }
  getallState:State[];
  getdist:District[];
  getproduct:ProductInformation[];
  getBranchName:branchProductStock[];
  productNm:string;
  currentStock:number=null;
  branchInfo:BranchInformation[];
  stid:number;
  
  ngOnInit() 
  {
    this.getall();
    this.getProductName();
    
  }
  getall()
   {
    this.adminservice.getAllState().subscribe((data:State[])=>{this.getallState=data;});
    
   }
  
   getDist(id:number)
   {
     console.log(id)
     this.stid=id;
     this.adminservice.getDist(id).subscribe((data:District[])=>{this.getdist=data;});
      
    }
     
    getProductName()
   {
    this.adminservice.getAllProduct().subscribe((data:ProductInformation[])=>{this.getproduct=data;});
     
     
   }
  
   getBranchByProductName(productName:string) 
   {
    this.productNm=productName;
     this.adminservice.getBranch(productName,this.stid).subscribe((data:branchProductStock[])=>{this.getBranchName=data;});
     
   
    }  
   
   getCurrentStock(branchName:string)
   {

    
     this.adminservice.getCurrentStock(this.productNm,branchName).subscribe((data:number)=>{this.currentStock=data;});
   
    }

    getbranchByState(stateId:number)
    {
      this.adminservice.getBranchByState(stateId).subscribe((data:BranchInformation[])=>{this.branchInfo=data;});
    }
    
}
