package com.bancodeoccidente.semillero.modulos.fachada.referencias;

import com.bancodeoccidente.semillero.modulos.entidades.ReferenciasEntity;

import javax.ejb.Local;
import java.util.List;

@Local
public interface FachadaReferenciasEJBLocal {
    List<ReferenciasEntity> obtenerDominiosPorTipo(String strDominio);
    List<ReferenciasEntity> obtenerDominiosPorTipoProducto();
    List<ReferenciasEntity> obtenerDominiosPorTipoClave();
    List<ReferenciasEntity> obtenerDominiosPorTipoCuenta();
    List<ReferenciasEntity> obtenerDominiosPorTipoId();
    List<ReferenciasEntity> obtenerDominiosPorTipoEsActivo();
    ReferenciasEntity obtenerDominio( String strDominio, String strRangoValor);
    void persistirReferencias (ReferenciasEntity referenciasEntity);
    ReferenciasEntity actualizarReferencias (ReferenciasEntity referenciasEntity);
    void removerReferencias (ReferenciasEntity referenciasEntity);
}
