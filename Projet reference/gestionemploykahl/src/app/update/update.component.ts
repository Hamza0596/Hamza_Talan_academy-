import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Employee } from '../Model/Employee';
import { UsersericeService } from '../Service/userserice.service';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  updatedEmployee!: FormGroup;
  uniqueemployee :Employee;
  constructor(private formBuilder: FormBuilder , private usersericeService:UsersericeService , private  router:Router,private activaterouter:ActivatedRoute) { }
  id:number;
 

  ngOnInit(): void {
    this.id=this.activaterouter.snapshot.params['id']
     
    this.updatedEmployee=this.formBuilder.group(
      {  
        id:this.activaterouter.snapshot.params['id'] , 
        name :[null,Validators.required],
        email :[null,Validators.required],
        jobTitle :[null,Validators.required],
        phone:[null,Validators.required],
        employeeCode:[null,Validators.required]
      }
    );

  



  }

  
  updateemployee(){
    this.usersericeService.updatemployee(this.updatedEmployee.getRawValue()).subscribe(data=>{console.log(data);},
    error=> console.log(error)  );
    this.router.navigateByUrl("listemployee")
  }

    






}
