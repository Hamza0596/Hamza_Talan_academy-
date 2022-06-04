import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { FormBuilder, FormGroup } from '@angular/forms';
import { EmployeeService } from '../employee.service';
import { Router } from '@angular/router';
@Component({
  selector: 'app-add-employees',
  templateUrl: './add-employees.component.html',
  styleUrls: ['./add-employees.component.css']
})
export class AddEmployeesComponent implements OnInit {

  newEmployee!: FormGroup;
  constructor(private formBuilder: FormBuilder , private employeservice:EmployeeService ,private router: Router) { }

  ngOnInit(): void {
    this.newEmployee=this.formBuilder.group(
      {  
            
            firstName :[null],
            lastName :[null],
            emailId :[null]
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

