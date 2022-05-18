package com.bancodeoccidente.semillero.modulos.fachada.productos;

import com.bancodeoccidente.semillero.modulos.entidades.ProductosEntity;

import javax.ejb.Local;
import java.util.List;

@Local
public interface FachadaProductosEJBLocal {
    List<ProductosEntity> obtenerProductosClientes (String strTipoId, String strId);
    ProductosEntity obtenerProductos (String strNumeroProducto);
    void persistirProductos (ProductosEntity productosEntity);
    ProductosEntity actualizarProductos (ProductosEntity productosEntity);
    void removerProductos (ProductosEntity productosEntity);
}