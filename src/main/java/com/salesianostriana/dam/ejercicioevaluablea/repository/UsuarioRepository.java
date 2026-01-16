package com.salesianostriana.dam.ejercicioevaluablea.repository;

import com.salesianostriana.dam.ejercicioevaluablea.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
