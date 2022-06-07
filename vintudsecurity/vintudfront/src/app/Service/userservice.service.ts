import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { FormGroup } from '@angular/forms';
import { Observable } from 'rxjs';
import { Token } from '@angular/compiler';

@Injectable({
  providedIn: 'root'
})
export class UserserviceService {
  private baseUrl="http://localhost:8040/api/v1/login"
  constructor(private httpClient:HttpClient) { }

  loginfunction(loginForm:FormGroup):Observable<object>{
    return this.httpClient.post<Token>(`${this.baseUrl}`, loginForm);
  }


}
