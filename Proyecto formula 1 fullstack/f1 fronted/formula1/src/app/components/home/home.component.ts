import { Component } from '@angular/core';
import { CalendarioService } from '../../services/calendario.service';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {


calendario: any = { circuitos: [] };
proximaCarrera: any;

  constructor(private calendarioService: CalendarioService) {}

  ngOnInit(): void {
  this.calendarioService.getCalendario().subscribe({
    next: (data) => {
      if (data && data.length > 0) {
        this.calendario = data[0];  // primer elemento del array

        // Ordenar circuitos por fecha ascendente
        const circuitosOrdenados = this.calendario.circuitos.sort(
          (a: any, b: any) => new Date(a.fecha).getTime() - new Date(b.fecha).getTime()
        );

        // Tomar la primera carrera cuya fecha sea mayor o igual a hoy
        this.proximaCarrera = circuitosOrdenados.find(
          (c: any) => new Date(c.fecha) >= new Date()
        );

        console.log(this.proximaCarrera);
      } else {
        console.log("No hay circuitos disponibles en la API.");
      }
    },
    error: (err) => console.error(err)
  });
}


obtenerCarreraPorId(id: number) {
  return this.calendario.circuitos.find((c:any) => c.id === id);
}



obtenerImagenDelCircuito(nombre: string): string {
  switch(nombre) {
    case "Autódromo Hermanos Rodríguez":
      return "/mexico.jpg";
    case "Yas Marina Circuit":
      return "/assets/circuitos/abu-dhabi.jpg";
    case "Albert Park":
      return "/assets/circuitos/australia.jpg";
    case "Losail":
      return "/assets/circuitos/losail.jpg";
    case "Las Vegas":
      return "/assets/circuitos/las-vegas.jpg";
    case "Interlagos":
      return "/assets/circuitos/interlagos.jpg";
    case "Circuito de Las Américas":
      return "/assets/circuitos/americas.jpg";
    default:
      return "/assets/circuitos/default.jpg"; 
  }
}




}



