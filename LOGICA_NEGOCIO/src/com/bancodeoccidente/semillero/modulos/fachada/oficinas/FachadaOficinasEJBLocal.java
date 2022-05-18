package com.bancodeoccidente.semillero.modulos.fachada.oficinas;

import com.bancodeoccidente.semillero.modulos.entidades.OficinasEntity;

import javax.ejb.Local;

@Local
public interface FachadaOficinasEJBLocal {
    OficinasEntity obtenerOficinas(String strCodigoOficina);
    void persistirOficinas (OficinasEntity oficinasEntity);
    OficinasEntity actualizarOficinas(OficinasEntity oficinasEntity);
    void removerOficinas(OficinasEntity oficinasEntity);
}
