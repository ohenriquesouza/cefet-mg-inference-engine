import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  private jsonUrl = 'assets/questions.json'; // Caminho para o JSON

  constructor(private http: HttpClient) {}

  getQuestions(): Observable<{ questions: string[] }> {
    return this.http.get<{ questions: string[] }>(this.jsonUrl);
  }
}
