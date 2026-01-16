package com.salesianostriana.dam.ejercicioevaluablea.model;

import com.salesianostriana.dam.ejercicioevaluablea.enums.Estado;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Prestamo {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDate fechaInicio;
    @Enumerated
    private Estado estado;

    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.LAZY)
    private Libro libro;
}
