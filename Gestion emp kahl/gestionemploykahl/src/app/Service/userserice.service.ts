import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, observable } from 'rxjs';
import { Employee } from '../Model/Employee';

@Injectable({
  providedIn: 'root'
})
export class UsersericeService {

  baseUrl='http://localhost:8020'

  constructor(private httpclient :HttpClient) { }
  public getAllemployee(): Observable<Employee[]>{
    return this.httpclient.get<Employee[]>(`${this.baseUrl}/Employee/all`);
  }

  public addemployee(employee:Employee ): Observable<Employee>{
    return this.httpclient.post<Employee>(`${this.baseUrl}/Employee/add`,employee);
  }

  public updatemployee(employee:Employee ): Observable<Employee>{
    return this.httpclient.post<Employee>(`${this.baseUrl}/Employee/update`,employee);
  }

  public deleteemployee(employeeId:number): Observable<void>{
    return this.httpclient.delete<void>(`${this.baseUrl}/Employee/delete/${employeeId}`);
  }


}


