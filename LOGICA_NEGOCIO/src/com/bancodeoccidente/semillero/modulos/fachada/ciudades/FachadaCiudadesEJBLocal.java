package com.bancodeoccidente.semillero.modulos.fachada.ciudades;

import com.bancodeoccidente.semillero.modulos.entidades.CiudadesEntity;

import javax.ejb.Local;

@Local
public interface FachadaCiudadesEJBLocal {
    CiudadesEntity obtenerCiudades(String strCodigoDaneCiudad);
    void persistirCiudades(CiudadesEntity ciudadesEntity);
    CiudadesEntity actualizarCuidades(CiudadesEntity ciudadesEntity);
    void removerCiudades(CiudadesEntity ciudadesEntity);
}
