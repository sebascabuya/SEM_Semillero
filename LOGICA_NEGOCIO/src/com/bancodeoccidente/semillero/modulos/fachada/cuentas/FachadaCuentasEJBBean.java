package com.bancodeoccidente.semillero.modulos.fachada.cuentas;

import com.bancodeoccidente.semillero.modulos.entidades.CuentasEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.List;

import javax.persistence.PersistenceContext;

@Stateless
public class FachadaCuentasEJBBean implements FachadaCuentasEJBLocal {
    @PersistenceContext(unitName = "SEMILLERO_JPA")
    private EntityManager entityManager;

    @Override
    public List<CuentasEntity> obtenerCuentasTJDClientes(String strTipoProducto, String strEsActivo, String strTipoId, String strId) {
        return entityManager.createNamedQuery("CuentasEntity.findListAccountsTDJByTypeIdAndIdClient").setParameter("strTipoProducto", strTipoProducto).setParameter("strEsActivo", strEsActivo).setParameter("strTipoId", strTipoId).setParameter("strId", strId).getResultList();
    }

    @Override
    public CuentasEntity obtenerCuentas(String strNumeroCuenta) {
        return (CuentasEntity)entityManager.createNamedQuery("CuentasEntity.findByAccountNumber").setParameter("strNumeroCuenta", strNumeroCuenta).getSingleResult();
    }

    @Override
    public void persistirCuentas(CuentasEntity cuentasEntity) {
        entityManager.persist(cuentasEntity);
    }

    @Override
    public CuentasEntity actualizarCuentas(CuentasEntity cuentasEntity) {
        return entityManager.merge(cuentasEntity);
    }

    @Override
    public void removerCuentas(CuentasEntity cuentasEntity) {
        entityManager.remove(cuentasEntity);
    }
}
