/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente.presentation;

import Logic.Cliente;



/**
 *
 * @author tidae
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        model.setList(Logic.Service.instance().getListaCliente());
        view.setModel(model);
        view.setController(this);
    }

    
    public void guardarCliente() {
        Cliente aux =new Cliente();
        
        aux.setNombre(view.getNombre());
        aux.setCedula(view.getCedula());
        aux.setDireccion(view.getDireccion());
        aux.setCorreoElectronico(view.getCorreo());
        
        if(view.comprobarErrorTelefono()){
            aux.setTelefono(view.getTelefono());
            Logic.Service.instance().agregarCliente(aux);
            model.setList(Logic.Service.instance().getListaCliente());
        }
        
        
        model.setActual(aux);
        model.commit();
    }
    
    public void seleccionar(int row){
        model.setActual(model.getList().get(row));
        model.commit();        
    }
    
    public void buscar(Cliente c){    
        model.setList( Logic.Service.instance().buscarClientes(c));
        model.commit();        
    }
    
    public void actualizar(Cliente c){
        Cliente aux = Logic.Service.instance().buscarCliente(c);
        if(aux != null){
            aux.setNombre(view.getNombre());
            aux.setCedula(view.getCedula());
            aux.setDireccion(view.getDireccion());
            aux.setCorreoElectronico(view.getCorreo());
        
            if(view.comprobarErrorTelefono()){
                aux.setTelefono(view.getTelefono());
                
            }
            
        }
        model.commit();       
        
    }
    public void show(){
        view.setVisible(true);
    }
}
