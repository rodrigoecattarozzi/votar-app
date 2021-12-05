package com.codear.votar.dto;

import com.codear.votar.domain.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Accessors(chain = true)
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class UsuarioDto {

    private Long id;

    private String nombre;

    private String apellido;

    private String email;

    private String password;

    private Rol rol;

    private LocalDateTime fechaDeCreacion;

    private LocalDateTime fechaDeModificacion;

    private Ciudad ciudad;

    private Provincia provincia;

    private PaisDto pais;

    private List<Emprendimiento> emprendimiento;

    private List<Evento> evento;

    private List<Voto> voto;

    private List<Suscriptor> suscriptor;

}
