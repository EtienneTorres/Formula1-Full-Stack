
package com.example.formula1.service;

import com.example.formula1.model.Circuito;
import java.util.List;


public interface ICircuitoService {
      // Obtener todos los circuitos
    List<Circuito> getAllCircuitos();

    // Obtener un circuito por ID
    Circuito getCircuitoById(Long id);

    // Crear un nuevo circuito
    Circuito saveCircuito(Circuito circuito);

    // Actualizar un circuito existente
    Circuito updateCircuito(Long id, Circuito circuito);

    // Eliminar un circuito
    void deleteCircuito(Long id);

    // Buscar circuitos por nombre de Gran Premio
    List<Circuito> getCircuitosByNombreGP(String nombreGP);
}
