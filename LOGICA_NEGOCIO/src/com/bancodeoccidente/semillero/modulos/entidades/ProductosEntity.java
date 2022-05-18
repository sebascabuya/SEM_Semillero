package com.bancodeoccidente.semillero.modulos.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBL_PRODUCTOS")
@NamedQueries({@NamedQuery(name="ProductosEntity.findListProductsByTypeIdAndIdClient",
                            query = "SELECT p FROM ProductosEntity p " +
                                    "WHERE p.clientesEntity.referenciasTipoId.strTipoIdFk = :strTipoId " +
                                    "AND p.clientesEntity.strId = :strId"),
               @NamedQuery(name="ProductosEntity.findByProductNumber",
                            query = "SELECT p FROM ProductosEntity p " +
                                    "WHERE p.strNumeroProducto = :strNumeroProducto")})
public class ProductosEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "idProductosGenerator", sequenceName = "SEQ_PRODUCTOS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idProductosGenerator")
    @Column(name = "NUM_CODIGO_PRODUCTO")
    private int numCodigoProducto;
    @Column(name = "STR_NUMERO_PRODUCTO")
    private String strNumeroProducto;
    @JoinColumn(name = "STR_TIPO_PRODUCTO", referencedColumnName = "STR_TIPO_PRODUCTO_FK")
    @ManyToOne
    private ReferenciasEntity referenciasTipoProducto;
    @JoinColumn(name = "STR_ES_ACTIVO", referencedColumnName = "STR_ES_ACTIVO_FK")
    @ManyToOne
    private ReferenciasEntity referenciasEsActivo;
    @Column(name = "DTM_FECHA_CREACION_PRODUCTO")
    @Temporal(TemporalType.DATE)
    private Date dtmFechaCreacionProducto;
    @Column(name = "DTM_FECHA_VENCIMIENTO_PRODUCTO")
    @Temporal(TemporalType.DATE)
    private Date dtmFechaVencimientoProducto;
    @Column(name = "NUM_CANTIDAD_INTENTOS_FALLIDOS")
    private int numCantidadIntentosFallidos;
    @JoinColumn(name = "NUM_CODIGO_CLIENTE", referencedColumnName = "NUM_CODIGO_CLIENTE")
    @ManyToOne
    private ClientesEntity clientesEntity;
    @JoinColumn(name = "NUM_ID_OFICINA", referencedColumnName = "NUM_ID_OFICINA")
    @ManyToOne
    private OficinasEntity oficinasEntity;

    public ProductosEntity() {
    }

    public ProductosEntity(int numCodigoProducto, String strNumeroProducto, ReferenciasEntity referenciasTipoProducto, ReferenciasEntity referenciasEsActivo, Date dtmFechaCreacionProducto, Date dtmFechaVencimientoProducto, int numCantidadIntentosFallidos, ClientesEntity clientesEntity, OficinasEntity oficinasEntity) {
        this.numCodigoProducto = numCodigoProducto;
        this.strNumeroProducto = strNumeroProducto;
        this.referenciasTipoProducto = referenciasTipoProducto;
        this.referenciasEsActivo = referenciasEsActivo;
        this.dtmFechaCreacionProducto = dtmFechaCreacionProducto;
        this.dtmFechaVencimientoProducto = dtmFechaVencimientoProducto;
        this.numCantidadIntentosFallidos = numCantidadIntentosFallidos;
        this.clientesEntity = clientesEntity;
        this.oficinasEntity = oficinasEntity;
    }

    public int getNumCodigoProducto() {
        return numCodigoProducto;
    }

    public void setNumCodigoProducto(int numCodigoProducto) {
        this.numCodigoProducto = numCodigoProducto;
    }

    public String getStrNumeroProducto() {
        return strNumeroProducto;
    }

    public void setStrNumeroProducto(String strNumeroProducto) {
        this.strNumeroProducto = strNumeroProducto;
    }

    public ReferenciasEntity getReferenciasTipoProducto() {
        return referenciasTipoProducto;
    }

    public void setReferenciasTipoProducto(ReferenciasEntity referenciasTipoProducto) {
        this.referenciasTipoProducto = referenciasTipoProducto;
    }

    public ReferenciasEntity getReferenciasEsActivo() {
        return referenciasEsActivo;
    }

    public void setReferenciasEsActivo(ReferenciasEntity referenciasEsActivo) {
        this.referenciasEsActivo = referenciasEsActivo;
    }

    public Date getDtmFechaCreacionProducto() {
        return dtmFechaCreacionProducto;
    }

    public void setDtmFechaCreacionProducto(Date dtmFechaCreacionProducto) {
        this.dtmFechaCreacionProducto = dtmFechaCreacionProducto;
    }

    public Date getDtmFechaVencimientoProducto() {
        return dtmFechaVencimientoProducto;
    }

    public void setDtmFechaVencimientoProducto(Date dtmFechaVencimientoProducto) {
        this.dtmFechaVencimientoProducto = dtmFechaVencimientoProducto;
    }

    public int getNumCantidadIntentosFallidos() {
        return numCantidadIntentosFallidos;
    }

    public void setNumCantidadIntentosFallidos(int numCantidadIntentosFallidos) {
        this.numCantidadIntentosFallidos = numCantidadIntentosFallidos;
    }

    public ClientesEntity getClientesEntity() {
        return clientesEntity;
    }

    public void setClientesEntity(ClientesEntity clientesEntity) {
        this.clientesEntity = clientesEntity;
    }

    public OficinasEntity getOficinasEntity() {
        return oficinasEntity;
    }

    public void setOficinasEntity(OficinasEntity oficinasEntity) {
        this.oficinasEntity = oficinasEntity;
    }
}
