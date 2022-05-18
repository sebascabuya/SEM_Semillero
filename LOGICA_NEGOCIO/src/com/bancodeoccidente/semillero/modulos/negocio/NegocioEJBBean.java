package com.bancodeoccidente.semillero.modulos.negocio;


import com.bancodeoccidente.semillero.modulos.entidades.CiudadesEntity;
import com.bancodeoccidente.semillero.modulos.entidades.ClavesEntity;
import com.bancodeoccidente.semillero.modulos.entidades.ClavesInvalidasEntity;
import com.bancodeoccidente.semillero.modulos.entidades.ClientesEntity;
import com.bancodeoccidente.semillero.modulos.entidades.CuentasEntity;
import com.bancodeoccidente.semillero.modulos.entidades.DepartamentosEntity;
import com.bancodeoccidente.semillero.modulos.entidades.OficinasEntity;
import com.bancodeoccidente.semillero.modulos.entidades.ProductosEntity;
import com.bancodeoccidente.semillero.modulos.entidades.ReferenciasEntity;
import com.bancodeoccidente.semillero.modulos.fachada.ciudades.FachadaCiudadesEJBLocal;
import com.bancodeoccidente.semillero.modulos.fachada.claves.FachadaClavesEJBLocal;
import com.bancodeoccidente.semillero.modulos.fachada.clavesinvalidas.FachadaClavesInvalidasEJBLocal;
import com.bancodeoccidente.semillero.modulos.fachada.clientes.FachadaClientesEJBLocal;
import com.bancodeoccidente.semillero.modulos.fachada.cuentas.FachadaCuentasEJBLocal;
import com.bancodeoccidente.semillero.modulos.fachada.departamentos.FachadaDepartamentosEJBLocal;
import com.bancodeoccidente.semillero.modulos.fachada.oficinas.FachadaOficinasEJBLocal;
import com.bancodeoccidente.semillero.modulos.fachada.productos.FachadaProductosEJBLocal;
import com.bancodeoccidente.semillero.modulos.fachada.referencias.FachadaReferenciasEJBLocal;

import java.text.SimpleDateFormat;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Stateless;


@Stateless(name = "NegocioEJB", mappedName = "SEM_Semillero-LOGICA_NEGOCIO-NegocioEJB")
public class NegocioEJBBean implements NegocioEJBLocal {
    
    private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(NegocioEJBBean.class);

    @EJB
    FachadaReferenciasEJBLocal referenciassEJB;
    @EJB
    FachadaDepartamentosEJBLocal departamentosEJB;
    @EJB
    FachadaCiudadesEJBLocal ciudadesEJB;
    @EJB
    FachadaOficinasEJBLocal oficinasEJB;
    @EJB
    FachadaClientesEJBLocal clientesEJB;    
    @EJB
    FachadaProductosEJBLocal productosEJB;
    @EJB
    FachadaCuentasEJBLocal cuentasEJB;
    @EJB
    FachadaClavesEJBLocal clavesEJB;
    @EJB
    FachadaClavesInvalidasEJBLocal clavesInvalidasEJB;  
    
    public NegocioEJBBean() {
    }

