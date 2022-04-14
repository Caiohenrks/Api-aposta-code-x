/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package com.codex.aposta.repository;

import com.codex.aposta.model.Aposta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  @Caiohenrks
 */
@Repository
public interface ApostaRepository extends JpaRepository<Aposta, String>{

}
