package com.library.project.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.library.project.web.models.Autor;

public interface IAutorRepository extends JpaRepository<Autor, Long> {
    boolean existsByNombre(String nombre);
    
    boolean existsByApellidoPaterno(String apellidoPaterno);
    
    boolean existsByApellidoMaterno(String apellidoMaterno);
    
}
