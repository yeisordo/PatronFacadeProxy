/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.patronproxy.access;

import co.unicauca.patterns.patronproxy.domain.Order;


/**
 *
 * @author kevith bastidas
 */
public interface IOrderRepository {
    public void createOrder(Order order);
}
