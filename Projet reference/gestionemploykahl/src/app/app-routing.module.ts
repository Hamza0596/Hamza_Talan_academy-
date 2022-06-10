import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddemployeeComponent } from './addemployee/addemployee.component';
import { ListemployeeComponent } from './listemployee/listemployee.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {path:'listemployee' , component:ListemployeeComponent},
  {path:'add' , component:AddemployeeComponent},
  {path:'update/:id' , component:UpdateComponent}
  

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
