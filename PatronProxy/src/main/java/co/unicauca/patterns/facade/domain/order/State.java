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
public enum State {
    NEW,
    CONFIRMED,
    DISPACHED,
    FINALIZED,
    CANCELLED
}
