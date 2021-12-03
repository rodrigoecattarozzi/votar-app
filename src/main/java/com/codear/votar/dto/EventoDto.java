package com.codear.votar.dto;

import com.codear.votar.domain.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import java.util.List;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventoDto {

    private Long id;

    private String nombre;

    private String descripcion;

    private LocalDateTime fechaDeCreacion;

    private LocalDateTime fechaDeModificacion;

    private LocalDateTime fechaDePublicacion;

    private LocalDateTime fechaDeCierre;

    private BigDecimal premio;

    private Usuario usuario;

    private Ciudad ciudad;

    private Estado estado;

    private List<Voto> voto;

    private List<Suscriptor> suscriptor;

    private List<Auspiciante> auspiciante;


}
