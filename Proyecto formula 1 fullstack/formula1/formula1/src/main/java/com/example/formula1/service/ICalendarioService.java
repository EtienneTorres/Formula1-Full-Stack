
package com.example.formula1.service;

import com.example.formula1.model.Calendario;
import java.util.List;


public interface ICalendarioService {
    
    
    // Obtener todos los calendarios
    List<Calendario> getAllCalendarios();

    // Obtener un calendario por ID
    Calendario getCalendarioById(Long id);

    // Crear un nuevo calendario
    Calendario saveCalendario(Calendario calendario);

    // Actualizar un calendario existente
    Calendario updateCalendario(Long id, Calendario calendario);

    // Eliminar un calendario
    void deleteCalendario(Long id);

    // Obtener el calendario de una temporada específica
    Calendario getCalendarioByTemporada(int temporada);
    
}
