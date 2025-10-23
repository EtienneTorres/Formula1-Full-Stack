
package com.example.formula1.service;

import com.example.formula1.dto.PilotoEscuderiaDTO;
import com.example.formula1.model.Escuderia;
import com.example.formula1.model.Piloto;
import com.example.formula1.repository.PilotoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotoService implements IPilotoService {
    
 @Autowired
    private PilotoRepository pilotoRepository;

    @Override
    public List<Piloto> getAllPilotos() {
        return pilotoRepository.findAll();
    }

    @Override
    public Piloto getPilotoById(Long id) {
        return pilotoRepository.findById(id).orElse(null);
    }

    @Override
    public Piloto savePiloto(Piloto piloto) {
        return pilotoRepository.save(piloto);
    }

    @Override
    public Piloto updatePiloto(Long id, Piloto piloto) {
        Piloto existing = pilotoRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setNombre(piloto.getNombre());
            existing.setNumero(piloto.getNumero());
            existing.setEscuderiaActual(piloto.getEscuderiaActual());
            // Agregar los demás setters según necesites
            return pilotoRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deletePiloto(Long id) {
        pilotoRepository.deleteById(id);
    }

    @Override
    public List<Piloto> getPilotosByEscuderia(Long escuderiaId) {
        return pilotoRepository.findByEscuderiaActualId(escuderiaId);
    }
    
    
    public PilotoEscuderiaDTO getPilotoDTOById(Long id) {
        Piloto piloto = pilotoRepository.findById(id).orElse(null);
        if (piloto == null) return null;

        Escuderia  escuderia = piloto.getEscuderiaActual();

        return new PilotoEscuderiaDTO(
            piloto.getId(),
            piloto.getNombre(),
            piloto.getLugarNacimiento(),
            piloto.getFechaNacimiento().toString(),
            piloto.getEdad(),
            piloto.getEstatura(),
            piloto.getPeso(),
            piloto.getEstadoCivil(),
            piloto.getHobbies(),
            piloto.getLugarResidencia(),
            piloto.getSitioWeb(),
            piloto.getNumero(),
            piloto.getAnioIngresoEscuderia(),
            piloto.getGpsIniciados(),
            piloto.getPolePositions(),
            piloto.getVictorias(),
            piloto.getPodios(),
            piloto.getVueltasRapidas(),
            piloto.getPuntos(),
            piloto.getCampeonatosMundiales(),
            piloto.getAniosCampeonatos(),
            piloto.getDebut(),
            piloto.getEscuderiasAnteriores(),
            escuderia != null ? escuderia.getId() : null,
            escuderia != null ? escuderia.getNombre() : null,
            escuderia != null ? escuderia.getSede() : null,
            escuderia != null ? escuderia.getSitioWeb() : null
        );
    }
}
