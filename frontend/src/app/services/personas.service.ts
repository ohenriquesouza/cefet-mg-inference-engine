import { HttpClient, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { catchError, Observable, of } from 'rxjs';
import { Persona } from '../model/persona';

@Injectable({
  providedIn: 'root'
})
export class PersonasService {

  private readonly API = 'api/personas'
  constructor(private httpClient: HttpClient) {}

  list(): Observable<Persona[]> {
    return this.httpClient.get<Persona[]>(this.API).pipe(
      catchError(err => {
        console.error('Erro ao buscar personas', err);
        return of([]); // Retorna uma lista vazia em caso de erro
      })
    );
  }

  loadById(id: String){
    return this.httpClient.get<Persona>(`${this.API}/${id}`);
  }

}
