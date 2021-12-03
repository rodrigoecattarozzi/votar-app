package com.codear.votar.dto;

import com.codear.votar.domain.Evento;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AuspicianteDto {

    private Long id;

    private String nombre;

    private String descripcion;

    private LocalDateTime fechaDeCreacion;

    private LocalDateTime fechaDeModificacion;

    private Evento evento;
}
