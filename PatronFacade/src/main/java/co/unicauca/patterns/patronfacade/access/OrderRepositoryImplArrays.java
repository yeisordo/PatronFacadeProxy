/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.patronfacade.access;

import co.unicauca.patterns.patronfacade.domain.Order;
import java.util.ArrayList;

/**
 *
 * @author kevith bastidas
 */
public class OrderRepositoryImplArrays implements IOrderRepository{
    ArrayList<Order> orders;

    public OrderRepositoryImplArrays() {
        this.orders = new ArrayList<>();
    }
    
    
    
    @Override
    public void createOrder(Order order) {
        orders.add(order);
    }
    
}
