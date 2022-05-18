package co.com.bancodeoccidente.servicios.negocio.administracion.wsdl.ejecucionprocesomultipropositos;


import co.com.bancodeoccidente.servicios.negocio.administracion.xsd.ejecutarproceso.MnsjeEntradaType;
import co.com.bancodeoccidente.servicios.negocio.administracion.xsd.ejecutarproceso.MnsjeSalidaType;

import com.bancodeoccidente.semillero.modulos.negocio.NegocioEJBLocal;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import javax.jws.WebService;


@WebService(serviceName = "EjecucionProcesoMultiPropositosService", targetNamespace = "http://bancodeoccidente.com.co/Servicios/Negocio/Administracion/wsdl/EjecucionProcesoMultiPropositos", portName = "EjecucionProcesoMultiPropositosPort", endpointInterface = "co.com.bancodeoccidente.servicios.negocio.administracion.wsdl.ejecucionprocesomultipropositos.EjecucionProcesoMultiPropositosPortType", wsdlLocation = "/EjecucionProcesoMultiPropositosService.wsdl")
@Stateless
public class EjecucionProcesoMultiPropositosPortTypeImpl {
    
    private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(EjecucionProcesoMultiPropositosPortTypeImpl.class);
    
    @EJB
    NegocioEJBLocal negocioEJBLocal;
    public EjecucionProcesoMultiPropositosPortTypeImpl() {
    }

    public MnsjeSalidaType ejecutarProceso(MnsjeEntradaType input) {
        try {
            negocioEJBLocal.ejecutarNegocio();
        } catch (Exception e) {
            LOGGER.fatal(e.getMessage(), e);
        }
        return null;
    }
}
