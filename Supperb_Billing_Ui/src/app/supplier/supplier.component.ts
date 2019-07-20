import { Component, OnInit } from '@angular/core';
import { supplier } from 'app/model/supplier.interface';
import { HttpClient } from '@angular/common/http';
import { Country } from 'app/model/country.interface';
import { State } from 'app/model/state.interface';
import { District } from 'app/model/district.interface';

@Component({
  selector: 'app-supplier',
  templateUrl: './supplier.component.html',
  styleUrls: ['./supplier.component.scss']
})
export class SupplierComponent implements OnInit {
  cntryid: number;
  stid: number;
  districid: number;

  sup: supplier = {

    suppliername: '',
    suppliercompanyname: '',
    district: { districtid: null, districtname: '', state: null },
    state: { stateid: null, statename: '', country: null },
    country: { countryid: null, countryname: '' },
    supplieraddress: '',
    gstin: '',
    date: ''

  };



  countrydata: Country[];
  statedata: State[];
  districtdata: District[];

  url = 'http://localhost:8083';

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.getCountryList();

  }

  addSupplier(sup) {
    console.log(sup);
    this.sup.country.countryid = this.cntryid;
    this.sup.state.stateid = this.stid;
    this.sup.district.districtid = this.districid;
    this.http.post(this.url + '/supplier', sup).subscribe();
  }

  getCountryList() {
    this.http.get(this.url + '/countries').subscribe(
      (data: Country[]) => {
        this.countrydata = data;
        console.log(this.countrydata);
      }
    );
  }

  getStates() {
    console.log('countryid' + this.cntryid);
    this.http.get(this.url + '/states/' + this.cntryid).subscribe(
      (data: State[]) => {
        this.statedata = data;
        console.log(this.statedata);
      }
    )
  }

  getDistrics() {
    console.log('stateid' + this.stid);
    this.http.get(this.url + '/districts/' + this.stid).subscribe(
      (data: District[]) => {
        this.districtdata = data;
        console.log(this.districtdata);
      }
    )
  }


  resetData(sup) {
     this.sup = {
      'suppliername': '',
      'suppliercompanyname': '',
      'district': { 'districtid': null, 'districtname': '', 'state': null },
      'state': { 'stateid': null, 'statename': '', 'country': null },
      'country': { 'countryid': null, 'countryname': '' },
      'supplieraddress': '',
      'gstin': '',
      'date': ''
    }
  }

}
