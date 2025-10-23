
package com.example.formula1.repository;

import com.example.formula1.model.Escuderia;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EscuderiaRepository  extends JpaRepository<Escuderia , Long>{
    
        List<Escuderia> findByNombreContainingIgnoreCase(String nombre);

    
}
