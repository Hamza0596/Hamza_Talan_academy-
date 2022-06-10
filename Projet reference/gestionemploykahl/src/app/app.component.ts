import { HttpErrorResponse } from '@angular/common/http';
import { Component } from '@angular/core';
import { Employee } from './Model/Employee';
import { UsersericeService } from './Service/userserice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'gestionemploykahl';

  employees:Employee[];
  constructor(private userservice :UsersericeService) { }

  ngOnInit(): void {
  }

  
}
