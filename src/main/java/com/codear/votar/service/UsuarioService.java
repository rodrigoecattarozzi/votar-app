package com.codear.votar.service;

import com.codear.votar.domain.Usuario;
import com.codear.votar.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


@Service
abstract class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UserDetails loadUserByNombreOrApellido(String nombre, String apellido){
        return (UserDetails) usuarioRepository.findByNombreContainingOrApellidoContaining(nombre, apellido);
    }
    
}