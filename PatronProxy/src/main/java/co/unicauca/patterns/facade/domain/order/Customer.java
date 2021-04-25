/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.patterns.facade.domain.order;

/**
 *
 * @author kevith bastidas
 */
public class Customer {
    private int id;
    private String name;
    private String address;
    private String mobile;
    private String city;

    /**
     * constructor
     * @param id
     * @param name
     * @param address
     * @param mobile
     * @param city 
     */
    public Customer(int id, String name, String address, String mobile, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobile = mobile;
        this.city = city;
    }

    
    /**
     * constructor por defecto
     */
    public Customer() {
    }

    /**
     * Obtiene el id del customer
     * @return 
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica el id del customer
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre del customer
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Modifica el nombre del customer
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la direccion del customer
     * @return 
     */
    public String getAddress() {
        return address;
    }

    /**
     * Modifica la direccion del customer
     * @param address 
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Obtiene el numero de celular del customer
     * @return 
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Modifica el numero de celular del customer
     * @param mobile 
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Obtiene el nombre de la ciudad del customer
     * @return 
     */
    public String getCity() {
        return city;
    }

    /**
     * Modifica el nombre de la ciudad del customer
     * @param city 
     */
    public void setCity(String city) {
        this.city = city;
    }
    
    
}
