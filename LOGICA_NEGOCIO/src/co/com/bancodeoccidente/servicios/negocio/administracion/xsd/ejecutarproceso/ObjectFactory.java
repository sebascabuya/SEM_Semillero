
package co.com.bancodeoccidente.servicios.negocio.administracion.xsd.ejecutarproceso;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.com.bancodeoccidente.servicios.negocio.administracion.xsd.ejecutarproceso package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EjecutarProcesoRta_QNAME = new QName("http://bancodeoccidente.com.co/Servicios/Negocio/Administracion/xsd/EjecutarProceso", "EjecutarProcesoRta");
    private final static QName _EjecutarProceso_QNAME = new QName("http://bancodeoccidente.com.co/Servicios/Negocio/Administracion/xsd/EjecutarProceso", "EjecutarProceso");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.com.bancodeoccidente.servicios.negocio.administracion.xsd.ejecutarproceso
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EjecutarProcesoEntradaType }
     * 
     */
    public EjecutarProcesoEntradaType createEjecutarProcesoEntradaType() {
        return new EjecutarProcesoEntradaType();
    }

    /**
     * Create an instance of {@link MnsjeEntradaType }
     * 
     */
    public MnsjeEntradaType createMnsjeEntradaType() {
        return new MnsjeEntradaType();
    }

    /**
     * Create an instance of {@link MnsjeSalidaType }
     * 
     */
    public MnsjeSalidaType createMnsjeSalidaType() {
        return new MnsjeSalidaType();
    }

    /**
     * Create an instance of {@link EjecutarProcesoSalidaType }
     * 
     */
    public EjecutarProcesoSalidaType createEjecutarProcesoSalidaType() {
        return new EjecutarProcesoSalidaType();
    }

    /**
     * Create an instance of {@link EjecutarProcesoEntradaType.InfoReglaParam }
     * 
     */
    public EjecutarProcesoEntradaType.InfoReglaParam createEjecutarProcesoEntradaTypeInfoReglaParam() {
        return new EjecutarProcesoEntradaType.InfoReglaParam();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MnsjeSalidaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bancodeoccidente.com.co/Servicios/Negocio/Administracion/xsd/EjecutarProceso", name = "EjecutarProcesoRta")
    public JAXBElement<MnsjeSalidaType> createEjecutarProcesoRta(MnsjeSalidaType value) {
        return new JAXBElement<MnsjeSalidaType>(_EjecutarProcesoRta_QNAME, MnsjeSalidaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MnsjeEntradaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bancodeoccidente.com.co/Servicios/Negocio/Administracion/xsd/EjecutarProceso", name = "EjecutarProceso")
    public JAXBElement<MnsjeEntradaType> createEjecutarProceso(MnsjeEntradaType value) {
        return new JAXBElement<MnsjeEntradaType>(_EjecutarProceso_QNAME, MnsjeEntradaType.class, null, value);
    }

}
