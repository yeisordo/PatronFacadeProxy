/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.facade.domain.order;

import co.unicauca.patterns.proxy.IOrderService;
import co.unicauca.patterns.facade.access.IOrderRepository;
/**
 *
 * @author kevith bastidas
 */
public class OrderFacade implements IOrderService{
    private Order order;
    
    public void createOrder(Customer customer){
        this.order = new Order(customer);
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
        if (this.order!=null) {
            return this.order.calculateTotal();
        }
        return 0;
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
    
    @Override
    public void save(IOrderRepository repo){
        repo.createOrder(order);
    }
}
