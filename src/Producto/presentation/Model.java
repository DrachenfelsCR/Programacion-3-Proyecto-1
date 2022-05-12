/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.presentation;

import Logic.Producto;
import Logic.Service;
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
    
    Producto actual;
    List<Producto> list;
    
    public Model() {
        this.actual = new Producto();
        this.list = new ArrayList<>();
    }
    

    public void setActual(Producto actual) {
        this.actual = actual;
    }

    public void setList(List<Producto> list) {
        this.list = list;
    }

    public Producto getActual() {
        return actual;
    }

    public List<Producto> getList() {
        return list;
    }
    

   
    
}
