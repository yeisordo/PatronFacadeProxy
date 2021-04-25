/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.patronproxy.domain;

import co.unicauca.patterns.patronproxy.access.IOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author kevit
 */
public class OrderServiceLogger implements IOrderService{
    private final OrderFacade orderFacade;

    public OrderServiceLogger(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }
    
    @Override
    public void save(IOrderRepository repo) {
        repo.createOrder(orderFacade.getOrder());
        
        //Se hace el log
        Logger logger= LoggerFactory.getLogger(OrderFacade.class); 
        
        String message = "Pedido guardado en la base de datos";   
        logger.info(message); 
    }
    
}
