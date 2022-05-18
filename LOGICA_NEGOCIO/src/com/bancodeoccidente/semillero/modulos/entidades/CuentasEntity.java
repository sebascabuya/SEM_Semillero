package com.bancodeoccidente.semillero.modulos.entidades;

import javax.persistence.*;

@Entity
@Table(name = "TBL_CUENTAS")
@NamedQueries({@NamedQuery(name="CuentasEntity.findListAccountsTDJByTypeIdAndIdClient",
                            query = "SELECT c FROM CuentasEntity c " +
                                    "WHERE c.productosEntity.referenciasTipoProducto.strTipoProductoFk = :strTipoProducto " +
                                    "AND c.productosEntity.referenciasEsActivo.strEsActivoFk = :strEsActivo " +
                                    "AND c.productosEntity.clientesEntity.referenciasTipoId.strTipoIdFk = :strTipoId " +
                                    "AND c.productosEntity.clientesEntity.strId = :strId"),
               @NamedQuery(name="CuentasEntity.findByAccountNumber",
                            query = "SELECT c FROM CuentasEntity c " +
                                    "WHERE c.strNumeroCuenta = :strNumeroCuenta")})
public class CuentasEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "idCuentasGenerator", sequenceName = "SEQ_CUENTAS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idCuentasGenerator")
    @Column(name = "NUM_CODIGO_CUENTA")
    private int numCodigoCuenta;
    @Column(name = "STR_NUMERO_CUENTA")
    private String strNumeroCuenta;
    @JoinColumn(name = "STR_TIPO_CUENTA", referencedColumnName = "STR_TIPO_CUENTA_FK")
    @ManyToOne
    private ReferenciasEntity referenciasTipoCuenta;
    @JoinColumn(name = "NUM_CODIGO_PRODUCTO", referencedColumnName = "NUM_CODIGO_PRODUCTO")
    @ManyToOne
    private ProductosEntity productosEntity;

    public CuentasEntity() {
    }

    public CuentasEntity(int numCodigoCuenta, String strNumeroCuenta, ReferenciasEntity referenciasTipoCuenta, ProductosEntity productosEntity) {
        this.numCodigoCuenta = numCodigoCuenta;
        this.strNumeroCuenta = strNumeroCuenta;
        this.referenciasTipoCuenta = referenciasTipoCuenta;
        this.productosEntity = productosEntity;
    }

    public int getNumCodigoCuenta() {
        return numCodigoCuenta;
    }

    public void setNumCodigoCuenta(int numCodigoCuenta) {
        this.numCodigoCuenta = numCodigoCuenta;
    }

    public String getStrNumeroCuenta() {
        return strNumeroCuenta;
    }

    public void setStrNumeroCuenta(String strNumeroCuenta) {
        this.strNumeroCuenta = strNumeroCuenta;
    }

    public ReferenciasEntity getReferenciasTipoCuenta() {
        return referenciasTipoCuenta;
    }

    public void setReferenciasTipoCuenta(ReferenciasEntity referenciasTipoCuenta) {
        this.referenciasTipoCuenta = referenciasTipoCuenta;
    }

    public ProductosEntity getProductosEntity() {
        return productosEntity;
    }

    public void setProductosEntity(ProductosEntity productosEntity) {
        this.productosEntity = productosEntity;
    }
}
