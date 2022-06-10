import { Component, Injectable, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { CategoryCnss } from '../Model/categoryCnss';
import { Employee } from '../Model/Employee';
import { CnsscategoryService } from '../Service/cnsscategory.service';
import { UsersericeService } from '../Service/userserice.service';

@Component({
  selector: 'app-listemployee',
  templateUrl: './listemployee.component.html',
  styleUrls: ['./listemployee.component.css']
})

export class ListemployeeComponent implements OnInit {

  employees:Employee[];
  
  constructor(private userservice :UsersericeService, private  router:Router) { }

  ngOnInit(): void {
    this.getAllEmployee();
  }

  public getAllEmployee() :void{

    this.userservice.getAllemployee().subscribe(data => {this.employees=data;
      console.log(this.employees);});
   
  }

  deleteEmployee(id:number):void{
    this.userservice.deleteemployee(id).subscribe(data=>{
      console.log(data);
      this.getAllEmployee();
    });
  };


  updateEmployeEvent(id:number){
    this.router.navigate(['update',id])
  }



  

}
