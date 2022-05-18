package com.bancodeoccidente.semillero.modulos.comunes.utilitarios;


import com.bancodeoccidente.bibliotecasam.modulos.comunes.utilitarios.Utilidades;
import com.bancodeoccidente.semillero.modulos.comunes.enumeraciones.ConstantesLocalEnum;
import com.bancodeoccidente.semillero.modulos.comunes.enumeraciones.mensajeria.MensajesRespuestaLocalEnum;

import java.text.SimpleDateFormat;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;


/**
 * Utilidad para el manejo propio de la funcionalidad.
 * <p/>
 * @author Equipo de Soporte SAM
 * @version Inicial
 * @see Utilidades
 */
public class UtilidadesLocal extends Utilidades {

    /**
     * Soporte de log
     */
    private static final org.apache.log4j.Logger LOGGER = org.apache.log4j.Logger.getLogger(UtilidadesLocal.class);

    /**
     * Constructor de la clase
     */
    public UtilidadesLocal() {
        super();
    }

    /**
     * Construye el hex del parametro dinámicamente
     * @param params {params[0] = cadena patron ; params[1] = fecha}
     * @return
     * @throws IllegalArgumentException
     */
    public static String getParametroMascaraLocal(Object... params) throws IllegalArgumentException {
        StringBuffer sB = new StringBuffer();
        String strReplace = null;
        Pattern patternVariable =
            Pattern.compile(ConstantesLocalEnum.SimbolosLocalEnum.COMODIN_PARAMETRO_VARIABLE_INICIO.getVal() + ConstantesLocalEnum.SimbolosLocalEnum.COMODIN_PARAMETRO_PATRON.getVal() +
                            ConstantesLocalEnum.SimbolosLocalEnum.COMODIN_PARAMETRO_VARIABLE_FIN.getVal());
        Matcher matcherVariable = patternVariable.matcher(params[0].toString());
        int startFijo = 0;
        while (matcherVariable.find()) {
            int startVariable = matcherVariable.start();
            if (startFijo < startVariable) {
                sB.append(params[0].toString().substring(startFijo, startVariable));
                sB.append(new SimpleDateFormat(matcherVariable.group(1)).format(params[1]));
            } else {
                sB.append(new SimpleDateFormat(matcherVariable.group(1)).format(params[1]));
                sB.append(params[0].toString().substring(startFijo, startVariable));
            }
            startFijo = startVariable + 2 + matcherVariable.group(1).length();
        }
        sB.append(params[0].toString().substring(startFijo, params[0].toString().length()));
        strReplace =
                params[0].toString().replace(ConstantesLocalEnum.SimbolosLocalEnum.COMODIN_PARAMETRO_VARIABLE_INICIO.getVal(), ConstantesLocalEnum.SimbolosEnum.VACIO.getVal()).replace(ConstantesLocalEnum.SimbolosLocalEnum.COMODIN_PARAMETRO_VARIABLE_FIN.getVal(),
                                                                                                                                                                                        ConstantesLocalEnum.SimbolosEnum.VACIO.getVal());
        if (strReplace.length() != sB.length()) {
            throw new IllegalArgumentException();
        }
        return sB.toString();

    }

    /**
     * Devuelve el mensaje formateado
     * @param objPatron
     * @param params
     * @return
     */
    public static Object formatearMensajeLocal(Object objPatron, Object... params) {
        if (objPatron instanceof MensajesRespuestaLocalEnum.RespuestasWSLocalEnum) {
            ((MensajesRespuestaLocalEnum.RespuestasWSLocalEnum)objPatron).setMensaje(String.format(((MensajesRespuestaLocalEnum.RespuestasWSLocalEnum)objPatron).getMensaje(),
                                                                                                   params));
        }
        return objPatron;

    }

    /**
     * Rellena una cadena a la izquierda según parámetros
     * @param cadena
     * @param longitud
     * @param caracterRelleno
     * @return
     */
    public static String rellenarCadenaIzquierda(String cadena, int longitud, String caracterRelleno) {
        return StringUtils.leftPad(cadena, longitud, caracterRelleno);

    }
}
