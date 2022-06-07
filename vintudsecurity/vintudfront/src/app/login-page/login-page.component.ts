import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserserviceService } from '../Service/userservice.service';

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {
  loginForm!: FormGroup;
  constructor(private formBuilder: FormBuilder , private UserserviceService:UserserviceService ,private router: Router) { }

  ngOnInit(): void {
    this.loginForm=this.formBuilder.group(
      {  
            
            pseudo :[null,Validators.required],
            password :[null,Validators.required],
           
      }
    );
  }
  Onlog(){
    this.UserserviceService.loginfunction(this.loginForm.value).subscribe(data=>{console.log(data);},
    error=> console.log(error)  );
  }

}
