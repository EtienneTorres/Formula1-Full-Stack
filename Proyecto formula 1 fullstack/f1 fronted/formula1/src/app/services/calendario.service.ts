import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CalendarioService {

  constructor(private http: HttpClient) { }

  urlbase: string= "http://localhost:8080/"

 getCalendario(): Observable<any> {
  return this.http.get(`${this.urlbase}api/calendarios`);
}

getCalendarioTemporada(temporada: number): Observable<any> {
  return this.http.get(`${this.urlbase}api/calendarios/temporada/${temporada}`);
}

getCarreraPorId(id: number): Observable<any> {
  return this.http.get(`${this.urlbase}api/calendarios/${id}`);
}

 getCircuitoById(id: number): Observable<any> {
  return this.http.get<any>(`http://localhost:8080/api/circuitos/${id}`);
}


}
