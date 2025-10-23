
package com.example.formula1.controller;

import com.example.formula1.dto.PilotoEscuderiaDTO;
import com.example.formula1.model.Piloto;
import com.example.formula1.service.IPilotoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class PilotoController {
    
    
       @Autowired
    private IPilotoService pilotoService;

    @GetMapping("/api/pilotos")
    public List<Piloto> getAllPilotos() {
        return pilotoService.getAllPilotos();
    }

    @GetMapping("/api/pilotos/{id}")
    public Piloto getPilotoById(@PathVariable Long id) {
        return pilotoService.getPilotoById(id);
    }

    @PostMapping("/api/pilotos")
    public Piloto savePiloto(@RequestBody Piloto piloto) {
        return pilotoService.savePiloto(piloto);
    }

    @PutMapping("/api/pilotos/{id}")
    public Piloto updatePiloto(@PathVariable Long id, @RequestBody Piloto piloto) {
        return pilotoService.updatePiloto(id, piloto);
    }

    @DeleteMapping("/api/pilotos/{id}")
    public void deletePiloto(@PathVariable Long id) {
        pilotoService.deletePiloto(id);
    }

    @GetMapping("/api/pilotos/escuderia/{escuderiaId}")
    public List<Piloto> getPilotosByEscuderia(@PathVariable Long escuderiaId) {
        return pilotoService.getPilotosByEscuderia(escuderiaId);
    }
    
    @GetMapping("/api/pilotosDto/{id}")
public PilotoEscuderiaDTO getPilotoporId(@PathVariable Long id) {
    return pilotoService.getPilotoDTOById(id);
}

    
}
