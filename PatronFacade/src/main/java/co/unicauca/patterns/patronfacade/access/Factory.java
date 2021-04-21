/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.patronfacade.access;

/**
 *
 * @author kevit
 */
public class Factory {
    private static Factory instance;
    
    public static Factory getInstance(){
        if(instance==null){
            instance = new Factory();
        }
        return instance;
    }
    
    public IOrderRepository getRepository(String type){
        if(type.equals("")){
           type = "default"; 
        }
        switch(type){
            case "default":
                return new OrderRepositoryImplArrays();
        }
        return null;
    }
}
