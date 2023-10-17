package com.formulariospringboot.proyectoformulariospringboot.services;

import java.util.List;

import com.formulariospringboot.proyectoformulariospringboot.models.domain.Pais;

public interface PaisService {

    public List<Pais> listar();
    public Pais obtenerPorId(Integer id);

}

