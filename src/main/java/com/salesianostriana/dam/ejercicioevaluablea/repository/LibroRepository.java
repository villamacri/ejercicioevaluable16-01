package com.salesianostriana.dam.ejercicioevaluablea.repository;

import com.salesianostriana.dam.ejercicioevaluablea.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends JpaRepository<Libro, Long> {
}
