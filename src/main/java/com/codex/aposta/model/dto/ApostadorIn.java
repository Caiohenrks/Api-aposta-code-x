/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package com.codex.aposta.model.dto;

import javax.validation.constraints.NotBlank;
import lombok.Getter;

/**
 * @Caiohenrks
 */
@Getter
public class ApostadorIn {

    @NotBlank
    private String nome;

    @NotBlank
    private String email;
}
