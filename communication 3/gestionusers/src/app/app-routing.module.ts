import { compileComponentFromRender2 } from '@angular/compiler/src/render3/view/compiler';
import { Component, NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddEmployeesComponent } from './add-employees/add-employees.component';
import { EmployeeInformationsComponent } from './employee-informations/employee-informations.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';

const routes: Routes = [
  {path:'employees' , component:EmployeeListComponent},
  {path:"addemployees",component:AddEmployeesComponent},
  {path:"updateEmployees/:id",component:UpdateEmployeeComponent},
  {path : "informations/:id" , component:EmployeeInformationsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
