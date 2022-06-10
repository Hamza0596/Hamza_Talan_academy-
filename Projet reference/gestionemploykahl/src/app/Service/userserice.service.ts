import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { FormGroup } from '@angular/forms';
import { Observable, observable } from 'rxjs';
import { Employee } from '../Model/Employee';

@Injectable({
  providedIn: 'root'
})
export class UsersericeService {
  

  baseUrl="http://localhost:8020"

  constructor(private httpclient :HttpClient) { }
  
 public getAllemployee(): Observable<Employee[]>{
    return this.httpclient.get<Employee[]>(`${this.baseUrl}/Employee/all`);
  }

  public addemployee(employee:FormGroup ): Observable<Employee>{
    return this.httpclient.post<Employee>(`${this.baseUrl}/Employee/add`,employee);
  }

  public updatemployee(employee:FormGroup ): Observable<Employee>{
    return this.httpclient.post<Employee>(`${this.baseUrl}/Employee/update`,employee);
  }

  public deleteemployee(employeeId:number): Observable<void>{
    return this.httpclient.delete<void>(`${this.baseUrl}/Employee/delete/${employeeId}`);
  }


  public getemployeeByid(id:number): Observable<Employee>{
    return this.httpclient.get<Employee>(`${this.baseUrl}/Employee/find/${id}`);
  }

  



}


