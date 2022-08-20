package ec.mil.ejercito.dtic.facturacion.beans;

import ec.mil.ejercito.dtic.facturacion.entities.Cliente;
import ec.mil.ejercito.dtic.facturacion.service.ClienteService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import static ec.mil.ejercito.dtic.facturacion.service.util.Mensajes.*;
import static ec.mil.ejercito.dtic.facturacion.service.util.VariablesSistema.getValue;

/**
 *
 * @author ALDAIR
 */
@Named
@ViewScoped
public class ClienteBean implements Serializable {

    @EJB
    private ClienteService clienteService;

    private List<Cliente> clienteList;

    private Cliente cliente;
    private boolean activarModal;

    @PostConstruct
    public void init() {
        mostrarExito(getValue("registro"));
        this.listarclientes();
    }

    public void listarclientes() {
        this.clienteList = this.clienteService.findAll();
    }

    public void crearNuevo() {
        this.cliente = new Cliente();
        this.activarModal = true;
    }

    public void cancelar() {
        this.cliente = null;
        this.activarModal = false;
    }
    
    public void guardar(){
    this.clienteService.create(this.cliente);
        mostrarExito(getValue("registro"));
        this.activarModal=false;
        this.listarclientes();
        this.cliente=null;
    
    }
    
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean isActivarModal() {
        return activarModal;
    }

    public void setActivarModal(boolean activarModal) {
        this.activarModal = activarModal;
    }

}
