
package com.example.formula1.service;

import com.example.formula1.model.Escuderia;
import com.example.formula1.model.Piloto;
import com.example.formula1.repository.EscuderiaRepository;
import com.example.formula1.repository.PilotoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class EscuderiaService implements  IEscuderiaService{

    @Autowired
    private EscuderiaRepository escuderiaRepository;

    @Autowired
    private PilotoRepository pilotoRepository;

    @Override
    public List<Escuderia> getAllEscuderias() {
        return escuderiaRepository.findAll();
    }

    @Override
    public Escuderia getEscuderiaById(Long id) {
        return escuderiaRepository.findById(id).orElse(null);
    }

    @Override
    public Escuderia saveEscuderia(Escuderia escuderia) {
        return escuderiaRepository.save(escuderia);
    }

    @Override
    public Escuderia updateEscuderia(Long id, Escuderia escuderia) {
        Escuderia existing = escuderiaRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setNombre(escuderia.getNombre());
            existing.setAnioFundacion(escuderia.getAnioFundacion());
            existing.setPilotosOficiales(escuderia.getPilotosOficiales());
            // Agregar demás setters según necesites
            return escuderiaRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteEscuderia(Long id) {
        escuderiaRepository.deleteById(id);
    }

    @Override
    public List<Escuderia> getEscuderiasByNombre(String nombre) {
        return escuderiaRepository.findByNombreContainingIgnoreCase(nombre);
    }

    @Override
    public Escuderia getEscuderiaByPiloto(Long pilotoId) {
        Piloto piloto = pilotoRepository.findById(pilotoId).orElse(null);
        if (piloto != null) {
            return piloto.getEscuderiaActual();
        }
        return null;
    }
    
}
