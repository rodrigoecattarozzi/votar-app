package com.codear.votar.dto;

import com.codear.votar.domain.Ciudad;
import com.codear.votar.domain.Pais;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.List;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProvinciaDto {

    private Long id;

    private String nombre;

    private Pais pais;

    private List<Ciudad> ciudad;

}
