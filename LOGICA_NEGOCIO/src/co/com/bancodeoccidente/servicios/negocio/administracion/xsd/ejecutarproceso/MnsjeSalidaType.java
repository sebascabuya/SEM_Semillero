
package co.com.bancodeoccidente.servicios.negocio.administracion.xsd.ejecutarproceso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import co.com.bancodeoccidente.servicios.base.encabezadossoa.EncabezadoSalidaType;


/**
 * <p>Java class for MnsjeSalidaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MnsjeSalidaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://bancodeoccidente.com.co/Servicios/Base/EncabezadosSOA}EncabezadoSalida"/>
 *         &lt;element name="EjecutarProcesoSalida" type="{http://bancodeoccidente.com.co/Servicios/Negocio/Administracion/xsd/EjecutarProceso}EjecutarProcesoSalidaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MnsjeSalidaType", propOrder = {
    "encabezadoSalida",
    "ejecutarProcesoSalida"
})
public class MnsjeSalidaType {

    @XmlElement(name = "EncabezadoSalida", namespace = "http://bancodeoccidente.com.co/Servicios/Base/EncabezadosSOA", required = true)
    protected EncabezadoSalidaType encabezadoSalida;
    @XmlElement(name = "EjecutarProcesoSalida", required = true)
    protected EjecutarProcesoSalidaType ejecutarProcesoSalida;

    /**
     * Gets the value of the encabezadoSalida property.
     * 
     * @return
     *     possible object is
     *     {@link EncabezadoSalidaType }
     *     
     */
    public EncabezadoSalidaType getEncabezadoSalida() {
        return encabezadoSalida;
    }

    /**
     * Sets the value of the encabezadoSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link EncabezadoSalidaType }
     *     
     */
    public void setEncabezadoSalida(EncabezadoSalidaType value) {
        this.encabezadoSalida = value;
    }

    /**
     * Gets the value of the ejecutarProcesoSalida property.
     * 
     * @return
     *     possible object is
     *     {@link EjecutarProcesoSalidaType }
     *     
     */
    public EjecutarProcesoSalidaType getEjecutarProcesoSalida() {
        return ejecutarProcesoSalida;
    }

    /**
     * Sets the value of the ejecutarProcesoSalida property.
     * 
     * @param value
     *     allowed object is
     *     {@link EjecutarProcesoSalidaType }
     *     
     */
    public void setEjecutarProcesoSalida(EjecutarProcesoSalidaType value) {
        this.ejecutarProcesoSalida = value;
    }

}
