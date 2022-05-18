
package co.com.bancodeoccidente.servicios.base.encabezadossoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EncabezadoSalidaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoSalidaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PtcionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RtaCod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RtaMnsje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SistMnsje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MasMnsjes" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoSalidaType", propOrder = {
    "ptcionId",
    "rtaCod",
    "rtaMnsje",
    "sistMnsje",
    "masMnsjes"
})
public class EncabezadoSalidaType {

    @XmlElement(name = "PtcionId", required = true)
    protected String ptcionId;
    @XmlElement(name = "RtaCod", required = true)
    protected String rtaCod;
    @XmlElement(name = "RtaMnsje", required = true)
    protected String rtaMnsje;
    @XmlElement(name = "SistMnsje", required = true)
    protected String sistMnsje;
    @XmlElement(name = "MasMnsjes")
    protected boolean masMnsjes;

    /**
     * Gets the value of the ptcionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtcionId() {
        return ptcionId;
    }

    /**
     * Sets the value of the ptcionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtcionId(String value) {
        this.ptcionId = value;
    }

    /**
     * Gets the value of the rtaCod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtaCod() {
        return rtaCod;
    }

    /**
     * Sets the value of the rtaCod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtaCod(String value) {
        this.rtaCod = value;
    }

    /**
     * Gets the value of the rtaMnsje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRtaMnsje() {
        return rtaMnsje;
    }

    /**
     * Sets the value of the rtaMnsje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRtaMnsje(String value) {
        this.rtaMnsje = value;
    }

    /**
     * Gets the value of the sistMnsje property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSistMnsje() {
        return sistMnsje;
    }

    /**
     * Sets the value of the sistMnsje property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSistMnsje(String value) {
        this.sistMnsje = value;
    }

    /**
     * Gets the value of the masMnsjes property.
     * 
     */
    public boolean isMasMnsjes() {
        return masMnsjes;
    }

    /**
     * Sets the value of the masMnsjes property.
     * 
     */
    public void setMasMnsjes(boolean value) {
        this.masMnsjes = value;
    }

}
