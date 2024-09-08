import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { first, Observable, tap } from 'rxjs';
import { Persona } from '../../model/persona';
import { PersonasService } from '../../services/personas.service';
import { CommonModule } from '@angular/common';
import { PersonaComponent } from '../../shared/persona/persona.component';

@Component({
  selector: 'app-config',
  standalone: true,
  imports: [RouterLink, CommonModule, PersonaComponent],
  templateUrl: './config.component.html',
  styleUrl: './config.component.css'
})
export class ConfigComponent {

  personasList: Observable<Persona[]>;

  constructor(private personasService:PersonasService){
    this.personasList = personasService.list()
        .pipe(
          first()
        )
  }

}
