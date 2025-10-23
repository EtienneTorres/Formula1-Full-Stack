import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PuntosServicesService {


   private apiUrl = 'http://localhost:8080/api/escuderias';

     constructor(private http: HttpClient) {}

  // Método para obtener todas las escuderías
  getEscuderias(): Observable<any> {
    return this.http.get<any>(this.apiUrl);
  }

}
