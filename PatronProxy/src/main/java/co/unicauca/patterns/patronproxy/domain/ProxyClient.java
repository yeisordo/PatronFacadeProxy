/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.patronproxy.domain;

import co.unicauca.patterns.patronproxy.access.Factory;
import co.unicauca.patterns.patronproxy.access.IOrderRepository;

/**
 *
 * @author kevith bastidas
 */
public class ProxyClient {
    private final IOrderService orderService;

    public ProxyClient(IOrderService orderService) {
        this.orderService = orderService;
    }
    
    public void createOrder(){
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        orderService.save(repo);
    }
}
