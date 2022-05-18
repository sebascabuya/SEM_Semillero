package com.bancodeoccidente.semillero.modulos.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBL_REFERENCIAS")
@NamedQueries({@NamedQuery(name="ReferenciasEntity.findListDomainsByDomainType",
                            query = "SELECT r FROM ReferenciasEntity r " +
                                    "WHERE r.strDominio = :strDominio"),
                @NamedQuery(name="ReferenciasEntity.findListDomainsNotNullByProductType",
                            query = "SELECT r FROM ReferenciasEntity r " +
                                    "WHERE r.strTipoProductoFk IS NOT NULL"),
                @NamedQuery(name="ReferenciasEntity.findListDomainsNotNullByPasswordType",
                            query = "SELECT r FROM ReferenciasEntity r " +
                                    "WHERE r.strTipoClaveFk IS NOT NULL"),
                @NamedQuery(name="ReferenciasEntity.findListDomainsNotNullByAccountType",
                            query = "SELECT r FROM ReferenciasEntity r " +
                                    "WHERE r.strTipoCuentaFk IS NOT NULL"),
                @NamedQuery(name="ReferenciasEntity.findListDomainsNotNullByIdType",
                            query = "SELECT r FROM ReferenciasEntity r " +
                                    "WHERE r.strTipoIdFk IS NOT NULL"),
                @NamedQuery(name="ReferenciasEntity.findListDomainsNotNullByIsActiveType",
                            query = "SELECT r FROM ReferenciasEntity r " +
                                    "WHERE r.strEsActivoFk IS NOT NULL"), 
                @NamedQuery(name="ReferenciasEntity.findByDomain",
                            query = "SELECT r FROM ReferenciasEntity r " +
                                    "WHERE r.strDominio = :strDominio " +
                                    "AND r.strRangoValor = :strRangoValor"),
                @NamedQuery(name="ReferenciasEntity.findByIdDomain",
                            query = "SELECT r FROM ReferenciasEntity r " +
                                    "WHERE r.strTipoIdFk = :strTipoId")})
public class ReferenciasEntity {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "idReferenciasGenerator", sequenceName = "SEQ_REFERENCIAS", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idReferenciasGenerator")
    @Column(name = "NUM_ID_REFERENCIA")
    private int numIdReferencia;
    @Column(name = "STR_DOMINIO")
    private String strDominio;
    @Column(name = "STR_RANGO_VALOR")
    private String strRangoValor;
    @Column(name = "STR_DESCRIPCION")
    private String strDescripcion;
    @Column(name = "STR_VALOR_PARAMETRO")
    private String strValorParametro;
    @Column(name = "STR_ESTADO")
    private String strEstado;
    @Column(name = "STR_TIPO_PRODUCTO_FK")
    private String strTipoProductoFk;
    @Column(name = "STR_TIPO_CLAVE_FK")
    private String strTipoClaveFk;
    @Column(name = "STR_TIPO_CUENTA_FK")
    private String strTipoCuentaFk;
    @Column(name = "STR_TIPO_ID_FK")
    private String strTipoIdFk;
    @Column(name = "STR_ES_ACTIVO_FK")
    private String strEsActivoFk;

    public ReferenciasEntity(){
        
    }

    public ReferenciasEntity(int numIdReferencia, String strDominio, String strRangoValor, String strDescripcion,
                             String strValorParametro, String strEstado, String strTipoProductoFk,
                             String strTipoClaveFk, String strTipoCuentaFk, String strTipoIdFk, String strEsActivoFk) {
        this.numIdReferencia = numIdReferencia;
        this.strDominio = strDominio;
        this.strRangoValor = strRangoValor;
        this.strDescripcion = strDescripcion;
        this.strValorParametro = strValorParametro;
        this.strEstado = strEstado;
        this.strTipoProductoFk = strTipoProductoFk;
        this.strTipoClaveFk = strTipoClaveFk;
        this.strTipoCuentaFk = strTipoCuentaFk;
        this.strTipoIdFk = strTipoIdFk;
        this.strEsActivoFk = strEsActivoFk;
    }

    public int getNumIdReferencia() {
        return numIdReferencia;
    }

    public void setNumIdReferencia(int numIdReferencia) {
        this.numIdReferencia = numIdReferencia;
    }

    public String getStrDominio() {
        return strDominio;
    }

    public void setStrDominio(String strDominio) {
        this.strDominio = strDominio;
    }

    public String getStrRangoValor() {
        return strRangoValor;
    }

    public void setStrRangoValor(String strRangoValor) {
        this.strRangoValor = strRangoValor;
    }

    public String getStrDescripcion() {
        return strDescripcion;
    }

    public void setStrDescripcion(String strDescripcion) {
        this.strDescripcion = strDescripcion;
    }

    public String getStrValorParametro() {
        return strValorParametro;
    }

    public void setStrValorParametro(String strValorParametro) {
        this.strValorParametro = strValorParametro;
    }

    public String getStrEstado() {
        return strEstado;
    }

    public void setStrEstado(String strEstado) {
        this.strEstado = strEstado;
    }

    public String getStrTipoProductoFk() {
        return strTipoProductoFk;
    }

    public void setStrTipoProductoFk(String strTipoProductoFk) {
        this.strTipoProductoFk = strTipoProductoFk;
    }

    public String getStrTipoClaveFk() {
        return strTipoClaveFk;
    }

    public void setStrTipoClaveFk(String strTipoClaveFk) {
        this.strTipoClaveFk = strTipoClaveFk;
    }

    public String getStrTipoCuentaFk() {
        return strTipoCuentaFk;
    }

    public void setStrTipoCuentaFk(String strTipoCuentaFk) {
        this.strTipoCuentaFk = strTipoCuentaFk;
    }

    public String getStrTipoIdFk() {
        return strTipoIdFk;
    }

    public void setStrTipoIdFk(String strTipoIdFk) {
        this.strTipoIdFk = strTipoIdFk;
    }

    public String getStrEsActivoFk() {
        return strEsActivoFk;
    }

    public void setStrEsActivoFk(String strEsActivoFk) {
        this.strEsActivoFk = strEsActivoFk;
    }
}
