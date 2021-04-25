/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.facade.access;

import co.unicauca.patterns.facade.domain.order.Order;
import java.util.ArrayList;

/**
 *
 * @author kevith bastidas
 */
public class OrderRepositoryImplArrays implements IOrderRepository{
    /**
     * lista de ordenes o pedidos
     */
    ArrayList<Order> orders;

    /**
     * constructor 
     */
    public OrderRepositoryImplArrays() {
        this.orders = new ArrayList<>();
    }
    
    
    /**
     * Guarda una orden en un arrayList
     * @param order 
     */
    @Override
    public void createOrder(Order order) {
        orders.add(order);
    }
    
}
