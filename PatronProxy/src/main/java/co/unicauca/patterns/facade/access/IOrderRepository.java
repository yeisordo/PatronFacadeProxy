/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.facade.access;

import co.unicauca.patterns.facade.domain.order.Order;
/**
 *
 * @author kevith bastidas
 */
public interface IOrderRepository {
    /**
     * Guarda una orden.
     * @param order 
     */
    public void createOrder(Order order);
}
