package com.bancodeoccidente.semillero.modulos.fachada.clavesinvalidas;

import com.bancodeoccidente.semillero.modulos.entidades.ClavesInvalidasEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.List;

import javax.persistence.PersistenceContext;

@Stateless
public class FachadaClavesInvalidasEJBBean implements FachadaClavesInvalidasEJBLocal {
    @PersistenceContext(unitName = "SEMILLERO_JPA")
    private EntityManager entityManager;

    @Override
    public List<ClavesInvalidasEntity> obtenerClavesInvalidasProducto(String strNumeroProducto) {
        return entityManager.createNamedQuery("ClavesInvalidasEntity.findListPasswordsByProductoNumber").setParameter("strNumeroProducto", strNumeroProducto).getResultList();
    }

    @Override
    public ClavesInvalidasEntity obtenerClavesInvalidas(String strNumeroProducto, Integer numClaveInvalida) {
        return (ClavesInvalidasEntity)entityManager.createNamedQuery("ClavesInvalidasEntity.findByProductNumberAndPassword").setParameter("strNumeroProducto", strNumeroProducto).setParameter("numClaveInvalida", numClaveInvalida).getSingleResult();
    }

    @Override
    public void persistirClavesInvalidas(ClavesInvalidasEntity clavesInvalidasEntity) {
        entityManager.persist(clavesInvalidasEntity);
    }

    @Override
    public ClavesInvalidasEntity actualizarClavesInvalidas(ClavesInvalidasEntity clavesInvalidasEntity) {
        return entityManager.merge(clavesInvalidasEntity);
    }

    @Override
    public void removerClavesInvalidas(ClavesInvalidasEntity clavesInvalidasEntity) {
        entityManager.remove(clavesInvalidasEntity);
    }
}
