import { Component, OnInit } from '@angular/core';
import { PilotosServiceService } from '../../services/pilotos-service.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-pilotos',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './pilotos.component.html',
  styleUrl: './pilotos.component.css'
})
export class PilotosComponent implements OnInit {
    escuderias: any[] = [];
  pilotos: any[] = [];
  selectedEscuderiaId: number | null = null;

  constructor(private pilotosService: PilotosServiceService) {}

  ngOnInit(): void {
    this.cargarEscuderias();
  }

  cargarEscuderias() {
    this.pilotosService.getEscuderias().subscribe({
      next: (data) => {
        this.escuderias = data;
        if (data.length > 0) {
          this.selectedEscuderiaId = data[0].id;
          this.pilotos = data[0].pilotosOficiales || [];
        }
      },
      error: (err) => console.error('Error al cargar escuderías:', err)
    });
  }

  seleccionarEscuderia(id: number) {
    this.selectedEscuderiaId = id;
    this.pilotosService.getPilotosOficialesEscuderia(id).subscribe({
      next: (data) => {
        this.pilotos = data.pilotosOficiales || [];
      },
      error: (err) => console.error('Error al cargar pilotos de la escudería:', err)
    });
  }
}
