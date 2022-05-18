 /*==========================================================================
      Copyright (c) Banco de Occidente. Todos los derechos reservados.
    ==========================================================================
      Classname: StringBundleOverride.
      Requiere: JDK 1.6+
      Creado con: JDeveloper 11.1.2.1.0

      HISTORIA DE CAMBIOS RELEVANTES (anho.mes.dia)
      yyyy.mm.dd - Tata Consultancy Services Limited: Creacion V. 1.0
    ==========================================================================
  */
package com.bancodeoccidente.semillero.listener;

import java.util.ListResourceBundle;


 /**
  * Listener para registrar mensajes genericos web
  * <p/>
  * @author Equipo In-House de Soluciones JAVA
  * @version 1.0 yyyy.mm.dd
  **/
public class StringBundleOverride extends ListResourceBundle {
    /**
     */
    public StringBundleOverride() {
        super();
    }

    /**
     * @return
     */
    @Override
    public Object[][] getContents() {
        return new Object[][] { { "org.apache.myfaces.trinidad.UIXEditableValue.REQUIRED",
                                  "" },
                                { "org.apache.myfaces.trinidad.UIXEditableValue.REQUIRED_detail",
                                  " \"{0}\" Campo Obligatorio. " },
                                { "org.apache.myfaces.trinidad.UIXSelectOne.REQUIRED",
                                  "" },
                                { "org.apache.myfaces.trinidad.UIXSelectOne.REQUIRED_detail",
                                  " \"{0}\" Campo Obligatorio. " },
                                { "javax.faces.validator.LongRangeValidator.MINIMUM",
                                  "" },
                                { "org.apache.myfaces.trinidad.validator.RegExpValidator.NO_MATCH",
                                  "" },
                                { "org.apache.myfaces.trinidad.validator.LongRangeValidator.MINIMUM",
                                  "" },
                                { "org.apache.myfaces.trinidad.convert.NumberConverter.CONVERT_PATTERN",
                                  "" } };
    }


}
