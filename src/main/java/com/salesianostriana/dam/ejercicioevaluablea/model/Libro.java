package com.salesianostriana.dam.ejercicioevaluablea.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Libro {
    @Id
    @GeneratedValue
    private Long id;

    private String titulo;
    private String autor;
    private int ejemplaresDisponibles;

    @OneToMany(mappedBy = "libro", fetch = FetchType.LAZY)
    private List<Prestamo> prestamos=new ArrayList<>();
}
