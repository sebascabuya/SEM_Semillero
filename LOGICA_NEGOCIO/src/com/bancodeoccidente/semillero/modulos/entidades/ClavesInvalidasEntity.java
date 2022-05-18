package com.bancodeoccidente.semillero.modulos.entidades;

import javax.persistence.*;

@Entity
@Table(name = "TBL_CLAVES_INVALIDAS")
@NamedQueries({@NamedQuery(name="ClavesInvalidasEntity.findListPasswordsByProductoNumber",
                            query = "SELECT c FROM ClavesInvalidasEntity c " +
                                    "WHERE c.productosEntity.strNumeroProducto = :strNumeroProducto"),
               @NamedQuery(name="ClavesInvalidasEntity.findByProductNumberAndPassword",
                            query = "SELECT c FROM ClavesInvalidasEntity c " +
                                    "WHERE c.productosEntity.strNumeroProducto = :strNumeroProducto " +
                                    "AND c.numClaveInvalida = :numClaveInvalida")})
public class ClavesInvalidasEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "idClavesInvalidasGenerator", sequenceName = "SEQ_CLAVES_INVALIDAS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idClavesInvalidasGenerator")
    @Column(name = "NUM_CODIGO_CLAVE_INVALIDA")
    private Long numCodigoClaveInvalida;
    @Column(name = "NUM_CLAVE_INVALIDA")
    private int numClaveInvalida;
    @JoinColumn(name = "NUM_CODIGO_PRODUCTO", referencedColumnName = "NUM_CODIGO_PRODUCTO")
    @ManyToOne
    private ProductosEntity productosEntity;

    public ClavesInvalidasEntity() {
    }

    public ClavesInvalidasEntity(Long numCodigoClaveInvalida, int numClaveInvalida, ProductosEntity productosEntity) {
        this.numCodigoClaveInvalida = numCodigoClaveInvalida;
        this.numClaveInvalida = numClaveInvalida;
        this.productosEntity = productosEntity;
    }

    public Long getNumCodigoClaveInvalida() {
        return numCodigoClaveInvalida;
    }

    public void setNumCodigoClaveInvalida(Long numCodigoClaveInvalida) {
        this.numCodigoClaveInvalida = numCodigoClaveInvalida;
    }

    public int getNumClaveInvalida() {
        return numClaveInvalida;
    }

    public void setNumClaveInvalida(int numClaveInvalida) {
        this.numClaveInvalida = numClaveInvalida;
    }

    public ProductosEntity getProductosEntity() {
        return productosEntity;
    }

    public void setProductosEntity(ProductosEntity productosEntity) {
        this.productosEntity = productosEntity;
    }
}
