/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.patronfacade.domain.presentacion;

import co.unicauca.patterns.patronfacade.access.Factory;
import co.unicauca.patterns.patronfacade.access.IOrderRepository;
import co.unicauca.patterns.patronfacade.domain.Customer;
import co.unicauca.patterns.patronfacade.domain.Dish;
import co.unicauca.patterns.patronfacade.domain.order.stat.State;

/**
 *
 * @author kevit
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        OrderFacade facade = new OrderFacade();
        facade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 BarrioCaldas", "3115677899", "Popayán"));
        facade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        facade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);
        facade.addDish(new Dish(3, "Jugo hit", 1000), 2);
        System.out.println("Pedido creado");
        facade.changeState(State.CONFIRMED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        facade.changeState(State.DISPACHED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        facade.changeState(State.FINALIZED);
        System.out.println("Se cambio el estado a " + facade.getOrder().getState());
        System.out.println("El valor total del pedido es: " + facade.calculateTotal());
        System.out.println("Total de platos pedidos: " + facade.totalDishes());
        IOrderRepository repo = Factory.getInstance().getRepository("default");
        facade.save(repo);
        System.out.println("Pedido grabado con éxito en la base de datos");
        
    }

}
