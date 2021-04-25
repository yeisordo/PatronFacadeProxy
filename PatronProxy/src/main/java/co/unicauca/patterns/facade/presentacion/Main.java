/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.facade.presentacion;

import co.unicauca.patterns.facade.domain.order.Customer;
import co.unicauca.patterns.facade.domain.order.Dish;
import co.unicauca.patterns.proxy.IOrderService;
import co.unicauca.patterns.facade.domain.order.OrderFacade;
import co.unicauca.patterns.proxy.OrderServiceLogger;
import co.unicauca.patterns.proxy.ProxyClient;
import co.unicauca.patterns.facade.domain.order.State;


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
        //El sujeto real.
        OrderFacade orderFacade = new OrderFacade();

        //El objeto proxy. Se le pasa el objeto real por el constructor (inyección)
        IOrderService orderProxy = new OrderServiceLogger(orderFacade);

        //Se opera normal el sujeto real
        orderFacade.createOrder(new Customer(1, "Carlos Sanchez", "Calle 12 No. 12-12 BarrioCaldas", "3115677899", "Popayán"));
        orderFacade.addDish(new Dish(1, "Hamburguesa vegetariana", 5000), 2);
        orderFacade.addDish(new Dish(2, "Hamburguesa sencilla", 4000), 3);
        orderFacade.addDish(new Dish(3, "Jugo hit", 1000), 2);
        System.out.println("Pedido creado");
        orderFacade.changeState(State.CONFIRMED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        orderFacade.changeState(State.DISPACHED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        orderFacade.changeState(State.FINALIZED);
        System.out.println("Se cambio el estado a " + orderFacade.getOrder().getState());
        System.out.println("El valor total del pedido es: " + orderFacade.calculateTotal());
        System.out.println("Total de platos pedidos: " + orderFacade.totalDishes());

        //Ahora ejecutamos el cliente proxy, y le pasamos el sujeto que debe utilizar.
        ProxyClient client = new ProxyClient(orderProxy);
        client.createOrder();

    }

}
