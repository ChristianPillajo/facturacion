/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.mil.ejercito.dtic.facturacion.service;

import ec.mil.ejercito.dtic.facturacion.entities.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author ALDAIR
 */
@Stateless
public class ClienteService extends AbstractFacade<Cliente> {

    @PersistenceContext(unitName = "facturacionPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ClienteService() {
        super(Cliente.class);
    }
    
    
    
}
