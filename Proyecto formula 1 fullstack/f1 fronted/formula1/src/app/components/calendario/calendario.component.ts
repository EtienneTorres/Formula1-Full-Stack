import { Component } from '@angular/core';
import { CalendarioService } from '../../services/calendario.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-calendario',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './calendario.component.html',
  styleUrl: './calendario.component.css'
})
export class CalendarioComponent {
  calendario: any[] = [];
  temporada: number = 2025;

  circuitosImg: { [key: string]: string } = {
    "Albert Park": "/australia.jpg",
    "Shanghai International Circuit": "/shanghai.jpg",
    "Suzuka": "/japon.jpg",
    "Bahrain International Circuit": "/Bahrein.jpeg",
    "Jeddah": "/arabiasaudita.png",
    "Autódromo Internacional de Miami": "/miami.png",
    "Autodromo Enzo e Dino Ferrari": "/imola.png",
    "Monte Carlo": "/monaco.png",
    "Circuit de Barcelona-Catalunya": "/espana.png",
    "Circuit Gilles Villeneuve": "/canada.png",
    "Red Bull Ring": "/austria.jpeg",
    "Silverstone": "/reinounido.png",
    "Hungaroring": "/hungria.png",
    "Spa-Francorchamps": "/belgica.png",
    "Zandvoort": "/paisesbajos.png",
    "Autodromo Nazionale di Monza": "/italia.jpeg",
    "Baku City Circuit": "/azerbaiyan.png",
    "Marina Bay Circuit": "/singapore.jpeg",
    "Losail": "/qatar.jpeg",
    "Circuito de Las Américas": "/usa.jpg",
    "Autódromo Hermanos Rodríguez": "/mexico2.png",
    "Interlagos": "/interlagos.png",
    "Las Vegas": "/lasvegas.jpeg",
    "Yas Marina Circuit": "/yasmarina.png"
  };

  constructor(private servicio: CalendarioService) {}

  ngOnInit(): void {
    this.servicio.getCalendarioTemporada(this.temporada).subscribe(data => {
      // Ordenar por fecha ascendente
      this.calendario = data.circuitos.sort((a: any, b: any) => 
        new Date(a.fecha).getTime() - new Date(b.fecha).getTime()
      );
    });
  }
  getImagenCircuito(nombreCircuito: string): string {
    return this.circuitosImg[nombreCircuito] || "/assets/circuitos/default.jpg";
  }
}
