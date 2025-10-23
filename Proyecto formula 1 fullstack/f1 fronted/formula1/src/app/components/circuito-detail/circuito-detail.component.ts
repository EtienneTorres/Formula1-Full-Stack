import { Component } from '@angular/core';
import { ActivatedRoute, RouterModule } from '@angular/router';
import { CalendarioService } from '../../services/calendario.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-circuito-detail',
  standalone: true,
  imports: [CommonModule,RouterModule],
  templateUrl: './circuito-detail.component.html',
  styleUrl: './circuito-detail.component.css'
})
export class CircuitoDetailComponent {


   circuitosImg: { [key: string]: string } = {
    "Autódromo Hermanos Rodríguez": "/mexico2.png",
    "Yas Marina Circuit": "/yasmarina.png",
    "Albert Park": "/australia.jpg",
    "Losail": "/qatar.jpg",
    "Las Vegas": "/lasvegas.jpeg",
    "Interlagos": "/interlagos.png",
    "Circuito de Las Américas": "/lasamericas.png",
  };
 circuito: any;

  constructor(private route: ActivatedRoute, private servicio: CalendarioService) { }

  ngOnInit(): void {
   this.route.paramMap.subscribe(params => {
  const id = Number(params.get('id'));
  if (id) {
    this.servicio.getCircuitoById(id).subscribe({
      next: data => this.circuito = data,
      error: err => console.error('Error al cargar circuito', err)
    });
  } else {
    console.error('ID inválido en la URL');
  }
});

}


getImagenCircuito(nombreCircuito: string): string {
    return this.circuitosImg[nombreCircuito] || "/assets/circuitos/default.jpg";
  }
}