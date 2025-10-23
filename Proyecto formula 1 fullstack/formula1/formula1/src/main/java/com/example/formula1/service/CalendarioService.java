
package com.example.formula1.service;

import com.example.formula1.model.Calendario;
import com.example.formula1.model.Circuito;
import com.example.formula1.repository.CalendarioRepository;
import com.example.formula1.repository.CircuitoRepository;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarioService implements ICalendarioService{

   @Autowired
    private CalendarioRepository calendarioRepository;
   
   @Autowired
    private CircuitoRepository circuitoRepository;  

    @Override
    public List<Calendario> getAllCalendarios() {
        return calendarioRepository.findAll();
    }

    @Override
    public Calendario getCalendarioById(Long id) {
        return calendarioRepository.findById(id).orElse(null);
    }

 
 @Override
public Calendario saveCalendario(Calendario calendario) {
    List<Circuito> circuitosExistentes = new ArrayList<>();

    for (Circuito c : calendario.getCircuitos()) {
        Circuito circuito = circuitoRepository.findById(c.getId()).orElse(null);
        if (circuito != null) {
            circuitosExistentes.add(circuito);
        }
    }

    // Ordenar por fecha antes de guardar
    Collections.sort(circuitosExistentes, Comparator.comparing(Circuito::getFecha));

    calendario.setCircuitos(circuitosExistentes);
    return calendarioRepository.save(calendario);
}

    @Override
    public Calendario updateCalendario(Long id, Calendario calendario) {
        Calendario existing = calendarioRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setTemporada(calendario.getTemporada());
            existing.setCircuitos(calendario.getCircuitos());
            return calendarioRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteCalendario(Long id) {
        calendarioRepository.deleteById(id);
    }

    @Override
    public Calendario getCalendarioByTemporada(int temporada) {
        return calendarioRepository.findByTemporada(temporada);
    }
}
