package com.codear.votar.repository;

import com.codear.votar.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    List<Usuario> findByFechaDeCreacionAfter(LocalDateTime dateTime);

    List<Usuario> findByFechaDeCreacionBetween(LocalDateTime desde, LocalDateTime hasta);

    List<Usuario> findByNombreContaining(String nombre);

    List<Usuario> findByApellidoContaining(String apellido);

    List<Usuario> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

}