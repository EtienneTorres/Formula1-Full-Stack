
package com.example.formula1.controller;

import com.example.formula1.model.Calendario;
import com.example.formula1.service.ICalendarioService;
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
public class CalendarioController {
    
      @Autowired
    private ICalendarioService calendarioService;

    @GetMapping("/api/calendarios")
    public List<Calendario> getAllCalendarios() {
        return calendarioService.getAllCalendarios();
    }

    @GetMapping("/api/calendarios/{id}")
    public Calendario getCalendarioById(@PathVariable Long id) {
        return calendarioService.getCalendarioById(id);
    }

    @PostMapping("/api/calendarios")
    public Calendario saveCalendario(@RequestBody Calendario calendario) {
        return calendarioService.saveCalendario(calendario);
    }

    @PutMapping("/api/calendarios/{id}")
    public Calendario updateCalendario(@PathVariable Long id, @RequestBody Calendario calendario) {
        return calendarioService.updateCalendario(id, calendario);
    }

    @DeleteMapping("/api/calendarios/{id}")
    public void deleteCalendario(@PathVariable Long id) {
        calendarioService.deleteCalendario(id);
    }

    @GetMapping("/api/calendarios/temporada/{temporada}")
    public Calendario getCalendarioByTemporada(@PathVariable int temporada) {
        return calendarioService.getCalendarioByTemporada(temporada);
    }
}
