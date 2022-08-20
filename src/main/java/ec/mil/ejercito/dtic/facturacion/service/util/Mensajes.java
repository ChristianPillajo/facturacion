
package ec.mil.ejercito.dtic.facturacion.service.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;


public class Mensajes {

    private static Mensajes instance;

    private Mensajes() {
    }

    public static Mensajes getInstance() {
        if (instance == null) {
            instance = new Mensajes();
        }
        return instance;
    }

    public static void mostrarExito(String mensaje) {
        mostrarMensaje(mensaje, FacesMessage.SEVERITY_INFO);
    }

    public static void mostrarError(String mensaje) {
        mostrarMensaje(mensaje, FacesMessage.SEVERITY_ERROR);
    }

    public static void mostrarAdvertencia(String mensaje) {
        mostrarMensaje(mensaje, FacesMessage.SEVERITY_WARN);
    }

    public static void mostrarFatal(String mensaje) {
        mostrarMensaje(mensaje, FacesMessage.SEVERITY_FATAL);
    }

    private static void mostrarMensaje(String mensaje, FacesMessage.Severity severidad) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(severidad, mensaje, mensaje));
    }
    
    
}
