
package com.example.formula1.service;

import com.example.formula1.model.Circuito;
import com.example.formula1.repository.CircuitoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class CircuitoService implements ICircuitoService{

  @Autowired
    private CircuitoRepository circuitoRepository;

    @Override
    public List<Circuito> getAllCircuitos() {
        return circuitoRepository.findAll();
    }

    @Override
    public Circuito getCircuitoById(Long id) {
        return circuitoRepository.findById(id).orElse(null);
    }

    @Override
    public Circuito saveCircuito(Circuito circuito) {
        return circuitoRepository.save(circuito);
    }

    @Override
    public Circuito updateCircuito(Long id, Circuito circuito) {
        Circuito existing = circuitoRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setNombreCircuito(circuito.getNombreCircuito());
            existing.setNombreGranPremio(circuito.getNombreGranPremio());
            existing.setUbicacion(circuito.getUbicacion());
            existing.setFecha(circuito.getFecha());
            existing.setLongitudKm(circuito.getLongitudKm());
            existing.setVueltas(circuito.getVueltas());
            // Agregar los demás setters según necesites
            return circuitoRepository.save(existing);
        }
        return null;
    }

    @Override
    public void deleteCircuito(Long id) {
        circuitoRepository.deleteById(id);
    }

    @Override
    public List<Circuito> getCircuitosByNombreGP(String nombreGP) {
        return circuitoRepository.findByNombreGranPremioContainingIgnoreCase(nombreGP);
    }
}
