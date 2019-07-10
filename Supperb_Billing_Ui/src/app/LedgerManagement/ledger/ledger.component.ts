import { Component, OnInit } from '@angular/core';
import { Ledger } from 'app/model/ledger.interface';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-ledger',
  templateUrl: './ledger.component.html',
  styleUrls: ['./ledger.component.scss']
})
export class LedgerComponent implements OnInit {
  ledger: Ledger = {
    ledgerid: null,
    ledgername: ''
  }

  url = 'http://localhost:8083/ledger';

  constructor(private http: HttpClient) { }

  addLedger(ledger) {
    console.log(ledger.ledgername);
    this.http.post(this.url, ledger).subscribe();
  }

  ngOnInit() {
  }

}
