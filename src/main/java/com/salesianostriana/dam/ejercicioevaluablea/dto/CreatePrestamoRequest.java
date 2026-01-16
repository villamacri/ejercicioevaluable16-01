package com.salesianostriana.dam.ejercicioevaluablea.dto;

import com.salesianostriana.dam.ejercicioevaluablea.enums.Estado;

import java.time.LocalDate;

public record CreatePrestamoRequest(
        Long id,
        LocalDate fechaInicio,
        Estado estado
) {
}
