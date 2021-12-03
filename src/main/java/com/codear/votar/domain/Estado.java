package com.codear.votar.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "estado")
public class Estado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @Column(columnDefinition="TEXT")
    @NotBlank
    private String descripcion;

    @OneToMany(mappedBy = "estado", cascade = CascadeType.ALL)
    private List<Evento> evento = new ArrayList<>();

}
