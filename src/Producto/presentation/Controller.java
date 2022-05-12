/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Producto.presentation;

import Logic.Producto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tidae
 */
public class Controller  {
    
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        model.setList(Logic.Service.instance().getListaProducto());
        view.setModel(model);
        view.setController(this);
    }

    
    public void guardarProducto() {
        Producto aux =new Producto();
        
        aux.setNombre(view.getNombre());
        aux.setCodigo(view.getCodigo());
        
        aux.setTipo(view.getTipos());
        
        model.setActual(aux);
        if(view.comprobarErrorPrecio()){
            aux.setPrecio(view.getPrecio());
            Logic.Service.instance().agregarProducto(aux);
            model.setList(Logic.Service.instance().getListaProducto());
        }
        model.commit();
    }
    
    public void seleccionar(int row){
        model.setActual(model.getList().get(row));
        model.commit();        
    }
    
    public void buscar(Producto c){    
        model.setList( Logic.Service.instance().buscarProductos(c));
        model.commit();        
    }
    
    public void actualizar(Producto c){
        Producto aux = Logic.Service.instance().buscarProducto(c);
        if(aux != null){
            
            aux.setNombre(view.getNombre());
            if(view.comprobarErrorPrecio()){
                aux.setPrecio(view.getPrecio());
            }
        }
        model.commit();       
        
    }
    public void show(){
        view.setVisible(true);
    }
    
}
