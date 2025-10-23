
package com.example.formula1.service;

import com.example.formula1.dto.PilotoEscuderiaDTO;
import com.example.formula1.model.Piloto;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;


public interface IPilotoService {
    
    
      // Obtener todos los pilotos
    List<Piloto> getAllPilotos();

    // Obtener un piloto por ID
    Piloto getPilotoById(Long id);

    // Crear un nuevo piloto
    Piloto savePiloto(Piloto piloto);

    // Actualizar un piloto existente
    Piloto updatePiloto(Long id, Piloto piloto);

    // Eliminar un piloto
    void deletePiloto(Long id);

    // Buscar pilotos por escuderia
    List<Piloto> getPilotosByEscuderia(Long escuderiaId);
    


        public PilotoEscuderiaDTO getPilotoDTOById(Long id) ;

}
