import { Component } from '@angular/core';
import { QuestionComponent } from "./components/question/question.component";

@Component({
  selector: 'app-game',
  standalone: true,
  imports: [QuestionComponent],
  templateUrl: './game.component.html',
  styleUrl: './game.component.css'
})
export class GameComponent {

}
