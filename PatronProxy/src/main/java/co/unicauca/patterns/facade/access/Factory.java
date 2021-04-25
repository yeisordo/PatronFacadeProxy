/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.facade.access;

/**
 *
 * @author kevith bastidas
 */
public class Factory {
    /**
     * atributo con una sola instacia Factory
     */
    private static Factory instance;
    
    /**
     * Clase singleton
     *
     * @return retorna la instancia. Donde si se ah creado una vez no permitira que se vuelva a instanciar.
     */
    public static Factory getInstance(){
        if(instance==null){
            instance = new Factory();
        }
        return instance;
    }
    
    /**
     * Metodo que devuelve una instacia concreta de la interfaz IOrderRepository
     * @param type
     * @return 
     */
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
