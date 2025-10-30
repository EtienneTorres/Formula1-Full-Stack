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
    case "Albert Park":
      return "australia.jpg";
    case "Autódromo Hermanos Rodríguez":
      return "mexico.jpg";
    case "Autódromo Internacional de Miami":
      return "miami.jpg";
    case "Autodromo Enzo e Dino Ferrari":
      return "imola.jpg";
    case "Autodromo Nazionale di Monza":
      return "italia.jpeg";
    case "Bahrain International Circuit":
      return "bahrain.png";
    case "Baku City Circuit":
      return "qatar.jpeg";
    case "Circuit de Barcelona-Catalunya":
      return "espana.png";
    case "Circuit Gilles Villeneuve":
      return "canada.png";
    case "Hungaroring":
      return "hungria.png";
    case "Interlagos":
      return "interlagos1.jpg";
    case "Jeddah":
      return "arabiasaudita.png";
    case "Marina Bay Circuit":
      return "singapore.jpeg";
    case "Monte Carlo":
      return "monaco.png";
    case "Red Bull Ring":
      return "austria.jpeg";
    case "Shanghai International Circuit":
      return "shanghai.jpg";
    case "Silverstone":
      return "reinonuido.png";
    case "Spa-Francorchamps":
      return "belgica.png";
    case "Suzuka":
      return "japon.jpg";
    case "Yas Marina Circuit":
      return "yasmarina.png";
    case "Zandvoort":
      return "paisesbajos.png";
    default:
      return "default.jpg";
  }
}




}



