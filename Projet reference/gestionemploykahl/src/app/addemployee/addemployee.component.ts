import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators} from '@angular/forms';
import { Router } from '@angular/router';
import { Subscriber } from 'rxjs';
import { CategoryCnss } from '../Model/categoryCnss';
import { Employee } from '../Model/Employee';
import { CnsscategoryService } from '../Service/cnsscategory.service';
import { UsersericeService } from '../Service/userserice.service';

@Component({
  selector: 'app-addemployee',
  templateUrl: './addemployee.component.html',
  styleUrls: ['./addemployee.component.css']
})
export class AddemployeeComponent implements OnInit {
  newEmployee!: FormGroup;
  constructor(private formBuilder: FormBuilder , private usersericeService:UsersericeService , private  router:Router,private cnsscategoryService:CnsscategoryService) { }
employeeJob! :Employee;
AllCategoryCnss:CategoryCnss[]

ngOnInit(): void {
 
  this.getAllcat();

    this.newEmployee=this.formBuilder.group(
      {  
            
        name :[null,Validators.required],
        email :[null,Validators.required],
        jobTitle :[null,Validators.required],
        phone:[null,Validators.required],
        employeeCode:[null,Validators.required],
        categoryCnss:[null,Validators.required],
      }
    );
  }

  

  addemployee(){
    this.usersericeService.addemployee(this.newEmployee.getRawValue()).subscribe(data=>{console.log(data);},
    error=> console.log(error)  );
    this. Onreturn()
  }

  Onreturn(){
    this.router.navigateByUrl("/listemployee");
  }

  getAllcat():void{
    this.cnsscategoryService.getAllcat().subscribe(data => {this.AllCategoryCnss=data;
      console.log(this.AllCategoryCnss);});
  }



}
