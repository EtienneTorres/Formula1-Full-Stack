
package com.example.formula1.controller;

import com.example.formula1.model.Escuderia;
import com.example.formula1.service.IEscuderiaService;
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
public class EscuderiaController {
    
      @Autowired
    private IEscuderiaService escuderiaService;

    @GetMapping("/api/escuderias")
    public List<Escuderia> getAllEscuderias() {
        return escuderiaService.getAllEscuderias();
    }

    @GetMapping("/api/escuderias/{id}")
    public Escuderia getEscuderiaById(@PathVariable Long id) {
        return escuderiaService.getEscuderiaById(id);
    }

    @PostMapping("/api/escuderias")
    public Escuderia saveEscuderia(@RequestBody Escuderia escuderia) {
        return escuderiaService.saveEscuderia(escuderia);
    }

    @PutMapping("/api/escuderias/{id}")
    public Escuderia updateEscuderia(@PathVariable Long id, @RequestBody Escuderia escuderia) {
        return escuderiaService.updateEscuderia(id, escuderia);
    }

    @DeleteMapping("/api/escuderias/{id}")
    public void deleteEscuderia(@PathVariable Long id) {
        escuderiaService.deleteEscuderia(id);
    }

    @GetMapping("/api/escuderias/nombre/{nombre}")
    public List<Escuderia> getEscuderiasByNombre(@PathVariable String nombre) {
        return escuderiaService.getEscuderiasByNombre(nombre);
    }

    @GetMapping("/api/escuderias/piloto/{pilotoId}")
    public Escuderia getEscuderiaByPiloto(@PathVariable Long pilotoId) {
        return escuderiaService.getEscuderiaByPiloto(pilotoId);
    }
    
}
