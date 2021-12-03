package com.codear.votar.dto;

import com.codear.votar.domain.Emprendimiento;
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
public class UrlDto {

    private Long id;

    private LocalDateTime fechaDeCreacion;

    private String url;

    private Emprendimiento emprendimiento;

}
