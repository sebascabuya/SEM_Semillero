package com.bancodeoccidente.semillero.modulos.fachada.cuentas;

import com.bancodeoccidente.semillero.modulos.entidades.CuentasEntity;

import com.bancodeoccidente.semillero.modulos.entidades.ProductosEntity;

import javax.ejb.Local;
import java.util.List;

@Local
public interface FachadaCuentasEJBLocal {
    List<CuentasEntity> obtenerCuentasTJDClientes (String strTipoProducto, String strEsActivo, String strTipoId, String strId);
    CuentasEntity obtenerCuentas (String strNumeroCuenta);
    void persistirCuentas (CuentasEntity cuentasEntity);
    CuentasEntity actualizarCuentas (CuentasEntity cuentasEntity);
    void removerCuentas (CuentasEntity cuentasEntity);
}
