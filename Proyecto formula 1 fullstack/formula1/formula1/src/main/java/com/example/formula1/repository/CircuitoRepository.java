
package com.example.formula1.repository;

import com.example.formula1.model.Circuito;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface CircuitoRepository  extends JpaRepository<Circuito , Long>{
    
        List<Circuito> findByNombreGranPremioContainingIgnoreCase(String nombreGP);

    
}
