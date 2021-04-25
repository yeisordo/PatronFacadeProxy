/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.proxy;

import co.unicauca.patterns.facade.access.IOrderRepository;

/**
 *
 * @author kevith bastidas
 */
public interface IOrderService {
    public void save(IOrderRepository repo);
}
