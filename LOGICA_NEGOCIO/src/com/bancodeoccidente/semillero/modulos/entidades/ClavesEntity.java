package com.bancodeoccidente.semillero.modulos.entidades;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBL_CLAVES")
@NamedQueries({@NamedQuery(name="ClavesEntity.findLastPasswordByProductNumber",
                            query = "SELECT c FROM ClavesEntity c " +
                                    "WHERE c.productosEntity.strNumeroProducto = :strNumeroProducto " +
                                    "ORDER BY c.dtmFechaCreacion DESC"),
                @NamedQuery(name="ClavesEntity.findListLastPasswordsByProductNumber",
                        query = "SELECT c FROM ClavesEntity c " +
                                "WHERE c.productosEntity.strNumeroProducto = :strNumeroProducto " +
                                "ORDER BY c.dtmFechaCreacion ASC"),
                @NamedQuery(name="ClavesEntity.findByProductNumber",
                        query = "SELECT c FROM ClavesEntity c " +
                                "WHERE c.productosEntity.strNumeroProducto = :strNumeroProducto " +
                                "AND c.numClaveProducto = :numClaveProducto")})
public class ClavesEntity{
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "idClavesGenerator", sequenceName = "SEQ_CLAVES", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idClavesGenerator")
    @Column(name = "NUM_CODIGO_CLAVE")
    private Long numCodigoClave;
    @JoinColumn(name = "STR_TIPO_CLAVE", referencedColumnName = "STR_TIPO_CLAVE_FK")
    @ManyToOne
    private ReferenciasEntity referenciasTipoClave;
    @Column(name = "NUM_CLAVE_PRODUCTO")
    private int numClaveProducto;
    @Column(name = "DTM_FECHA_CREACION_CLAVE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmFechaCreacion;
    @JoinColumn(name = "NUM_CODIGO_PRODUCTO", referencedColumnName = "NUM_CODIGO_PRODUCTO")
    @ManyToOne
    private ProductosEntity productosEntity;

    public ClavesEntity() {
    }

    public ClavesEntity(Long numCodigoClave, ReferenciasEntity referenciasTipoClave, int numClaveProducto, Date dtmFechaCreacion, ProductosEntity productosEntity) {
        this.numCodigoClave = numCodigoClave;
        this.referenciasTipoClave = referenciasTipoClave;
        this.numClaveProducto = numClaveProducto;
        this.dtmFechaCreacion = dtmFechaCreacion;
        this.productosEntity = productosEntity;
    }

    public Long getNumCodigoClave() {
        return numCodigoClave;
    }

    public void setNumCodigoClave(Long numCodigoClave) {
        this.numCodigoClave = numCodigoClave;
    }

    public ReferenciasEntity getReferenciasTipoClave() {
        return referenciasTipoClave;
    }

    public void setReferenciasTipoClave(ReferenciasEntity referenciasTipoClave) {
        this.referenciasTipoClave = referenciasTipoClave;
    }

    public int getNumClaveProducto() {
        return numClaveProducto;
    }

    public void setNumClaveProducto(int numClaveProducto) {
        this.numClaveProducto = numClaveProducto;
    }

    public Date getDtmFechaCreacion() {
        return dtmFechaCreacion;
    }

    public void setDtmFechaCreacion(Date dtmFechaCreacion) {
        this.dtmFechaCreacion = dtmFechaCreacion;
    }

    public ProductosEntity getProductosEntity() {
        return productosEntity;
    }

    public void setProductosEntity(ProductosEntity productosEntity) {
        this.productosEntity = productosEntity;
    }
}