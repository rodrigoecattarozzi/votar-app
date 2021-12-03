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
public class EmprendimientoDto {

    private Long id;

    private String nombre;

    private String descripcion;

    private String contenido;

    private LocalDateTime fechaDeCreacion;

    private LocalDateTime fechaDeModificacion;

    private BigDecimal objetivo;

    private Usuario usuario;

    private Ciudad ciudad;

    private List<Voto> voto;

    private List<Tag> tag;

    private List<Url> url;


}
