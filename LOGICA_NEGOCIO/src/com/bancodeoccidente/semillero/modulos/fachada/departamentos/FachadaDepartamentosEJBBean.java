package com.bancodeoccidente.semillero.modulos.fachada.departamentos;

import com.bancodeoccidente.semillero.modulos.entidades.CiudadesEntity;
import com.bancodeoccidente.semillero.modulos.entidades.DepartamentosEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

@Stateless
public class FachadaDepartamentosEJBBean implements FachadaDepartamentosEJBLocal {
    @PersistenceContext(unitName = "SEMILLERO_JPA")
    private EntityManager entityManager;


    @Override
    public DepartamentosEntity obtenerDepartamentos(String strCodigoDaneDepartamento) {
        return (DepartamentosEntity)entityManager.createNamedQuery("DepartamentosEntity.findByDaneCode").setParameter("strCodigoDaneDepartamento", strCodigoDaneDepartamento).getSingleResult();
    }

    @Override
    public void persistirDepartamentos(DepartamentosEntity departamentosEntity) {
        entityManager.persist(departamentosEntity);
    }

    @Override
    public DepartamentosEntity actualizarDepartamentos(DepartamentosEntity departamentosEntity) {
        return entityManager.merge(departamentosEntity);
    }

    @Override
    public void removerDepartamentos(DepartamentosEntity departamentosEntity) {
        entityManager.remove(departamentosEntity);
    }

    @Override
    public DepartamentosEntity obtenerUnDepartamento(String strCodigoDaneDepartamento) {
        return (DepartamentosEntity)entityManager.createNamedQuery("DepartamentosEntity.findByDaneCode").setParameter("strCodigoDaneDepartamento", strCodigoDaneDepartamento).getSingleResult();
    }
}
