/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package com.codex.aposta.controller;

import com.codex.aposta.model.dto.ApostaIn;
import com.codex.aposta.model.dto.ApostaOut;
import com.codex.aposta.model.dto.ApostasOut;
import com.codex.aposta.service.ApostaService;
import java.util.List;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *  @Caiohenrks
 */
@RequiredArgsConstructor
@RestController
public class ApostaController {
    
    private final ApostaService apostaService;
    
    @PostMapping("/aposta")
    public ResponseEntity<ApostaOut> salvaAposta(@Valid @RequestBody ApostaIn apostaIn){
        ApostaOut apostaOut = apostaService.salvaAposta(apostaIn);
        
        return ResponseEntity.status(HttpStatus.CREATED).body(apostaOut);
    }
    
    @GetMapping("/buscaApostasPorIdApostador/{idApostador}")
    public List<ApostasOut> buscaApostasPorIdApostador(@PathVariable Long idApostador){
        return apostaService.buscaApostasPorIdApostador(idApostador);
        

    }
}
