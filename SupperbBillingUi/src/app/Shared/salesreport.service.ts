import { Injectable, Type } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Invoice } from 'app/model/invoice.interface';
import { Observable } from 'rxjs';

const headerOption={
  headers:new HttpHeaders({"Content-Type":"application/json"})
}

@Injectable({
  providedIn: 'root'
})
export class SalesreportService {


mockUrl="http://localhost:8082";

allInvoice:Invoice[];

  constructor(private http:HttpClient) { }

  public getAllInvoice(): Observable<Invoice[]>

  {
    console.log('in service')
    return this.http.get<Invoice[]>
    (this.mockUrl+'/'+'getStockService'+'/'+'stockadmin'+'/'+'get',headerOption);

  }
  SearchByDate(fromdate,todate,distId):Observable<Invoice[]>

  {
    
    console.log(fromdate+todate)
    return this.http.get<Invoice[]>
    (this.mockUrl+'/'+'getStockService'+'/'+'stockadmin'+'/'+'getInvoiceBydate'+'/'+fromdate+'/'+todate+'/'+distId,headerOption);

  }
}
