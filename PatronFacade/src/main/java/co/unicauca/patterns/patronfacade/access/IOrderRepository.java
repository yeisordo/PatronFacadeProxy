/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.patronfacade.access;

import co.unicauca.patterns.patronfacade.domain.Order;


/**
 *
 * @author kevith bastidas
 */
public interface IOrderRepository {
    public void createOrder(Order order);
}
