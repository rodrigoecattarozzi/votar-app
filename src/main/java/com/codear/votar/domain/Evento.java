package com.codear.votar.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Accessors(chain = true)
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @Column(columnDefinition="TEXT")
    @NotBlank
    private String descripcion;

    @CreationTimestamp
    private LocalDateTime fechaDeCreacion;

    @UpdateTimestamp
    private LocalDateTime fechaDeModificacion;

    @NotBlank
    @DateTimeFormat
    private LocalDateTime fechaDePublicacion;

    @NotBlank
    @DateTimeFormat
    private LocalDateTime fechaDeCierre;

    @NotBlank
    private BigDecimal premio;

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Voto> voto = new ArrayList<>();

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Suscriptor> suscriptor = new ArrayList<>();

    @OneToMany(mappedBy = "evento", cascade = CascadeType.ALL)
    private List<Auspiciante> auspiciante = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ciudad_id", nullable = false)
    private Ciudad ciudad;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_id", nullable = false)
    private Estado estado;

}
