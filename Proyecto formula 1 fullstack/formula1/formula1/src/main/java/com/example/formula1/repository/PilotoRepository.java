
package com.example.formula1.repository;

import com.example.formula1.model.Piloto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PilotoRepository  extends JpaRepository<Piloto, Long>{
    
     List<Piloto> findByEscuderiaActualId(Long escuderiaId);
    
}
