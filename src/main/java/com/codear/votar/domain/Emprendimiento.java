package com.codear.votar.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
@Table(name = "emprendimiento")
public class Emprendimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nombre;

    @Column(columnDefinition="TEXT")
    @NotBlank
    private String descripcion;

    @Column(columnDefinition="TEXT")
    @NotBlank
    private String contenido;

    @CreationTimestamp
    private LocalDateTime fechaDeCreacion;

    @UpdateTimestamp
    private LocalDateTime fechaDeModificacion;

    @NotBlank
    private BigDecimal objetivo;

    @OneToMany(mappedBy = "emprendimiento", cascade = CascadeType.ALL)
    private List<Voto> voto = new ArrayList<>();

    @OneToMany(mappedBy = "emprendimiento", cascade = CascadeType.ALL)
    private List<Tag> tag = new ArrayList<>();

    @OneToMany(mappedBy = "emprendimiento", cascade = CascadeType.ALL)
    private List<Url> url = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ciudad_id", nullable = false)
    private Ciudad ciudad;

}