    @Override
    public void ejecutarNegocio() {
        /* -------Ejercicios Consultas-------*/ 
        /*List<ProductosEntity> listaProductos;
        listaProductos = productosEJB.obtenerProductosClientes("CE", "1007895426");
        for (ProductosEntity producto : listaProductos){
            LOGGER.debug(producto.getNumCodigoProducto());  
        }
        
        List<ClavesInvalidasEntity> listaClavesInvalidas;
        listaClavesInvalidas = clavesInvalidasEJB.obtenerClavesInvalidasProducto("1458746932586475");
        for (ClavesInvalidasEntity clavesInvalidas : listaClavesInvalidas){
            LOGGER.debug("Clave invalida: " + clavesInvalidas.getNumClaveInvalida());  
        }
        
        ClavesEntity lastPassword;
        lastPassword = clavesEJB.obtenerUltimaClaveProducto("1458746932586475");
        LOGGER.debug("Ultima clave producto: " + lastPassword.getNumClaveProducto());  
   
        List<ClavesEntity> listaClaves;
        listaClaves = clavesEJB.obtenerListaClavesProductos("1458746932586475");
        for (ClavesEntity claves : listaClaves){
            LOGGER.debug("Clave: " + claves.getNumClaveProducto());  
        }
        
        List<CuentasEntity> listaCuentas;
        listaCuentas = cuentasEJB.obtenerCuentasTJDClientes("TJD", "Y", "CC", "1005896725");
        for (CuentasEntity claves : listaCuentas){
            LOGGER.debug("Numero cuenta: " + claves.getStrNumeroCuenta());  
        }
        
        List<ReferenciasEntity> listaDominios;
        listaDominios = referenciasEJB.obtenerDominiosPorTipo("DOM_TIPOS_PRODUCTO");
        for (ReferenciasEntity dominios : listaDominios){
            LOGGER.debug("Dominios: " + dominios.getStrTipoProductoFk());  
        }
        */  
        
        /* -------Ejercicios Persistencia-------*/
        /* -------Tabla Referencias-------*/ 
        ReferenciasEntity referenciasEntity = new ReferenciasEntity();
        /* --------Ingreso datos--------*/ /*
        referenciasEntity.setStrDominio("DOM_ES_ACTIVO");
        referenciasEntity.setStrRangoValor("I");
        referenciasEntity.setStrDescripcion("Es Inactivo");
        try {
            referenciassEJB.persistirReferencias(referenciasEntity);
            LOGGER.info("Se ha insertado un nuevo dominio");
            LOGGER.info("Dominio: " + referenciasEntity.getStrDominio() + ", Valor: " + referenciasEntity.getStrRangoValor() + ", Descripcion: " + referenciasEntity.getStrDescripcion());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al insertar el dominio: " + exception.getMessage());
        } */
        /* --------Actualización datos--------*/ /*
        try {
            referenciasEntity = referenciassEJB.obtenerDominio("DOM_ES_ACTIVO", "I");
            referenciasEntity.setStrRangoValor("T");
            referenciasEntity.setStrDescripcion("Es Truncable");
            referenciassEJB.actualizarReferencias(referenciasEntity);
            LOGGER.info("Se ha actualizado el dominio: " + referenciasEntity.getStrDominio() + ", con un nuevo valor: " + referenciasEntity.getStrRangoValor() + ", que es " + referenciasEntity.getStrDescripcion());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al actualizar el dominio: " + exception);
        } */
        /* --------Remover datos--------*/ /*
        try {
            referenciasEntity = referenciassEJB.obtenerDominio("DOM_ES_ACTIVO", "T");
            referenciassEJB.removerReferencias(referenciasEntity);
            LOGGER.info("Se ha removido el dominio: " + referenciasEntity.getStrDominio() + ", con valor: " + referenciasEntity.getStrRangoValor() + ", que era " + referenciasEntity.getStrDescripcion());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al remover el dominio: " + exception);
        } */
        /* -------Tabla Departamentos-------*/ 
        DepartamentosEntity departamentosEntity = new DepartamentosEntity();
        /* --------Ingreso datos--------*/ /*
        departamentosEntity.setStrCodigoDaneDepartamento("13");
        departamentosEntity.setStrNombreDepartamento("Bolivar");
        try {
            departamentosEJB.persistirDepartamentos(departamentosEntity);
            LOGGER.info("Se ha insertado un nuevo departamento");
            LOGGER.info("Departamento: " + departamentosEntity.getStrNombreDepartamento() + ", Codigo Dane: " + departamentosEntity.getStrCodigoDaneDepartamento());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al insertar el departamento: " + exception.getMessage());
        } */
        /* --------Actualización datos--------*/ /*
        try {
            departamentosEntity = departamentosEJB.obtenerDepartamentos("11");
            departamentosEntity.setStrNombreDepartamento("Bogota");
            departamentosEJB.actualizarDepartamentos(departamentosEntity);
            LOGGER.info("Se ha actualizado el departamento con Codigo Dane: " + departamentosEntity.getStrCodigoDaneDepartamento());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al actualizar el departamento: " + exception);
        } */
        /* --------Remover datos--------*/ /*
        try {
            departamentosEntity = departamentosEJB.obtenerDepartamentos("13");
            departamentosEJB.removerDepartamentos(departamentosEntity);
            LOGGER.info("Se ha removido el departamento: " + departamentosEntity.getStrNombreDepartamento() + ", con Codigo Dane: " + departamentosEntity.getStrCodigoDaneDepartamento());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al remover el departamento: " + exception);
        } */
        /* -------Tabla Referencias-------*/ 
        CiudadesEntity ciudadesEntity = new CiudadesEntity();
        /* --------Ingreso datos--------*/ /*
        cuidadesEntity.setStrCodigoDaneCiudad("042");
        cuidadesEntity.setStrNombreCiudad("Santa Fe de Antioquia");
        cuidadesEntity.setDepartamentosEntity(departamentosEJB.obtenerDepartamentos("11"));
        try {
            ciudadesEJB.persistirCiudades(cuidadesEntity);
            LOGGER.info("Se ha insertado una nueva cuidad");
            LOGGER.info("Ciudad: " + cuidadesEntity.getStrNombreCiudad() + ", Codigo Dane: " + cuidadesEntity.getStrCodigoDaneCiudad());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al insertar la cuidad: " + exception.getMessage());
        } */
        /* --------Actualización datos--------*/ /*
        try {
            cuidadesEntity = ciudadesEJB.obtenerCiudades("042");
            cuidadesEntity.setDepartamentosEntity(departamentosEJB.obtenerDepartamentos("05"));
            ciudadesEJB.actualizarCuidades(cuidadesEntity);
            LOGGER.info("Se ha actualizado la ciudad con Codigo Dane: " + cuidadesEntity.getStrCodigoDaneCiudad());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al actualizar la ciudad: " + exception);
        } */
        /* --------Remover datos--------*/ /*
        try {
            ciudadesEntity = ciudadesEJB.obtenerCiudades("042");
            ciudadesEJB.removerCiudades(ciudadesEntity);
            LOGGER.info("Se ha removido la cuidad: " + ciudadesEntity.getStrNombreCiudad() + ", con Codigo Dane: " + ciudadesEntity.getStrCodigoDaneCiudad());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al remover la cuidad: " + exception);
        } */
        /* -------Tabla Oficinas-------*/ 
        OficinasEntity oficinasEntity = new OficinasEntity();
        /* --------Ingreso datos--------*/ /*
        oficinasEntity.setStrCodigoOficina("657");
        oficinasEntity.setStrNombreOficina("Choco");
        oficinasEntity.setStrDireccionOficina("CLL 92 # 34-56");
        oficinasEntity.setCiudadesEntity(ciudadesEJB.obtenerCiudades("11001"));
        try {
            oficinasEJB.persistirOficinas(oficinasEntity);
            LOGGER.info("Se ha insertado una nuevo oficina");
            LOGGER.info("Oficina: " + oficinasEntity.getStrNombreOficina() + " Codigo Oficina: " + oficinasEntity.getStrCodigoOficina() +  ", Direccion: " + oficinasEntity.getStrDireccionOficina());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al insertar la oficina: " + exception.getMessage());
        } */
        /* --------Actualización datos--------*/ /*
        try {
            oficinasEntity = oficinasEJB.obtenerOficinas("456");
            oficinasEntity.setStrDireccionOficina("CLL 35 #67-76");
            oficinasEJB.actualizarOficinas(oficinasEntity);
            LOGGER.info("Se ha actualizado la oficina con Codigo: " + oficinasEntity.getStrCodigoOficina());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al actualizar la oficina: " + exception);
        } */
        /* --------Remover datos--------*/ /*
        try {
            oficinasEntity = oficinasEJB.obtenerOficinas("657");
            oficinasEJB.removerOficinas(oficinasEntity);
            LOGGER.info("Se ha removido la oficina: " + oficinasEntity.getStrNombreOficina() + ", con Codigo: " + oficinasEntity.getStrCodigoOficina());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al remover la oficina: " + exception);
        } */
        /* -------Tabla Clientes-------*/ 
        ClientesEntity clientesEntity = new ClientesEntity();
        /* --------Ingreso datos--------*/ /*
        try {
            clientesEntity.setStrNombreCompleto("Felipe Calamaro");
            clientesEntity.setStrId("1005678782");
            String fechaNacimientoString = "12-07-2010";
            SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaNacimiento = sdt.parse(fechaNacimientoString); 
            clientesEntity.setDtmFechaNacimiento(fechaNacimiento);
            clientesEntity.setReferenciasTipoId(referenciassEJB.obtenerDominio("DOM_TIPOS_ID", "TI"));
            clientesEJB.persistirClientes(clientesEntity);
            LOGGER.info("Se ha insertado un nuevo cliente");
            LOGGER.info("Clientes: " + clientesEntity.getStrNombreCompleto() + ", Tipo Id: " + clientesEntity.getReferenciasTipoId().getStrTipoIdFk() +  ", Numero Id: " + clientesEntity.getStrId() + ", Fecha de Nacimiento: " + clientesEntity.getDtmFechaNacimiento());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al insertar el cliente: " + exception.getMessage());
        } */
        /* --------Actualización datos--------*/ /*
        try {
            clientesEntity = clientesEJB.obtenerClientes("TI", "1005678935");
            clientesEntity.setStrNombreCompleto("David Rubio");
            clientesEntity = clientesEJB.actualizarClientes(clientesEntity);
            LOGGER.info("Se ha actualizado el cliente con Tipo Id: " + clientesEntity.getReferenciasTipoId().getStrTipoIdFk() + ", Num Id: " + clientesEntity.getStrId());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al actualizar el cliente: " + exception.getMessage());
        } */
        /* --------Remover datos--------*/ /*
        try {
            clientesEntity = clientesEJB.obtenerClientes("CC", "1006897258");
            clientesEJB.removerClientes(clientesEntity);
            LOGGER.info("Se ha removido el cliente: " + clientesEntity.getStrNombreCompleto() + ", con Tipo Id: " + clientesEntity.getReferenciasTipoId().getStrTipoIdFk() + ", Num Id: " + clientesEntity.getStrId());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al remover el cliente: " + exception);
        } */
        /* -------Tabla Productos-------*/ 
        ProductosEntity productosEntity = new ProductosEntity();
        /* --------Ingreso datos--------*/ /*
        try {
            productosEntity.setStrNumeroProducto("8547621594386215");
            productosEntity.setReferenciasTipoProducto(referenciassEJB.obtenerDominio("DOM_TIPOS_PRODUCTO", "CNB"));
            productosEntity.setReferenciasEsActivo(referenciassEJB.obtenerDominio("DOM_ES_ACTIVO", "Y"));
            String fechaCreacionString = "02-11-2021";
            SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacion = sdt.parse(fechaCreacionString);
            productosEntity.setDtmFechaCreacionProducto(fechaCreacion);
            String fechaVencimientoString = "02-11-2031";
            Date fechaVencimiento = sdt.parse(fechaVencimientoString);
            productosEntity.setDtmFechaVencimientoProducto(fechaVencimiento);
            productosEntity.setNumCantidadIntentosFallidos(2);
            productosEntity.setClientesEntity(clientesEJB.obtenerClientes("NT", "58946752"));
            productosEntity.setOficinasEntity(oficinasEJB.obtenerOficinas("789"));
            productosEJB.persistirProductos(productosEntity);
            LOGGER.info("Se ha insertado un nuevo producto");
            LOGGER.info("Producto: " + productosEntity.getReferenciasTipoProducto().getStrTipoProductoFk() +  ", Numero Producto: " + productosEntity.getNumCodigoProducto());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al insertar el producto: " + exception);
        } */
        /* --------Actualización datos--------*/ /*
        try {
            productosEntity = productosEJB.obtenerProductos("8567945862415987");
            productosEntity.setReferenciasEsActivo(referenciassEJB.obtenerDominio("DOM_ES_ACTIVO", "N"));
            productosEntity.setNumCantidadIntentosFallidos(6);
            productosEJB.actualizarProductos(productosEntity);
            LOGGER.info("Se ha actualizado el producto de numero: " + productosEntity.getStrNumeroProducto());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al actualizar el producto: " + exception.getMessage());
        } */
        /* --------Remover datos--------*/ /*
        try {
            productosEntity = productosEJB.obtenerProductos("8547621594386215");
            productosEJB.removerProductos(productosEntity);
            LOGGER.info("Se ha removido el producto de numero: " + productosEntity.getStrNumeroProducto());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al remover el producto: " + exception);
        } */
        /* -------Tabla Cuentas-------*/ 
        CuentasEntity cuentasEntity = new CuentasEntity();
        /* --------Ingreso datos--------*/ /*
        try {
            cuentasEntity.setStrNumeroCuenta("247895356");
            cuentasEntity.setReferenciasTipoCuenta(referenciassEJB.obtenerDominio("DOM_TIPOS_CUENTA", "CTE"));
            cuentasEntity.setProductosEntity(productosEJB.obtenerProductos("1458746932586475"));
            cuentasEJB.persistirCuentas(cuentasEntity);
            LOGGER.info("Se ha insertado un nueva cuenta");
            LOGGER.info("Cuenta: " + cuentasEntity.getReferenciasTipoCuenta().getStrTipoCuentaFk() +  ", Numero Cuenta: " + cuentasEntity.getStrNumeroCuenta());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al insertar la cuenta: " + exception);
        } */
        /* --------Actualización datos--------*/ /* 
        try {
            cuentasEntity = cuentasEJB.obtenerCuentas("867954236");
            cuentasEntity.setReferenciasTipoCuenta(referenciassEJB.obtenerDominio("DOM_TIPOS_CUENTA", "CTE"));
            cuentasEJB.actualizarCuentas(cuentasEntity);
            LOGGER.info("Se ha actualizado la cuenta de numero: " + cuentasEntity.getStrNumeroCuenta());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al actualizar la cuenta: " + exception.getMessage());
        } */
        /* --------Remover datos--------*/ /*
        try {
            cuentasEntity = cuentasEJB.obtenerCuentas("247895356");
            cuentasEJB.removerCuentas(cuentasEntity);
            LOGGER.info("Se ha removido la cuenta de numero: " + cuentasEntity.getStrNumeroCuenta());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al remover la cuenta: " + exception);
        } */
        /* -------Tabla Claves-------*/ 
        ClavesEntity clavesEntity = new ClavesEntity();
        /* --------Ingreso datos--------*/ /*
        try {
            clavesEntity.setReferenciasTipoClave(referenciassEJB.obtenerDominio("DOM_TIPOS_CLAVE", "TT"));
            clavesEntity.setNumClaveProducto(8457);
            String fechaCreacionClaveString = "01-12-2018";
            SimpleDateFormat sdt = new SimpleDateFormat("dd-MM-yyyy");
            Date fechaCreacionClave = sdt.parse(fechaCreacionClaveString);
            clavesEntity.setDtmFechaCreacion(fechaCreacionClave);
            clavesEntity.setProductosEntity(productosEJB.obtenerProductos("6542387415863474"));
            clavesEJB.persistirClaves(clavesEntity);
            LOGGER.info("Se ha insertado un nueva clave para el producto: " + clavesEntity.getProductosEntity().getStrNumeroProducto());
            LOGGER.info("Tipo clave: " + clavesEntity.getReferenciasTipoClave().getStrTipoClaveFk() +  ", Numero Clave: " + clavesEntity.getNumClaveProducto());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al insertar la clave: " + exception);
        } */
        /* --------Actualización datos--------*/ /* 
        try {
            clavesEntity = clavesEJB.obtenerClaves("8567945862415987", 3456);
            clavesEntity.setNumClaveProducto(8275);
            clavesEJB.actualizarClaves(clavesEntity);
            LOGGER.info("Se ha actualizado la clave del producto: " + clavesEntity.getProductosEntity().getStrNumeroProducto());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al actualizar la clave: " + exception.getMessage());
        } */
        /* --------Remover datos--------*/ /*
        try {
            clavesEntity = clavesEJB.obtenerClaves("6542387415863474", 8457);
            clavesEJB.removerClaves(clavesEntity);
            LOGGER.info("Se ha removido la clave del producto: " + clavesEntity.getProductosEntity().getStrNumeroProducto());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al remover la clave: " + exception);
        } */
        /* -------Tabla Claves Invalidas-------*/ 
        ClavesInvalidasEntity clavesInvalidasEntity = new ClavesInvalidasEntity();
        /* --------Ingreso datos--------*/ /*
        try {
            clavesInvalidasEntity.setNumClaveInvalida(4444);
            clavesInvalidasEntity.setProductosEntity(productosEJB.obtenerProductos("1458746932586475"));
            clavesInvalidasEJB.persistirClavesInvalidas(clavesInvalidasEntity);
            LOGGER.info("Se ha insertado un nueva clave invalida para el producto: " + clavesInvalidasEntity.getProductosEntity().getStrNumeroProducto());
            LOGGER.info("Clave invalida: " + clavesInvalidasEntity.getNumClaveInvalida() + ", Producto Numero: " + clavesInvalidasEntity.getProductosEntity().getStrNumeroProducto());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al insertar la clave invalida: " + exception);
        } /*
        /* --------Actualización datos--------*/ /*
        try {
            clavesInvalidasEntity = clavesInvalidasEJB.obtenerClavesInvalidas("1458746932586475", 137);
            clavesInvalidasEntity.setNumClaveInvalida(8045);
            clavesInvalidasEJB.actualizarClavesInvalidas(clavesInvalidasEntity);
            LOGGER.info("Se ha actualizado la clave invalida del producto: " + clavesInvalidasEntity.getProductosEntity().getStrNumeroProducto());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al actualizar la clave invalida: " + exception.getMessage());
        } */
        /* --------Remover datos--------*/ /*
        try {
            clavesInvalidasEntity = clavesInvalidasEJB.obtenerClavesInvalidas("1458746932586475", 4444);
            clavesInvalidasEJB.removerClavesInvalidas(clavesInvalidasEntity);
            LOGGER.info("Se ha removido la clave invalida del producto: " + clavesInvalidasEntity.getProductosEntity().getStrNumeroProducto());
        } catch (Exception exception) {
            LOGGER.fatal("Ha ocurrido la siguiente excepción al remover la clave invalida: " + exception);
        } */
    }
}
