
package co.com.bancodeoccidente.servicios.negocio.administracion.xsd.ejecutarproceso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.bancodeoccidente.servicios.base.encabezadossoa.EncabezadoEntradaType;


/**
 * <p>Java class for MnsjeEntradaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MnsjeEntradaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://bancodeoccidente.com.co/Servicios/Base/EncabezadosSOA}EncabezadoEntrada"/>
 *         &lt;element name="EjecutarProcesoEntrada" type="{http://bancodeoccidente.com.co/Servicios/Negocio/Administracion/xsd/EjecutarProceso}EjecutarProcesoEntradaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MnsjeEntradaType", propOrder = {
    "encabezadoEntrada",
    "ejecutarProcesoEntrada"
})
public class MnsjeEntradaType {

    @XmlElement(name = "EncabezadoEntrada", namespace = "http://bancodeoccidente.com.co/Servicios/Base/EncabezadosSOA", required = true)
    protected EncabezadoEntradaType encabezadoEntrada;
    @XmlElement(name = "EjecutarProcesoEntrada", required = true)
    protected EjecutarProcesoEntradaType ejecutarProcesoEntrada;

    /**
     * Gets the value of the encabezadoEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoEntradaType }
     *     
     */
    public EncabezadoEntradaType getEncabezadoEntrada() {
        return encabezadoEntrada;
    }

    /**
     * Sets the value of the encabezadoEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoEntradaType }
     *     
     */
    public void setEncabezadoEntrada(EncabezadoEntradaType value) {
        this.encabezadoEntrada = value;
    }

    /**
     * Gets the value of the ejecutarProcesoEntrada property.
     * 
     * @return
     *     possible object is
     *     {@link EjecutarProcesoEntradaType }
     *     
     */
    public EjecutarProcesoEntradaType getEjecutarProcesoEntrada() {
        return ejecutarProcesoEntrada;
    }

    /**
     * Sets the value of the ejecutarProcesoEntrada property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjecutarProcesoEntradaType }
     *     
     */
    public void setEjecutarProcesoEntrada(EjecutarProcesoEntradaType value) {
        this.ejecutarProcesoEntrada = value;
    }

}
