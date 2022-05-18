
package co.com.bancodeoccidente.servicios.base.encabezadossoa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EncabezadoEntradaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EncabezadoEntradaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AplCod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TrmnalId" type="{http://bancodeoccidente.com.co/xsd/base}TrmnalId_type"/>
 *         &lt;element name="SesionId" type="{http://bancodeoccidente.com.co/xsd/base}SesionId_type"/>
 *         &lt;element name="PtcionId" type="{http://bancodeoccidente.com.co/xsd/base}PtcionId_type"/>
 *         &lt;element name="Usrio" type="{http://bancodeoccidente.com.co/xsd/base}Usrio_type"/>
 *         &lt;element name="PtcionFecha" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncabezadoEntradaType", propOrder = {
    "aplCod",
    "trmnalId",
    "sesionId",
    "ptcionId",
    "usrio",
    "ptcionFecha"
})
public class EncabezadoEntradaType {

    @XmlElement(name = "AplCod")
    protected int aplCod;
    @XmlElement(name = "TrmnalId", required = true)
    protected String trmnalId;
    @XmlElement(name = "SesionId", required = true)
    protected String sesionId;
    @XmlElement(name = "PtcionId", required = true)
    protected String ptcionId;
    @XmlElement(name = "Usrio", required = true)
    protected String usrio;
    @XmlElement(name = "PtcionFecha", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ptcionFecha;

    /**
     * Gets the value of the aplCod property.
     * 
     */
    public int getAplCod() {
        return aplCod;
    }

    /**
     * Sets the value of the aplCod property.
     * 
     */
    public void setAplCod(int value) {
        this.aplCod = value;
    }

    /**
     * Gets the value of the trmnalId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrmnalId() {
        return trmnalId;
    }

    /**
     * Sets the value of the trmnalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrmnalId(String value) {
        this.trmnalId = value;
    }

    /**
     * Gets the value of the sesionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSesionId() {
        return sesionId;
    }

    /**
     * Sets the value of the sesionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSesionId(String value) {
        this.sesionId = value;
    }

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
     * Gets the value of the usrio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsrio() {
        return usrio;
    }

    /**
     * Sets the value of the usrio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsrio(String value) {
        this.usrio = value;
    }

    /**
     * Gets the value of the ptcionFecha property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPtcionFecha() {
        return ptcionFecha;
    }

    /**
     * Sets the value of the ptcionFecha property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPtcionFecha(XMLGregorianCalendar value) {
        this.ptcionFecha = value;
    }

}
