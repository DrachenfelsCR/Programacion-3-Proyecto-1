/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturas.presentation;

import Logic.Factura;

/**
 *
 * @author beto
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        model.setList(Logic.Service.instance().getListaFactura());
        view.setModel(model);
        view.setController(this);
    }
    
    
   
        public void buscar(Factura c){    
        model.setList( Logic.Service.instance().buscarFacturas(c));
        model.commit();        
    
    }
    
    public void show(){
        view.setVisible(true);
    }
}
