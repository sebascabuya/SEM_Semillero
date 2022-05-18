
package co.com.bancodeoccidente.servicios.negocio.administracion.xsd.ejecutarproceso;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EjecutarProcesoSalidaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EjecutarProcesoSalidaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrcsoCod" type="{http://bancodeoccidente.com.co/xsd/base}PrcsoCod_type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EjecutarProcesoSalidaType", propOrder = {
    "prcsoCod"
})
public class EjecutarProcesoSalidaType {

    @XmlElement(name = "PrcsoCod", required = true)
    protected String prcsoCod;

    /**
     * Gets the value of the prcsoCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrcsoCod() {
        return prcsoCod;
    }

    /**
     * Sets the value of the prcsoCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrcsoCod(String value) {
        this.prcsoCod = value;
    }

}
