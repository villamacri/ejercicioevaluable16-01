package com.salesianostriana.dam.ejercicioevaluablea.dto;

import com.salesianostriana.dam.ejercicioevaluablea.enums.Estado;
import com.salesianostriana.dam.ejercicioevaluablea.model.Libro;

import java.time.LocalDate;

public record PrestamoDto(
        Long id,
        LocalDate fechaInicio,
        Estado estado
) {
}
