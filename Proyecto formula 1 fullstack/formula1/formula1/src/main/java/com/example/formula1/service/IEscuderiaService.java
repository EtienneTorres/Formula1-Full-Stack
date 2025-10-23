
package com.example.formula1.service;

import com.example.formula1.model.Escuderia;
import java.util.List;


public interface IEscuderiaService {
    
      // Obtener todas las escuderías
    List<Escuderia> getAllEscuderias();

    // Obtener una escudería por ID
    Escuderia getEscuderiaById(Long id);

    // Crear una nueva escudería
    Escuderia saveEscuderia(Escuderia escuderia);

    // Actualizar una escudería existente
    Escuderia updateEscuderia(Long id, Escuderia escuderia);

    // Eliminar una escudería
    void deleteEscuderia(Long id);

    // Buscar escuderías por nombre
    List<Escuderia> getEscuderiasByNombre(String nombre);

    // Obtener escudería por piloto (opcional)
    Escuderia getEscuderiaByPiloto(Long pilotoId);
    
    
    
}
