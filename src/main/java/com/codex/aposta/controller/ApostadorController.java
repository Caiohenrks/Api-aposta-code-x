/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package com.codex.aposta.controller;

import com.codex.aposta.model.dto.ApostadorIn;
import com.codex.aposta.service.ApostadorService;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Caiohenrks
 */
@RestController
@RequiredArgsConstructor
public class ApostadorController {

    private final ApostadorService apostadorService;

    @PostMapping("/apostador")
    public ResponseEntity salvarApostador(@Valid @RequestBody ApostadorIn apostadorIn) {
        apostadorService.salvaApostador(apostadorIn);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
