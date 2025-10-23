/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.formula1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
 @Entity
public class Circuito {
    
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCircuito;
    private String nombreGranPremio;
    private String ubicacion;
    private LocalDate fecha;
    private double longitudKm;
    private int vueltas;
    private int curvas;
    private double distanciaLineaSalida;
    private String cargaAerodinamica;
    private String desgasteNeumaticos;

    private String recordPole;
    private String recordPolePiloto;
    private int recordPoleAnio;
    private String recordVuelta;
    private String recordVueltaPiloto;
    private int recordVueltaAnio;
    private String pilotoMasVictorias;
    private String escuderiaMasVictorias;
    private String motorMasVictorias;
    private String neumaticosMasVictorias;

    public Circuito() {}

    public Circuito(Long id, String nombreCircuito, String nombreGranPremio, String ubicacion, LocalDate fecha, double longitudKm, int vueltas, int curvas, double distanciaLineaSalida, String cargaAerodinamica, String desgasteNeumaticos, String recordPole, String recordPolePiloto, int recordPoleAnio, String recordVuelta, String recordVueltaPiloto, int recordVueltaAnio, String pilotoMasVictorias, String escuderiaMasVictorias, String motorMasVictorias, String neumaticosMasVictorias) {
        this.id = id;
        this.nombreCircuito = nombreCircuito;
        this.nombreGranPremio = nombreGranPremio;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.longitudKm = longitudKm;
        this.vueltas = vueltas;
        this.curvas = curvas;
        this.distanciaLineaSalida = distanciaLineaSalida;
        this.cargaAerodinamica = cargaAerodinamica;
        this.desgasteNeumaticos = desgasteNeumaticos;
        this.recordPole = recordPole;
        this.recordPolePiloto = recordPolePiloto;
        this.recordPoleAnio = recordPoleAnio;
        this.recordVuelta = recordVuelta;
        this.recordVueltaPiloto = recordVueltaPiloto;
        this.recordVueltaAnio = recordVueltaAnio;
        this.pilotoMasVictorias = pilotoMasVictorias;
        this.escuderiaMasVictorias = escuderiaMasVictorias;
        this.motorMasVictorias = motorMasVictorias;
        this.neumaticosMasVictorias = neumaticosMasVictorias;
    }
    
    
}
