/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.proxy;

import co.unicauca.patterns.proxy.IOrderService;
import co.unicauca.patterns.facade.access.Factory;
import co.unicauca.patterns.facade.access.IOrderRepository;

/**
 *
 * @author kevith bastidas
 */
public class ProxyClient {
    private IOrderService orderService;

    /**
     * Constructor
     * @param orderService sujeto
     */
    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }
    
    /**
     * Crea una instancia del repositorio y posteriormente la guarda
     */
    public void createOrder(){
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        orderService.save(repo);
    }
}
