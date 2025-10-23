import { Component } from '@angular/core';
import { PuntosServicesService } from '../../services/puntos-services.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-puntos',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './puntos.component.html',
  styleUrl: './puntos.component.css'
})


export class PuntosComponent {
   escuderias: any[] = [];

  // Pilotos con sus totales de puntos
  pilotosTotales = [
    { nombre: 'Oscar Piastri', total: 346 },
    { nombre: 'Lando Norris', total: 332 },
    { nombre: 'Max Verstappen', total: 306 },
    { nombre: 'George Russell', total: 252 },
    { nombre: 'Charles Leclerc', total: 192 },
    { nombre: 'Lewis Hamilton', total: 142 },
    { nombre: 'Kimi Antonelli', total: 89 },
    { nombre: 'Alexander Albon', total: 73 },
    { nombre: 'Nico Hulkenberg', total: 41 },
    { nombre: 'Isack Hadjar', total: 39 },
    { nombre: 'Carlos Sainz', total: 38 },
    { nombre: 'Fernando Alonso', total: 37 },
    { nombre: 'Lance Stroll', total: 32 },
    { nombre: 'Liam Lawson', total: 30 },
    { nombre: 'Esteban Ocon', total: 28 },
    { nombre: 'Yuki Tsunoda', total: 28 },
    { nombre: 'Pierre Gasly', total: 20 },
    { nombre: 'Oliver Bearman', total: 20 },
    { nombre: 'Gabriel Bortoleto', total: 18 },
    { nombre: 'Franco Colapinto', total: 0 },
    { nombre: 'Jack Doohan', total: 0 },
  ];

  constructor(private puntoService: PuntosServicesService) {}

  ngOnInit(): void {
    this.puntoService.getEscuderias().subscribe({
      next: (data) => {
        // Ordenar escuderías por puntos temporada
        this.escuderias = data.sort((a: any, b: any) => b.puntosTemporadaActual - a.puntosTemporadaActual);
      },
      error: (err) => console.error('Error al cargar escuderías', err)
    });
  }

}
