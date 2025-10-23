
package com.example.formula1.controller;

import com.example.formula1.model.Circuito;
import com.example.formula1.service.ICircuitoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class CircuitoController {
    
    @Autowired
    private ICircuitoService circuitoService;

    @GetMapping("/api/circuitos")
    public List<Circuito> getAllCircuitos() {
        return circuitoService.getAllCircuitos();
    }

    @GetMapping("/api/circuitos/{id}")
    public Circuito getCircuitoById(@PathVariable Long id) {
        return circuitoService.getCircuitoById(id);
    }

    @PostMapping("/api/circuitos")
    public Circuito saveCircuito(@RequestBody Circuito circuito) {
        return circuitoService.saveCircuito(circuito);
    }

    // Guardar varios circuitos
    @PostMapping("/api/circuitos/lista")
    public List<Circuito> saveCircuitos(@RequestBody List<Circuito> circuitos) {
        List<Circuito> saved = new ArrayList<>();
        for (Circuito c : circuitos) {
            saved.add(circuitoService.saveCircuito(c));
        }
        return saved;
    }
    
    @PutMapping("/api/circuitos/update/{id}")
    public Circuito updateCircuito(@PathVariable Long id, @RequestBody Circuito circuito) {
        return circuitoService.updateCircuito(id, circuito);
    }

    @DeleteMapping("/api/circuitos/eliminar/{id}")
    public void deleteCircuito(@PathVariable Long id) {
        circuitoService.deleteCircuito(id);
    }
    @GetMapping("/api/circuitos/gp/{nombreGP}")
    public List<Circuito> getCircuitosByNombreGP(@PathVariable String nombreGP) {
        return circuitoService.getCircuitosByNombreGP(nombreGP);
    }
    
    
    
    
}
