
package com.example.formula1.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Piloto {
    
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Datos personales
    private String nombre;
    private String lugarNacimiento;
    private LocalDate fechaNacimiento;
    private int edad;
    private double estatura;
    private double peso;
    private String estadoCivil;
    private String hobbies;
    private String lugarResidencia;
    private String sitioWeb;

    // Datos deportivos
    private int numero;

    @ManyToOne
    @JoinColumn(name = "escuderia_id")
    @JsonBackReference
    private Escuderia escuderiaActual;

    private int anioIngresoEscuderia;
    private int gpsIniciados;
    private int polePositions;
    private int victorias;
    private int podios;
    private int vueltasRapidas;
    private double puntos;
    private int campeonatosMundiales;
    private String aniosCampeonatos;
    private String debut;
    private String escuderiasAnteriores;

    // Constructores, getters y setters
    public Piloto() {}

    public Piloto(Long id, String nombre, String lugarNacimiento, LocalDate fechaNacimiento, int edad, double estatura, double peso, String estadoCivil, String hobbies, String lugarResidencia, String sitioWeb, int numero, Escuderia escuderiaActual, int anioIngresoEscuderia, int gpsIniciados, int polePositions, int victorias, int podios, int vueltasRapidas, double puntos, int campeonatosMundiales, String aniosCampeonatos, String debut, String escuderiasAnteriores) {
        this.id = id;
        this.nombre = nombre;
        this.lugarNacimiento = lugarNacimiento;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.estadoCivil = estadoCivil;
        this.hobbies = hobbies;
        this.lugarResidencia = lugarResidencia;
        this.sitioWeb = sitioWeb;
        this.numero = numero;
        this.escuderiaActual = escuderiaActual;
        this.anioIngresoEscuderia = anioIngresoEscuderia;
        this.gpsIniciados = gpsIniciados;
        this.polePositions = polePositions;
        this.victorias = victorias;
        this.podios = podios;
        this.vueltasRapidas = vueltasRapidas;
        this.puntos = puntos;
        this.campeonatosMundiales = campeonatosMundiales;
        this.aniosCampeonatos = aniosCampeonatos;
        this.debut = debut;
        this.escuderiasAnteriores = escuderiasAnteriores;
    }

    
    
}
