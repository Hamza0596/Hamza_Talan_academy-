import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { CategoryCnss } from '../Model/categoryCnss';

@Injectable({
  providedIn: 'root'
})
export class CnsscategoryService {

  constructor(private httpclient :HttpClient) { }

  baseUrl="http://localhost:8020"

  public getAllcat(): Observable<CategoryCnss[]>{
    return this.httpclient.get<CategoryCnss[]>(`${this.baseUrl}/cat/allCat`);
  }


  public getCatById(id:number): Observable<CategoryCnss>{
    return this.httpclient.get<CategoryCnss>(`${this.baseUrl}/cat/Catbyid/${id}`);
  }

}
