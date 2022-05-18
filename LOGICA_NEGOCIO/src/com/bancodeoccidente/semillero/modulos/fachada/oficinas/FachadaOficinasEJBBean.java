package com.bancodeoccidente.semillero.modulos.fachada.oficinas;

import com.bancodeoccidente.semillero.modulos.entidades.OficinasEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

@Stateless
public class FachadaOficinasEJBBean implements FachadaOficinasEJBLocal {
    @PersistenceContext(unitName = "SEMILLERO_JPA")
    private EntityManager entityManager;

    @Override
    public OficinasEntity obtenerOficinas(String strCodigoOficina) {
        return (OficinasEntity)entityManager.createNamedQuery("OficinasEntity.findByCode").setParameter("strCodigoOficina", strCodigoOficina).getSingleResult();
    }

    @Override
    public void persistirOficinas(OficinasEntity oficinasEntity) {
        entityManager.persist(oficinasEntity);
    }

    @Override
    public OficinasEntity actualizarOficinas(OficinasEntity oficinasEntity) {
        return entityManager.merge(oficinasEntity);
    }

    @Override
    public void removerOficinas(OficinasEntity oficinasEntity) {
        entityManager.remove(oficinasEntity);
    }
}
