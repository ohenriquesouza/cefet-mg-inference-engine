import { Component } from '@angular/core';
import { QuestionService } from '../../../../services/question.service';
import { PersonasService } from '../../../../services/personas.service';
import { PersonaComponent } from '../../../../shared/persona/persona.component';
import { Observable, of } from 'rxjs';
import { Persona } from '../../../../model/persona';

@Component({
  selector: 'app-question',
  standalone: true,
  imports: [PersonaComponent],
  templateUrl: './question.component.html',
  styleUrl: './question.component.css'
})
export class QuestionComponent {
  personas$: Observable<Persona[]> = of([]);
  filteredPersonas: Persona[] = [];
  questions: string[] = [];
  currentQuestionIndex: number = 0;
  currentQuestion: string = '';
  correctPersona: Persona | null = null;
  
  constructor(private questionService:QuestionService, private personaService:PersonasService){
    this.loadQuestions();
    this.loadPersonas();
  }

  loadPersonas(): void {
    this.personaService.list().subscribe(personas => {
      if (personas && Array.isArray(personas)) {
        this.personas$ = of(personas);
        this.filteredPersonas = personas;
        this.currentQuestionIndex = 0;
        this.currentQuestion = '';
        this.correctPersona = null;
        this.loadNextQuestion();
      } else {
        console.error('Dados de personas inválidos:', personas);
      }
    }, error => {
      console.error('Erro ao buscar personas:', error);
    });
  }

  loadQuestions() {
    this.questionService.getQuestions().subscribe((data) => {
      this.questions = data.questions;
      this.loadNextQuestion();
    });
  }

  loadNextQuestion(): void {
    if (this.filteredPersonas.length === 1) {
      this.correctPersona = this.filteredPersonas[0];
      console.log(`A pessoa é: ${this.filteredPersonas[0].name}`);
      this.questionService.setEndGameImage();
    }
    else if (this.currentQuestionIndex < this.questions.length) {
      this.currentQuestion = this.questions[this.currentQuestionIndex];
    } else {
      alert('Não foi possível encontrar uma única pessoa.');
    } 
  }

  answerQuestion(answer: boolean): void {
    if (this.filteredPersonas.length > 0) {
      const index = this.currentQuestionIndex; // Index da pergunta atual
      if (index < this.questions.length) {
        this.filteredPersonas = this.filteredPersonas.filter(persona =>{
          return persona.characteristicsList[index] === answer
        }
      );
      this.questionService.changeImage();
      console.log(this.filteredPersonas)
      this.currentQuestionIndex++;
      this.loadNextQuestion();
      } else {
        alert('Índice da pergunta fora do intervalo.');
      }
    } else {
      alert('A lista de pessoas está vazia.');
    }
  }

  restartGame(){
    console.log(this.filteredPersonas);
    console.log(this.currentQuestionIndex);
    this.loadPersonas();
    this.questionService.resetImage()
  }
}
