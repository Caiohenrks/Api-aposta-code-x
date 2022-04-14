/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package com.codex.aposta.service;

import com.codex.aposta.model.Aposta;
import com.codex.aposta.model.Apostador;
import com.codex.aposta.model.dto.ApostaIn;
import com.codex.aposta.model.dto.ApostaOut;
import com.codex.aposta.repository.ApostaRepository;
import com.codex.aposta.repository.ApostadorRepository;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

/**
 * @Caiohenrks
 */

@RequiredArgsConstructor
@Service
public class ApostaService {

    private final ApostaRepository apostaRepository;
    private final ApostadorRepository apostadorRepository;

    public ApostaOut salvaAposta(ApostaIn apostaIn) {
        ApostaOut apostaOut = null;
        try {
            Optional<Apostador> apostador = apostadorRepository.findById(apostaIn.getApostadorId());

            String numAposta = UUID.randomUUID().toString();
            Aposta aposta = new Aposta(numAposta, apostador.get());

            apostaRepository.save(aposta);
            apostaOut = new ApostaOut(numAposta, apostador.get().getNome(), apostador.get().getEmail());
        } catch (NoSuchElementException ex) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return apostaOut ;
    }
}
