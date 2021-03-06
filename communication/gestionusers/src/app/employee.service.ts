import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable } from 'rxjs';
import { Employee } from './employee';


@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl="http://localhost:8070/api/v1/employees"

  constructor(private httpClient:HttpClient) { }

  getEmployee():Observable<Employee[]>{
    return this.httpClient.get<Employee[]>( `${this.baseUrl}`)

  }
}
