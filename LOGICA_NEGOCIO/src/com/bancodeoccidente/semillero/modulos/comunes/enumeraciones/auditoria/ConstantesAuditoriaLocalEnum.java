package com.bancodeoccidente.semillero.modulos.comunes.enumeraciones.auditoria;

import com.bancodeoccidente.bibliotecasam.modulos.comunes.enumeraciones.auditoria.ConstantesAuditoriaEnum;

/**
 * Interface con las constantes de auditoria
 * <p/>
 * @author Equipo de Soporte SAM
 * @version PAP - LOGS
 * @see ConstantesAuditoriaEnum
 */
public interface ConstantesAuditoriaLocalEnum extends ConstantesAuditoriaEnum {

    /**
     * Auditoría para los servicios web de la funcionalidad
     */
    public static enum Componentes1Enum {

        //CP1_[NOMBRESERVICIO(1)],..,CP1_[NOMBRESERVICIO(n)]
        CP1_NOMBRESERVICIO("NombreServicio");

        private String vlr;

        private Componentes1Enum(String valor) {
            this.vlr = valor;
        }

        public String getVlr() {
            return vlr;
        }
    }

    /**
     * Auditoría para las servicios web de la funcionalidad
     */
    public static enum Componentes2Enum {

        //CP2_[NOMBRESERVICIO(1)]_[NOMBREOPERACION(1)],..,[NOMBRESERVICIO(n)]_[NOMBREOPERACION(n)]
        CP2_NOMBRESERVICIO_NOMBREOPERACION("NombreOperacion");

        private String vlr;

        private Componentes2Enum(String valor) {
            this.vlr = valor;
        }

        public String getVlr() {
            return vlr;
        }
    }

}
