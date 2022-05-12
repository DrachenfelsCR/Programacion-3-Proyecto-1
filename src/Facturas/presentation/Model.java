/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturas.presentation;

import Logic.Factura;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author beto
 */
public class Model extends Observable {
    @Override
    public synchronized void addObserver(Observer o) {
        super.addObserver(o); 
        this.commit();
    }
    
    public void commit(){
        this.setChanged();
        this.notifyObservers();        
    }
    
    Factura Actual;
    List<Factura> list;

    public Model(){
        this.Actual = new Factura();
        this.list = new ArrayList<>();
    }
    public void setActual(Factura Actual) {
        this.Actual = Actual;
    }

    public void setList(List<Factura> list) {
        this.list = list;
    }

    public Factura getActual() {
        return Actual;
    }

    public List<Factura> getList() {
        return list;
    }
    
    
    
    
    
    
    
    
    
}
