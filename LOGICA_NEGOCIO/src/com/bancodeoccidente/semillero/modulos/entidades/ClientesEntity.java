package com.bancodeoccidente.semillero.modulos.entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "TBL_CLIENTES" )
@NamedQueries({@NamedQuery(name="ClientesEntity.findById",
                            query = "SELECT r FROM ClientesEntity r " +
                                    "WHERE r.referenciasTipoId.strTipoIdFk = :strTipoIdFk " +
                                    "AND r.strId = :strId")})
public class ClientesEntity{
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "idClientesGenerator", sequenceName = "SEQ_CLIENTES", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idClientesGenerator")
    @Column(name = "NUM_CODIGO_CLIENTE")
    private int numCodigoCliente;
    @Column(name = "STR_NOMBRE_COMPLETO")
    private String strNombreCompleto;
    @ManyToOne
    @JoinColumn(name = "STR_TIPO_ID", referencedColumnName = "STR_TIPO_ID_FK")
    private ReferenciasEntity referenciasTipoId;
    @Column(name = "STR_ID")
    private String strId;
    @Column(name = "DTM_FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date dtmFechaNacimiento;

    public ClientesEntity(){

    }

    public ClientesEntity(int numCodigoCliente, String strNombreCompleto, String strTipoId, String strId, Date dtmFechaNacimiento, ReferenciasEntity referenciasTipoId) {
        this.numCodigoCliente = numCodigoCliente;
        this.strNombreCompleto = strNombreCompleto;
        this.referenciasTipoId = referenciasTipoId;
        this.strId = strId;
        this.dtmFechaNacimiento = dtmFechaNacimiento;
    }

    public int getNumCodigoCliente() {
        return numCodigoCliente;
    }

    public void setNumCodigoCliente(int numCodigoCliente) {
        this.numCodigoCliente = numCodigoCliente;
    }

    public String getStrNombreCompleto() {
        return strNombreCompleto;
    }

    public void setStrNombreCompleto(String strNombreCompleto) {
        this.strNombreCompleto = strNombreCompleto;
    }

    public ReferenciasEntity getReferenciasTipoId() {
        return referenciasTipoId;
    }

    public void setReferenciasTipoId(ReferenciasEntity referenciasTipoId) {
        this.referenciasTipoId = referenciasTipoId;
    }

    public String getStrId() {
        return strId;
    }

    public void setStrId(String strId) {
        this.strId = strId;
    }

    public Date getDtmFechaNacimiento() {
        return dtmFechaNacimiento;
    }

    public void setDtmFechaNacimiento(Date dtmFechaNacimiento) {
        this.dtmFechaNacimiento = dtmFechaNacimiento;
    }
}
