package com.formulariospringboot.proyectoformulariospringboot.services;

import java.util.List;

import com.formulariospringboot.proyectoformulariospringboot.models.domain.Role;

public interface RoleService {

    public List<Role> listar();
    public Role obtenerPorId(Integer id);

}
