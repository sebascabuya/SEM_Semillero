package com.bancodeoccidente.semillero.listener;


import com.bancodeoccidente.bibliotecasam.modulos.comunes.utilitarios.Utilidades;
import com.bancodeoccidente.bibliotecasam.modulos.comunes.utilitarios.log4j.UtilidadesLog4j;
import com.bancodeoccidente.bibliotecasam.modulos.excepciones.AplicacionException;
import com.bancodeoccidente.semillero.modulos.comunes.enumeraciones.ConstantesLocalEnum;

import java.util.Date;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


/**
 * Listener ConfiguradorAplicacion
 * <p/>
 * @author Equipo de Soporte SAM
 * @version Versión PAP - LOGS
 **/
public class ConfiguradorAplicacionListener implements ServletContextListener {
    /**
     * Soporte de log
     */
    private static final org.apache.log4j.Logger LOGGER =
        org.apache.log4j.Logger.getLogger(ConfiguradorAplicacionListener.class);

    
    String strLog4jLevel;
    String strLog4jName;
    String strLog4jPath;
    String strLog4jSize;
    String strLog4jSum;
    String strLog4jPattern;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        System.out.println(new Date() + " Inicio contextInitialized");

        try {
            System.out.println("Inicio configuración Log4j para " + ConstantesLocalEnum.NEMONICO + "WS");
            System.out.println("Contexto Web [" + servletContextEvent.getServletContext().getContextPath() + "]");
            System.out.println("Versión: " + ConstantesLocalEnum.VERSION);

            strLog4jLevel =
                    "ALL";
            System.out.println("Carga strLog4jLevel: " + strLog4jLevel);

            strLog4jName =
                    "SemilleroLo4j.log";
            System.out.println("Carga strLog4jName: " + strLog4jName);

            strLog4jPath =
                    "C:\\Logs\\";
            System.out.println("Carga strLog4jPath: " + strLog4jPath);

            strLog4jSize =
                    "10MB";
            System.out.println("Carga strLog4jSize: " + strLog4jSize);

            strLog4jSum =
                    "5";
            System.out.println("Carga strLog4jSum: " + strLog4jSum);

            strLog4jPattern =
                    "[%5p] %d{yyyy-MM-dd HH:mm:ss} (%F:%M:%L)%m%n";
            System.out.println("Carga strLog4jPattern: " + strLog4jPattern);

            UtilidadesLog4j.configurarLog4j(strLog4jLevel, strLog4jName, strLog4jPath, strLog4jSize, strLog4jSum,
                                            strLog4jPattern);
            System.out.println("Log4j configurado satisfactoriamente.");
            LOGGER.info("Contexto Web [" + servletContextEvent.getServletContext().getContextPath() + "]");
            LOGGER.info("Versión: " + ConstantesLocalEnum.VERSION);
        } catch (Exception EX) {
            if (EX instanceof AplicacionException &&
                !Utilidades.EsVacio(((AplicacionException)EX).getRespuestaValidacion())) {
                System.err.println(">> ConfiguradorAplicacionListener#contextInitialized[" +
                                   ((AplicacionException)EX).getRespuestaValidacion().getMensaje() + "]");
            } else {
                System.err.println(">> ConfiguradorAplicacionListener#contextInitialized[" + EX.getMessage() + "]");
            }
        }
        System.out.println(new Date() + " Fin contextInitialized");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
    }
}
