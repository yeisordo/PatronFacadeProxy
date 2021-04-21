/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.patronfacade.domain;

import co.unicauca.patterns.patronfacade.domain.Customer;
import co.unicauca.patterns.patronfacade.domain.Dish;
import co.unicauca.patterns.patronfacade.domain.Item;
import co.unicauca.patterns.patronfacade.domain.order.stat.State;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author kevith bastidas
 */
public class Order {
    private int despatch;
    private Customer customer;
    private LocalDate date;
    private State state;
    private ArrayList<Item> details;

    public Order(Customer customer) {
        this.customer = customer;
        this.details = new ArrayList<>();
    }
    
    public void addDish(Dish dish, int amount){      
        this.details.add(new Item(dish, amount));
    }
    
    public int calculateTotal(){
        return 0;
    }

    public int getDespatch() {
        return despatch;
    }

    public void setDespatch(int despatch) {
        this.despatch = despatch;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public ArrayList<Item> getDetails() {
        return details;
    }

    public void setDetails(ArrayList<Item> details) {
        this.details = details;
    }
    
    
}
