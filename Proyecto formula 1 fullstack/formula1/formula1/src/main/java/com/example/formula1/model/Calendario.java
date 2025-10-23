
package com.example.formula1.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Calendario {
    
    
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int temporada; // 2025

    @OneToMany(cascade = CascadeType.ALL)
    private List<Circuito> circuitos;

    public Calendario() {}

    public Calendario(Long id, int temporada, List<Circuito> circuitos) {
        this.id = id;
        this.temporada = temporada;
        this.circuitos = circuitos;
    }
    
    
    
    
}
