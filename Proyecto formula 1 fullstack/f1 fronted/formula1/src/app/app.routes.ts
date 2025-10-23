import { Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { PilotosComponent } from './components/pilotos/pilotos.component';
import { EscuderiasComponent } from './components/escuderias/escuderias.component';
import { CalendarioComponent } from './components/calendario/calendario.component';
import { PuntosComponent } from './components/puntos/puntos.component';
import { CircuitosComponent } from './components/circuitos/circuitos.component';
import { CircuitoDetailComponent } from './components/circuito-detail/circuito-detail.component';

export const routes: Routes = [

 { path: '', component: HomeComponent },
  { path: 'pilotos', component: PilotosComponent },
  { path: 'escuderias', component: EscuderiasComponent },
  { path: 'calendario', component: CalendarioComponent },
  { path: 'puntos', component: PuntosComponent },
    { path: 'circuitos', component: CircuitosComponent },
      { path: 'circuitos/:id', component: CircuitoDetailComponent } ,


  { path: '**', redirectTo: '' } 




];
