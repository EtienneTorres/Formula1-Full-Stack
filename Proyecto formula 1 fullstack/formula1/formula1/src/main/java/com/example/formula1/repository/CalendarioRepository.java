
package com.example.formula1.repository;

import com.example.formula1.model.Calendario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CalendarioRepository  extends JpaRepository<Calendario , Long>{
    
        Calendario findByTemporada(int temporada);
    
}
