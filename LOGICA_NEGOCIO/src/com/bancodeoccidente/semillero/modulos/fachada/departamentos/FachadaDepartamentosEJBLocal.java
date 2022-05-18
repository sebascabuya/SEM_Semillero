package com.bancodeoccidente.semillero.modulos.fachada.departamentos;

import com.bancodeoccidente.semillero.modulos.entidades.CiudadesEntity;

import com.bancodeoccidente.semillero.modulos.entidades.DepartamentosEntity;

import javax.ejb.Local;

@Local
public interface FachadaDepartamentosEJBLocal {
    DepartamentosEntity obtenerDepartamentos(String strCodigoDaneDepartamento);
    void persistirDepartamentos(DepartamentosEntity departamentosEntity);
    DepartamentosEntity actualizarDepartamentos(DepartamentosEntity departamentosEntity);
    void removerDepartamentos(DepartamentosEntity departamentosEntity);
    DepartamentosEntity obtenerUnDepartamento(String strCodigoDaneDepartamento);
}
