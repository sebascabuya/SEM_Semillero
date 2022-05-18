package com.bancodeoccidente.semillero.modulos.fachada.clientes;

import com.bancodeoccidente.semillero.modulos.entidades.ClientesEntity;
import com.bancodeoccidente.semillero.modulos.entidades.OficinasEntity;

import javax.ejb.Local;
import java.util.List;

@Local
public interface FachadaClientesEJBLocal {
    ClientesEntity obtenerClientes(String strTipoIdFk, String strId);
    void persistirClientes (ClientesEntity clientesEntity);
    ClientesEntity actualizarClientes(ClientesEntity clientesEntity);
    void removerClientes(ClientesEntity clientesEntity);
}
