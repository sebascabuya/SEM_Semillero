package com.bancodeoccidente.semillero.modulos.fachada.referencias;

import com.bancodeoccidente.semillero.modulos.entidades.ReferenciasEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.List;

import javax.persistence.PersistenceContext;

@Stateless
public class FachadaReferenciasEJBBean implements FachadaReferenciasEJBLocal {
    @PersistenceContext(unitName = "SEMILLERO_JPA")
    private EntityManager entityManager;

    @Override
    public List<ReferenciasEntity> obtenerDominiosPorTipo(String strDominio) {
        return entityManager.createNamedQuery("ReferenciasEntity.findListDomainsByDomainType").setParameter("strDominio", strDominio).getResultList();
    }

    @Override
    public List<ReferenciasEntity> obtenerDominiosPorTipoProducto() {
        return entityManager.createNamedQuery("ReferenciasEntity.findListDomainsNotNullByProductType").getResultList();
    }

    @Override
    public List<ReferenciasEntity> obtenerDominiosPorTipoClave() {
        return entityManager.createNamedQuery("ReferenciasEntity.findListDomainsNotNullByPasswordType").getResultList();
    }

    @Override
    public List<ReferenciasEntity> obtenerDominiosPorTipoCuenta() {
        return entityManager.createNamedQuery("ReferenciasEntity.findListDomainsNotNullByAccountType").getResultList();
    }

    @Override
    public List<ReferenciasEntity> obtenerDominiosPorTipoId() {
        return entityManager.createNamedQuery("ReferenciasEntity.findListDomainsNotNullByIdType").getResultList();
    }

    @Override
    public List<ReferenciasEntity> obtenerDominiosPorTipoEsActivo() {
        return entityManager.createNamedQuery("ReferenciasEntity.findListDomainsNotNullByIsActiveType").getResultList();
    }

    @Override
    public ReferenciasEntity obtenerDominio(String strDominio, String strRangoValor) {
        return (ReferenciasEntity)entityManager.createNamedQuery("ReferenciasEntity.findByDomain").setParameter("strDominio", strDominio).setParameter("strRangoValor", strRangoValor).getSingleResult();
    }

    @Override
    public void persistirReferencias(ReferenciasEntity referenciasEntity) {
        entityManager.persist(referenciasEntity);
    }

    @Override
    public ReferenciasEntity actualizarReferencias(ReferenciasEntity referenciasEntity) {
        return entityManager.merge(referenciasEntity);
    }

    @Override
    public void removerReferencias(ReferenciasEntity referenciasEntity) {
        entityManager.remove(referenciasEntity);
    }
}
