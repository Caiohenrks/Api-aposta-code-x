/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package com.codex.aposta.repository;

import com.codex.aposta.model.Apostador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Caioh
 */
@Repository
public interface ApostadorRepository extends JpaRepository<Apostador, Long>{
    
}
