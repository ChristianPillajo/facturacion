package ec.mil.ejercito.dtic.facturacion.service.util;

import java.util.ResourceBundle;


public class VariablesSistema {

    private static VariablesSistema instance;

    private VariablesSistema() {
    }

    public static VariablesSistema getInstance() {
        if (instance == null) {
            instance = new VariablesSistema();
        }
        return instance;
    }

    private static ResourceBundle getResourceBundle() {
        return ResourceBundle.getBundle("messages");
    }

    public static String getValue(String key) {
        return getResourceBundle().getString(key);
    }

}
