package com.bancodeoccidente.semillero.modulos.fachada.claves;

import com.bancodeoccidente.semillero.modulos.entidades.ClavesEntity;

import java.sql.RowId;

import javax.ejb.Local;
import java.util.List;

import oracle.jbo.domain.RowID;

@Local
public interface FachadaClavesEJBLocal {
    ClavesEntity obtenerUltimaClaveProducto (String strNumeroProducto);
    List<ClavesEntity> obtenerListaClavesProductos (String strNumeroProducto);
    ClavesEntity obtenerClaves (String strNumeroProducto, Integer numClaveProducto);
    void persistirClaves (ClavesEntity clavesEntity);
    ClavesEntity actualizarClaves (ClavesEntity clavesEntity);
    void removerClaves (ClavesEntity clavesEntity);
}
