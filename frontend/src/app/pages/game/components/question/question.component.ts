import { Component } from '@angular/core';
import { QuestionService } from '../../../../services/question.service';
import { PersonasService } from '../../../../services/personas.service';
import { PersonaComponent } from '../../../../shared/persona/persona.component';

@Component({
  selector: 'app-question',
  standalone: true,
  imports: [PersonaComponent],
  templateUrl: './question.component.html',
  styleUrl: './question.component.css'
})
export class QuestionComponent {

  questions: any[] = [];
  currentQuestion: string | null = '';
  currentQuestionIndex: number = 0;
  pessoas: any[] = []; // Lista de pessoas que atendem à condição

  constructor(private questionService:QuestionService, private personaService:PersonasService){
    this.loadQuestions();
    console.log(this.questions[0])
  }

  loadQuestions() {
    this.questionService.getQuestions().subscribe((data) => {
      this.questions = data.questions; // Acessa o array de perguntas
      this.getNextQuestion();
    });
  }

  getNextQuestion() {
    if (this.currentQuestionIndex < this.questions.length) {
      this.currentQuestion = this.questions[this.currentQuestionIndex];
    } else {
      this.currentQuestion = null; // Todas as perguntas foram exibidas
    }
  }

  onAnswer(resposta: boolean) {
    this.getNextQuestion()
  }
}
