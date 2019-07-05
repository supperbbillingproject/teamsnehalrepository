import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { branchProductStock } from 'app/model/branchProductStock.interface';
const headeroption = {
  headers: new HttpHeaders({ 'Content-Type': 'application/json' })
}
@Injectable({
  providedIn: 'root'
})
export class BranchstockrecieveService {
  mockurl = 'http://localhost:8082';
  constructor(private http: HttpClient) { }
  getbranchstockrecieve() {
    return this.http.get(this.mockurl + '/' + 'getStockService' + '/' + 'stockbm' + '/' + 'getbranchstockrecieve');
  }

  getproductbyid(id) {
    return this.http.get(this.mockurl + '/' + 'getStockService' + '/' + 'stockbm' + '/' + 'getproductbyid' + '/' + id);
  }
  searchbydate(fromdate, todate): Observable<branchProductStock[]> {
    return this.http.get<branchProductStock[]>(this.mockurl  + '/getStockService/' + 'stockbm/' + 'getbydate/' + fromdate + '/' + todate);
  }
}
