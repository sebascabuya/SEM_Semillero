package com.bancodeoccidente.semillero.modulos.comunes.enumeraciones;

import com.bancodeoccidente.bibliotecasam.modulos.comunes.enumeraciones.ConstantesEnum;


/**
 * Interface con las enumeraciones generales de la aplicacion
 * <p/>
 * @author Equipo de Soporte SAM
 * @version PAP - LOGS
 */
public interface ConstantesLocalEnum extends ConstantesEnum {
    /**
     * Nemonico de la funcionalidad
     */
    public static String NEMONICO = "SEM";
    public static String VERSION = "DDMMYYYY";

    public static final String CANTIDAD_REGISTROS_PAGINA = "10";

    /**
     * Enumeración para los dominios de la funcionalidad
     */
    public static enum DominiosLocalEnum {
        //DOM_[NOMBREDOMINIO(1)],..,DOM_[NOMBREDOMINIO(n)]
        DOM_NOMBREDOMINIO("DOM_NOMBREDOMINIO");

        private String dominio;

        private DominiosLocalEnum(String dominio) {
            this.dominio = dominio;
        }

        public String getDominio() {
            return this.dominio;
        }
    }

    /**
     * Enumeración con las claves del dominio DOM_PARAMETROS_FUNCIONALIDAD
     */
    public static enum ParametrosFuncionalidadLocalEnum {
        //[NOMBREPARAMETRO(1)],..,[NOMBREPARAMETRO(n)]
        CODIGO_APLICACION_MULTIPROPOSITO("CAM"), //Código de aplicación de la SAM
        URL_WS_LLAVERO("UWL"), //Endpoint del WS de consulta de llaves
        CANTIDAD_REGISTROS_PAGINA("CRP"), //Número de registros por página de la grilla
        CODIGO_PROCESO("COP"), //Código de proceso para consumo de consulta de llaves
        SESSION_ID("SSI"), //ID sesión para consumo de consulta de llaves
        TRAMA_ID("TRI"), //ID trama para consumo de consulta de llaves
        USUARIO("USI"); //Usuario para consumo de consulta de llaves

        private String parametro;

        private ParametrosFuncionalidadLocalEnum(String parametro) {
            this.parametro = parametro;
        }

        public String getParametro() {
            return parametro;
        }
    }

    /**
     * Enumeración para las simbolos locales
     */
    public static enum SimbolosLocalEnum {
        COMODIN_PARAMETRO_VARIABLE_INICIO("'"),
        COMODIN_PARAMETRO_VARIABLE_FIN("'"),
        COMODIN_PARAMETRO_PATRON("(.*?)");

        private String val;

        private SimbolosLocalEnum(String val) {
            this.val = val;
        }

        public String getVal() {
            return this.val;
        }
    }

    /**
     * Enumeración con los parámetros técnicos locales WS
     */

    public static enum ParametrosTecnicosLocalEnum {
        //WS Enumeramos componente1.componente2 ==> U[0{C..Z}..2{A..Z}]
        AUDIT_ADMINISTRACION_NOMBRESERVICIO_SERVICE_NOMBREOPERACION_WS("U0C");
        //FIN WS Enumeramos componente1.componente2 ==> U[0{C..Z}..2{A..Z}]

        private String vlr;

        private ParametrosTecnicosLocalEnum(String vlr) {
            this.vlr = vlr;
        }

        public String getVlr() {
            return this.vlr;
        }
    }
}
