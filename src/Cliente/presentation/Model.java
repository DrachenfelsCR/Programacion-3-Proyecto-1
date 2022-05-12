/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.presentation;

import Logic.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author tidae
 */
public class Model extends Observable{
    
    //Metodos implementados para el patron observador
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }
    
    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }
    //Metodos implementados para el patron observador
    
    Cliente actual;
    List<Cliente> list;
    
    public Model() {
        this.actual = new Cliente();
        this.list = new ArrayList<>();
    }
    

    public void setActual(Cliente actual) {
        this.actual = actual;
    }

    public void setList(List<Cliente> list) {
        this.list = list;
    }

    public Cliente getActual() {
        return actual;
    }

    public List<Cliente> getList() {
        return list;
    }
    

   
    
}
