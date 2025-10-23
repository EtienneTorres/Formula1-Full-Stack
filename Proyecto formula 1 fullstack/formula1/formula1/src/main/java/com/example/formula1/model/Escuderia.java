
package com.example.formula1.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
 public class Escuderia {
    
    @Getter @Setter
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Datos históricos
    private String nombre;
    private int anioFundacion;
    private String debutF1;
    private int grandesPremiosIniciados;
    private int polePositions;
    private int podios;
    private int victorias;
    private int vueltasRapidas;
    private double puntosHistoricos;
    private int titulosConstructores;
    private String aniosTitulos;

    // Datos generales
    private String jefeEscuderia;
    private String directorTecnico;
    private String jefeDiseno;
    private String sede;
    private String sitioWeb;

    // Datos temporada actual
    private String auto;
    private String motor;
    private String neumaticos;
    private String combustible;
    private String lubricante;

    @OneToMany(mappedBy = "escuderiaActual")
    @JsonManagedReference
    private List<Piloto> pilotosOficiales;


    private double puntosTemporadaActual;

    // Constructores, getters y setters
    public Escuderia() {}

    public Escuderia(Long id, String nombre, int anioFundacion, String debutF1, int grandesPremiosIniciados, int polePositions, int podios, int victorias, int vueltasRapidas, double puntosHistoricos, int titulosConstructores, String aniosTitulos, String jefeEscuderia, String directorTecnico, String jefeDiseno, String sede, String sitioWeb, String auto, String motor, String neumaticos, String combustible, String lubricante, List<Piloto> pilotosOficiales, double puntosTemporadaActual) {
        this.id = id;
        this.nombre = nombre;
        this.anioFundacion = anioFundacion;
        this.debutF1 = debutF1;
        this.grandesPremiosIniciados = grandesPremiosIniciados;
        this.polePositions = polePositions;
        this.podios = podios;
        this.victorias = victorias;
        this.vueltasRapidas = vueltasRapidas;
        this.puntosHistoricos = puntosHistoricos;
        this.titulosConstructores = titulosConstructores;
        this.aniosTitulos = aniosTitulos;
        this.jefeEscuderia = jefeEscuderia;
        this.directorTecnico = directorTecnico;
        this.jefeDiseno = jefeDiseno;
        this.sede = sede;
        this.sitioWeb = sitioWeb;
        this.auto = auto;
        this.motor = motor;
        this.neumaticos = neumaticos;
        this.combustible = combustible;
        this.lubricante = lubricante;
        this.pilotosOficiales = pilotosOficiales;
        this.puntosTemporadaActual = puntosTemporadaActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnioFundacion() {
        return anioFundacion;
    }

    public void setAnioFundacion(int anioFundacion) {
        this.anioFundacion = anioFundacion;
    }

    public String getDebutF1() {
        return debutF1;
    }

    public void setDebutF1(String debutF1) {
        this.debutF1 = debutF1;
    }

    public int getGrandesPremiosIniciados() {
        return grandesPremiosIniciados;
    }

    public void setGrandesPremiosIniciados(int grandesPremiosIniciados) {
        this.grandesPremiosIniciados = grandesPremiosIniciados;
    }

    public int getPolePositions() {
        return polePositions;
    }

    public void setPolePositions(int polePositions) {
        this.polePositions = polePositions;
    }

    public int getPodios() {
        return podios;
    }

    public void setPodios(int podios) {
        this.podios = podios;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getVueltasRapidas() {
        return vueltasRapidas;
    }

    public void setVueltasRapidas(int vueltasRapidas) {
        this.vueltasRapidas = vueltasRapidas;
    }

    public double getPuntosHistoricos() {
        return puntosHistoricos;
    }

    public void setPuntosHistoricos(double puntosHistoricos) {
        this.puntosHistoricos = puntosHistoricos;
    }

    public int getTitulosConstructores() {
        return titulosConstructores;
    }

    public void setTitulosConstructores(int titulosConstructores) {
        this.titulosConstructores = titulosConstructores;
    }

    public String getAniosTitulos() {
        return aniosTitulos;
    }

    public void setAniosTitulos(String aniosTitulos) {
        this.aniosTitulos = aniosTitulos;
    }

    public String getJefeEscuderia() {
        return jefeEscuderia;
    }

    public void setJefeEscuderia(String jefeEscuderia) {
        this.jefeEscuderia = jefeEscuderia;
    }

    public String getDirectorTecnico() {
        return directorTecnico;
    }

    public void setDirectorTecnico(String directorTecnico) {
        this.directorTecnico = directorTecnico;
    }

    public String getJefeDiseno() {
        return jefeDiseno;
    }

    public void setJefeDiseno(String jefeDiseno) {
        this.jefeDiseno = jefeDiseno;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    public String getAuto() {
        return auto;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getNeumaticos() {
        return neumaticos;
    }

    public void setNeumaticos(String neumaticos) {
        this.neumaticos = neumaticos;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getLubricante() {
        return lubricante;
    }

    public void setLubricante(String lubricante) {
        this.lubricante = lubricante;
    }

    public List<Piloto> getPilotosOficiales() {
        return pilotosOficiales;
    }

    public void setPilotosOficiales(List<Piloto> pilotosOficiales) {
        this.pilotosOficiales = pilotosOficiales;
    }

    public double getPuntosTemporadaActual() {
        return puntosTemporadaActual;
    }

    public void setPuntosTemporadaActual(double puntosTemporadaActual) {
        this.puntosTemporadaActual = puntosTemporadaActual;
    }
    
    
    
    

}
