import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { State } from 'app/model/state.interface';
import { Observable } from 'rxjs';
import { ProductInformation } from 'app/model/ProductInformation.interface';
import { branchProductStock } from 'app/model/branchProductStock.interface';
import { BranchInformation } from 'app/model/branchInformation.interface';

@Injectable({
  providedIn: 'root'
})
export class AdminserviceService
 {

  constructor(private http: HttpClient) { }

  url="http://localhost:8082";
  state:State[];
  product:ProductInformation[];

  getAllState(): Observable<State[]> {
    return this.http.get<State[]>(this.url+'/'+'getStockService'+'/'+'stockadmin'+'/'+'getAllState');
  }
  
  getDist(id: number) {
    return this.http.get(this.url+'/'+'getStockService'+'/'+'stockadmin'+'/'+'getDistrict' + '/' + id);
  }
 
  getAllProduct(): Observable<ProductInformation[]> {
    return this.http.get<ProductInformation[]>(this.url+'/'+'getStockService'+'/'+'stockadmin'+'/'+'getProductName');
  }
 
  getBranch(productName:string,id:number)
  {
    return this.http.get<branchProductStock[]>(this.url+'/'+'getStockService'+'/'+'stockadmin'+'/'+'getbranchStock'+'/'+productName+'/'+id);
  }
  getCurrentStock(productNm:string,branchName:string)
  {
    return this.http.get<number>(this.url+'/'+'getStockService'+'/'+'stockadmin'+'/'+'getbranchCurrentStrock'+'/'+productNm+'/'+branchName);
  }
  getBranchByState(id:number)
  {
    return this.http.get<BranchInformation[]>(this.url+'/'+'getStockService'+'/'+'stockadmin'+'/'+'getBranchByState'+'/'+id);
  }
}
