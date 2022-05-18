package com.bancodeoccidente.semillero.modulos.fachada.clientes;

import com.bancodeoccidente.semillero.modulos.entidades.ClientesEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.List;

import javax.persistence.PersistenceContext;

@Stateless
public class FachadaClientesEJBBean implements FachadaClientesEJBLocal {
    @PersistenceContext(unitName = "SEMILLERO_JPA")
    private EntityManager entityManager;


    @Override
    public ClientesEntity obtenerClientes(String strTipoIdFk, String strId) {
        return (ClientesEntity)entityManager.createNamedQuery("ClientesEntity.findById").setParameter("strTipoIdFk", strTipoIdFk).setParameter("strId", strId).getSingleResult();
    }

    @Override
    public void persistirClientes(ClientesEntity clientesEntity) {
        entityManager.persist(clientesEntity);
    }

    @Override
    public ClientesEntity actualizarClientes(ClientesEntity clientesEntity) {
        return entityManager.merge(clientesEntity);
    }

    @Override
    public void removerClientes(ClientesEntity clientesEntity) {
        entityManager.remove(clientesEntity);
    }
}
