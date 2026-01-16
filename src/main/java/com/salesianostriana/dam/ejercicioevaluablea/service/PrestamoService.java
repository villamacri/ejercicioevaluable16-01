package com.salesianostriana.dam.ejercicioevaluablea.service;

import com.salesianostriana.dam.ejercicioevaluablea.dto.CreatePrestamoRequest;
import com.salesianostriana.dam.ejercicioevaluablea.repository.PrestamoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PrestamoService {

    private final PrestamoRepository prestamoRepository;

    public void createPrestamo(CreatePrestamoRequest createPrestamoRequest){

    }
}
