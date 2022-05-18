package com.bancodeoccidente.semillero.modulos.fachada.ciudades;

import com.bancodeoccidente.semillero.modulos.entidades.CiudadesEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

@Stateless
public class FachadaCiudadesEJBBean implements FachadaCiudadesEJBLocal {
    
    @PersistenceContext(unitName = "SEMILLERO_JPA")
    private EntityManager entityManager;
    
    @Override
    public CiudadesEntity obtenerCiudades(String strCodigoDaneCiudad) {
        return (CiudadesEntity)entityManager.createNamedQuery("CiudadesEntity.findByDaneCode").setParameter("strCodigoDaneCiudad", strCodigoDaneCiudad).getSingleResult();
    }

    @Override
    public void persistirCiudades(CiudadesEntity ciudadesEntity) {
        entityManager.persist(ciudadesEntity);
    }

    @Override
    public CiudadesEntity actualizarCuidades(CiudadesEntity ciudadesEntity) {
        return entityManager.merge(ciudadesEntity);
    }

    @Override
    public void removerCiudades(CiudadesEntity ciudadesEntity) {
        entityManager.remove(ciudadesEntity);
    }
}
