/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.patronfacade.domain;

import co.unicauca.patterns.patronfacade.access.IOrderRepository;
import co.unicauca.patterns.patronfacade.domain.order.stat.State;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
/**
 *
 * @author kevith bastidas
 */
public class OrderFacade {
    private Order order;
    
    public void createOrder(Customer customer){
        this.order = new Order(customer);
        changeState(State.NEW);
    }
    
    public void addDish(Dish dish, int amount){
        if (this.order!=null) {
            this.order.addDish(dish, amount);
        }
    }
    public void changeState(State state){
        if (this.order!=null) {
            this.order.setState(state);
        }
    }
    
    public void cancelOrder(){
        changeState(State.CANCELLED);
    }
    public int calculateTotal(){
        int total = 0;
        if (this.order!=null) {
            for (Item item : this.order.getDetails()) {
                total += item.getDish().getPrice() * item.getAmount();
            }
        }
        return total;
    }
    
    public Order getOrder(){
        return this.order;
    }
    
    public int totalDishes(){
        int totalDish = 0;
        if (this.order!=null) {
            totalDish = this.order.getDetails().size();
        }
        return totalDish;
    }
    
    public void save(IOrderRepository repo){
        repo.createOrder(order);
        
//        Logger logger= LoggerFactory.getLogger(OrderFacade.class); 
//        
//        String message = "Pedido guardado en la base de datos";   
//        logger.info(message); 
    }
}