
package co.com.bancodeoccidente.servicios.negocio.administracion.xsd.ejecutarproceso;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EjecutarProcesoEntradaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EjecutarProcesoEntradaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contexto" type="{http://bancodeoccidente.com.co/xsd/base}Contexto_type"/>
 *         &lt;element name="InfoReglaParam" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PrmetroNom" type="{http://bancodeoccidente.com.co/xsd/base}PrmetroNom_type"/>
 *                   &lt;element name="PrmetroVlr" type="{http://bancodeoccidente.com.co/xsd/base}PrmetroVlr_type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EjecutarProcesoEntradaType", propOrder = {
    "contexto",
    "infoReglaParam"
})
public class EjecutarProcesoEntradaType {

    @XmlElement(name = "Contexto", required = true)
    protected String contexto;
    @XmlElement(name = "InfoReglaParam", required = true)
    protected List<EjecutarProcesoEntradaType.InfoReglaParam> infoReglaParam;

    /**
     * Gets the value of the contexto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContexto() {
        return contexto;
    }

    /**
     * Sets the value of the contexto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContexto(String value) {
        this.contexto = value;
    }

    /**
     * Gets the value of the infoReglaParam property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infoReglaParam property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfoReglaParam().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EjecutarProcesoEntradaType.InfoReglaParam }
     * 
     * 
     */
    public List<EjecutarProcesoEntradaType.InfoReglaParam> getInfoReglaParam() {
        if (infoReglaParam == null) {
            infoReglaParam = new ArrayList<EjecutarProcesoEntradaType.InfoReglaParam>();
        }
        return this.infoReglaParam;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="PrmetroNom" type="{http://bancodeoccidente.com.co/xsd/base}PrmetroNom_type"/>
     *         &lt;element name="PrmetroVlr" type="{http://bancodeoccidente.com.co/xsd/base}PrmetroVlr_type"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prmetroNom",
        "prmetroVlr"
    })
    public static class InfoReglaParam {

        @XmlElement(name = "PrmetroNom", required = true)
        protected String prmetroNom;
        @XmlElement(name = "PrmetroVlr", required = true)
        protected String prmetroVlr;

        /**
         * Gets the value of the prmetroNom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrmetroNom() {
            return prmetroNom;
        }

        /**
         * Sets the value of the prmetroNom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrmetroNom(String value) {
            this.prmetroNom = value;
        }

        /**
         * Gets the value of the prmetroVlr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrmetroVlr() {
            return prmetroVlr;
        }

        /**
         * Sets the value of the prmetroVlr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrmetroVlr(String value) {
            this.prmetroVlr = value;
        }

    }

}
