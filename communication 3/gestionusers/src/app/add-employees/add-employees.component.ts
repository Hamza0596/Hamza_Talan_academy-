import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-employees',
  templateUrl: './add-employees.component.html',
  styleUrls: ['./add-employees.component.css']
})
export class AddEmployeesComponent implements OnInit {
   emailegex!:RegExp;
  newEmployee!: FormGroup;
  constructor(private formBuilder: FormBuilder , private employeservice:EmployeeService ,private router: Router) { }

  ngOnInit(): void {
    this.emailegex=/^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$/g;
    this.newEmployee=this.formBuilder.group(
      {  
            
            firstName :[null,Validators.required],
            lastName :[null,Validators.required],
            emailId :[null,Validators.pattern(this.emailegex)]
      }
    );
  }


  saveEmployee(){
    this.employeservice.addemployee(this.newEmployee.getRawValue()).subscribe(data=>{console.log(data);},
    error=> console.log(error)  );
  }
  
  Onreturn(){
    this.router.navigateByUrl("/employees");
  }
  
 

}

