/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.proxy;

import co.unicauca.patterns.proxy.IOrderService;
import co.unicauca.patterns.facade.access.IOrderRepository;
import co.unicauca.patterns.facade.domain.order.OrderFacade;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author kevit
 */
public class OrderServiceLogger implements IOrderService{
    private OrderFacade orderFacade;

    public OrderServiceLogger(OrderFacade orderFacade) {
        this.orderFacade = orderFacade;
    }
    
    @Override
    public void save(IOrderRepository repo) {
        //Se hace el log
        Logger logger= LoggerFactory.getLogger(OrderServiceLogger.class); 
        orderFacade.save(repo);

        String message = "Pedido guardado en la base de datos";   
        logger.info(message); 
    }
    
}
