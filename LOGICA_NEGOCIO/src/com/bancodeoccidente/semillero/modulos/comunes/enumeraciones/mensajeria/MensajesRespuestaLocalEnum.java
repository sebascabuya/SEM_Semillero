package com.bancodeoccidente.semillero.modulos.comunes.enumeraciones.mensajeria;

import com.bancodeoccidente.bibliotecasam.modulos.comunes.enumeraciones.mensajeria.MensajesRespuestaEnum;

/**
 * Interface con la mensajeria de servicios
 * <p/>
 * @author Equipo de Soporte SAM
 * @version Inicial
 * @see MensajesRespuestaEnum
 */
public interface MensajesRespuestaLocalEnum extends MensajesRespuestaEnum {
    /**
     * Mensajería para los servicios web de la funcionalidad
     */
    public static enum RespuestasWSLocalEnum {
        //[MENSAJE(1)],..,[MENSAJE(n)]
        MENSAJE("000#", "Contenido mensaje");

        private String codigo;
        private String mensaje;

        RespuestasWSLocalEnum(String cod, String msj) {
            codigo = cod;
            mensaje = msj;
        }

        /**
         * Retorna el codigo de respuesta.
         * @return
         * codigo de respuesta.
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Retorna el mensaje para el usuario.
         * @return
         * mensaje para el usuario,
         */
        public String getMensaje() {
            return mensaje;
        }

        /**
         * El codigo to set
         * @param cod
         * @return
         */
        public void setCodigo(String cod) {
            this.codigo = cod;
        }

        /**
         * El msj to set
         * @param msj
         */
        public void setMensaje(String msj) {
            this.mensaje = msj;
        }

    }

    /**
     * Mensajería para cualquier otro proposito de la funcionalidad
     */
    public static enum RespuestasMultiLocalEnum {
        //[MENSAJE(1)],..,[MENSAJE(n)]
        ERROR_CLONACION("0016", "Error al clonar el producto %s");

        private String codigo;
        private String mensaje;

        RespuestasMultiLocalEnum(String cod, String msj) {
            codigo = cod;
            mensaje = msj;
        }

        /**
         * Retorna el codigo de respuesta.
         * @return
         * codigo de respuesta.
         */
        public String getCodigo() {
            return codigo;
        }

        /**
         * Retorna el mensaje para el usuario.
         * @return
         * mensaje para el usuario,
         */
        public String getMensaje() {
            return mensaje;
        }

        /**
         * El codigo to set
         * @param cod
         * @return
         */
        public void setCodigo(String cod) {
            this.codigo = cod;
        }

        /**
         * El msj to set
         * @param msj
         */
        public void setMensaje(String msj) {
            this.mensaje = msj;
        }

    }

}
