import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-informations',
  templateUrl: './employee-informations.component.html',
  styleUrls: ['./employee-informations.component.css']
})
export class EmployeeInformationsComponent implements OnInit {

  constructor(private employeservice:EmployeeService ,private activatedRoute:ActivatedRoute) { }
   id : number;
  employee:Employee;
  
  ngOnInit(): void {
   this.id=this.activatedRoute.snapshot.params['id'];
   this.employeservice.getEmployeeById(this.id).subscribe(data=>{this.employee=data;},
  error=>console.log(error));

  }

 
  


  

}
