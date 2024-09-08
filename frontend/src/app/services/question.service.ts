import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class QuestionService {

  private images = [
    'assets/cefetnator-angry.png',
    'assets/cefetnator-default.png',
    'assets/cefetnator-ok.png'
  ];
  private winImage = 'assets/cefetnator-win.png'
  private jsonUrl = 'assets/questions.json'; // Caminho para o JSON
  private isGameOver = new BehaviorSubject<boolean>(false);

  constructor(private http: HttpClient) {}

  getQuestions(): Observable<{ questions: string[] }> {
    return this.http.get<{ questions: string[] }>(this.jsonUrl);
  }
  private currentImageIndex = new BehaviorSubject<number>(0);
  currentImage = this.currentImageIndex.asObservable();

  changeImage() {
    if (!this.isGameOver.value) {
      const newIndex = (this.currentImageIndex.value + 1) % this.images.length;
      this.currentImageIndex.next(newIndex);
    }
  }

  getImageUrl() {
    return this.isGameOver.value ? this.winImage : this.images[this.currentImageIndex.value];
  }

  resetImage() {
    this.isGameOver.next(false); // Reseta o estado de fim de jogo
    this.currentImageIndex.next(0);
  }

  setEndGameImage() {
    this.isGameOver.next(true); // Marca o jogo como finalizado
    this.currentImageIndex.next(0);
  }
}
