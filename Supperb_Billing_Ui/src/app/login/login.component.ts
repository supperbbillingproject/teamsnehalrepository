import { Component, OnInit } from '@angular/core';
import { Login } from 'app/model/login.interface';
import { RouterModule, Routes, Router } from '@angular/router';
import { SharedService } from 'app/Shared/shared.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit {

  login: Login = {
    username: '',
    password: ''
  };
  rolename: string;
  
 
  constructor(private router: Router,private sharedservice:SharedService) { }

  ngOnInit() {
  }
  log(login) {
    console.log(login);
    if (login.username === 'admin' && login.password === 'admin') {
      console.log(' in admin');
      // this.sharedservice.login('admin');
      //this.rolename = 'admin';
      sessionStorage.setItem('rolename','admin');
      this.router.navigateByUrl('/' + 'role' + '/' + 'admin' + '/dashboard');
    }
    if (login.username === 'branchmanager' && login.password === 'branchmanager') {
      console.log(' in branchmanager');
      this.rolename = 'branchmanager';
      sessionStorage.setItem('rolename','branchmanager');
      this.router.navigateByUrl('/' + 'role' + '/' + 'branchmanager' + '/dashboard');
    }
  }

}
