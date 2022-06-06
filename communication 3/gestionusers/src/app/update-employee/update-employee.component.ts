import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';


@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {

  id:number;
  employee: Employee=new Employee();
  updatedEmployee!: FormGroup;

  constructor(private router: Router , private employeeService:EmployeeService, private route:ActivatedRoute,private formBuilder: FormBuilder) { }
  ngOnInit(): void {
    
    this.id=this.route.snapshot.params['id'] /* id rouge est l'id de lurl dans router app*/
    this.employeeService.getEmployeeById(this.id).subscribe(data => {this.employee=data;},
    error =>console.log(error));

   

    this.updatedEmployee=this.formBuilder.group(
      {  
            id:this.route.snapshot.params['id'],
            firstName :[null],
            lastName :[null],
            emailId :[null]
      }
    );

   
    }
    saveModification(){
      this.employeeService.updateEmployee(this.id,this.updatedEmployee.getRawValue()).subscribe(data=>{console.log(data);},
      error=> console.log(error)  );
  }

  Onreturn(){
      this.router.navigateByUrl("/employees");
  };


 

}
