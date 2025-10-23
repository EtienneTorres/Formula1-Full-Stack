
package com.example.formula1.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PilotoEscuderiaDTO {
    
    private Long id;
    private String nombre;
    private String lugarNacimiento;
    private String fechaNacimiento;
    private int edad;
    private double estatura;
    private double peso;
    private String estadoCivil;
    private String hobbies;
    private String lugarResidencia;
    private String sitioWeb;
    private int numero;
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

    // Datos de la escudería actual como campos simples
    private Long escuderiaId;
    private String escuderiaNombre;
    private String escuderiaSede;
    private String escuderiaSitioWeb;

    public PilotoEscuderiaDTO(Long id, String nombre, String lugarNacimiento, String fechaNacimiento, int edad, double estatura, double peso, String estadoCivil, String hobbies, String lugarResidencia, String sitioWeb, int numero, int anioIngresoEscuderia, int gpsIniciados, int polePositions, int victorias, int podios, int vueltasRapidas, double puntos, int campeonatosMundiales, String aniosCampeonatos, String debut, String escuderiasAnteriores, Long escuderiaId, String escuderiaNombre, String escuderiaSede, String escuderiaSitioWeb) {
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
        this.escuderiaId = escuderiaId;
        this.escuderiaNombre = escuderiaNombre;
        this.escuderiaSede = escuderiaSede;
        this.escuderiaSitioWeb = escuderiaSitioWeb;
    }
    
    
    
    
    
    
    
    
    
    
    
}
