import { Component } from '@angular/core';
import { QuestionComponent } from "./components/question/question.component";
import { QuestionService } from '../../services/question.service';

@Component({
  selector: 'app-game',
  standalone: true,
  imports: [QuestionComponent],
  templateUrl: './game.component.html',
  styleUrl: './game.component.css'
})
export class GameComponent {
  currentImageUrl: string = '';

  constructor(private questionService:QuestionService){
    this.questionService.currentImage.subscribe(() => {
      this.currentImageUrl = this.questionService.getImageUrl();
    })
  }

}
