package com.bancodeoccidente.semillero.modulos.fachada.clavesinvalidas;

import com.bancodeoccidente.semillero.modulos.entidades.ClavesInvalidasEntity;

import javax.ejb.Local;
import java.util.List;

@Local
public interface FachadaClavesInvalidasEJBLocal {
    List<ClavesInvalidasEntity> obtenerClavesInvalidasProducto(String strNumeroProducto);
    ClavesInvalidasEntity obtenerClavesInvalidas (String strNumeroProducto, Integer numClaveInvalida);
    void persistirClavesInvalidas (ClavesInvalidasEntity clavesInvalidasEntity);
    ClavesInvalidasEntity actualizarClavesInvalidas (ClavesInvalidasEntity clavesInvalidasEntity);
    void removerClavesInvalidas (ClavesInvalidasEntity clavesInvalidasEntity);
}
