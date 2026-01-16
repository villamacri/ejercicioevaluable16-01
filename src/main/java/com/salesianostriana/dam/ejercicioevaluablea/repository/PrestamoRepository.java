package com.salesianostriana.dam.ejercicioevaluablea.repository;

import com.salesianostriana.dam.ejercicioevaluablea.enums.Estado;
import com.salesianostriana.dam.ejercicioevaluablea.model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {

    @Query("Select p from prestamo where p.libro.estado is ACTIVO")
    public List<Prestamo> findDisponibles();


}
