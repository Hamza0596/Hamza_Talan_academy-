import { Component, OnInit, TRANSLATIONS } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import {EmployeeService} from '../employee.service';


@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  employees:Employee[];
  constructor(private employeservice:EmployeeService,private router: Router) { }

  ngOnInit(): void {
this.getEmployees();
   
  }

  private getEmployees(){
    this.employeservice.getEmployee().subscribe(data => {this.employees=data;});
  }

  Updateemployee(id:number):void {
    this.router.navigate(['updateEmployees',id]);

  }

  deleteEmployee(id:number):void{
    this.employeservice.deleteEmployee(id).subscribe(data=>{
      console.log(data);
      this.getEmployees();
    });
  };

  showInfo(id:number):void{
    this.router.navigate(['informations',id]);
  }

}
