/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.patronproxy.domain;

/**
 *
 * @author kevit
 */
public class Item {
    private Dish dish;
    private int amount;

    public Item(Dish dish, int amount) {
        this.dish = dish;
        this.amount = amount;
    }

    
    
    public Item() {
    }

    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    
}
