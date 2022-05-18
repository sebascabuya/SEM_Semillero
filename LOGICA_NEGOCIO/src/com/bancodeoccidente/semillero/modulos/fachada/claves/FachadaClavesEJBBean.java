package com.bancodeoccidente.semillero.modulos.fachada.claves;

import com.bancodeoccidente.semillero.modulos.entidades.ClavesEntity;

import java.sql.RowId;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.List;

import javax.persistence.PersistenceContext;

import oracle.jbo.domain.RowID;

@Stateless
public class FachadaClavesEJBBean implements FachadaClavesEJBLocal {
    @PersistenceContext(unitName = "SEMILLERO_JPA")
    private EntityManager entityManager;


    @Override
    public ClavesEntity obtenerUltimaClaveProducto(String strNumeroProducto) {
        return (ClavesEntity)entityManager.createNamedQuery("ClavesEntity.findLastPasswordByProductNumber").setParameter("strNumeroProducto", strNumeroProducto).setMaxResults(1).getSingleResult();
    }

    @Override
    public List<ClavesEntity> obtenerListaClavesProductos(String strNumeroProducto) {
        return entityManager.createNamedQuery("ClavesEntity.findListLastPasswordsByProductNumber").setParameter("strNumeroProducto", strNumeroProducto).getResultList();
    }

    @Override
    public ClavesEntity obtenerClaves(String strNumeroProducto, Integer numClaveProducto) {
        return (ClavesEntity)entityManager.createNamedQuery("ClavesEntity.findByProductNumber").setParameter("strNumeroProducto", strNumeroProducto).setParameter("numClaveProducto", numClaveProducto).getSingleResult();
    }

    @Override
    public void persistirClaves(ClavesEntity clavesEntity) {
        entityManager.persist(clavesEntity);
    }

    @Override
    public ClavesEntity actualizarClaves(ClavesEntity clavesEntity) {
        return entityManager.merge(clavesEntity);
    }

    @Override
    public void removerClaves(ClavesEntity clavesEntity) {
        entityManager.remove(clavesEntity);
    }
}
