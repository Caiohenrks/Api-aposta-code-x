/*
 * LinkedIn: https://www.linkedin.com/in/caiohenrks/
 * Github: https://github.com/Caiohenrks
 */
package com.codex.aposta.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  @Caiohenrks
 */
@Configuration
public class ModelMapperConfig {

    
    @Bean
    public ModelMapper mapper(){
        return new ModelMapper();
    }
}
