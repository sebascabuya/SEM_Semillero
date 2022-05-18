package com.bancodeoccidente.semillero.modulos.fachada.productos;

import com.bancodeoccidente.semillero.modulos.entidades.ProductosEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import java.util.List;

import javax.persistence.PersistenceContext;

@Stateless
public class FachadaProductosEJBBean implements FachadaProductosEJBLocal{

    @PersistenceContext(unitName = "SEMILLERO_JPA")
    private EntityManager entityManager;

    @Override
    public List<ProductosEntity> obtenerProductosClientes(String strTipoId, String strId) {
        return entityManager.createNamedQuery("ProductosEntity.findListProductsByTypeIdAndIdClient").setParameter("strTipoId", strTipoId).setParameter("strId", strId).getResultList();
    }

    @Override
    public ProductosEntity obtenerProductos(String strNumeroProducto) {
        return (ProductosEntity)entityManager.createNamedQuery("ProductosEntity.findByProductNumber").setParameter("strNumeroProducto", strNumeroProducto).getSingleResult();
    }

    @Override
    public void persistirProductos(ProductosEntity productosEntity) {
        entityManager.persist(productosEntity);
    }

    @Override
    public ProductosEntity actualizarProductos(ProductosEntity productosEntity) {
        return entityManager.merge(productosEntity);
    }

    @Override
    public void removerProductos(ProductosEntity productosEntity) {
        entityManager.remove(productosEntity);
    }
}
