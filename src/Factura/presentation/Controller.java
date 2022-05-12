/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factura.presentation;

import Facturacion.Data.Data;
import Logic.Factura;
import Logic.Producto;
import Logic.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.util.Date;
/**
 *
 * @author David
 */
public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
        List<Producto> nFactura = new ArrayList<>();
        model.setList(nFactura);
        view.setModel(model);
        view.setController(this);
    }
    
    public void agregarProducto(String strCode){
         try
         {
             Producto pFacturado = Logic.Service.instance().buscarProductoCodigo(strCode);
             if (pFacturado == null) {
                 Exception ex = new Exception("El producto no fue encontrado!");
                 throw ex;
             }
             else
             {
             this.model.getList().add(pFacturado);          
             }
         }
         catch(Exception ie)
         {
             
         }
    }
    
    public void removerProductos()
    {
    this.model.getList().clear();
    }
    
    public void guardarFactura(String noFac,String fVencimiento,String fPago, String fCreacion, int plazo, float tCambio, String nomCliente, float total, String id, String correo, String ubi, String tel)
    {
    Factura nFactura = new Factura(noFac,fVencimiento,fPago,fCreacion,plazo,tCambio, id, nomCliente); 
    nFactura.setTotal(total);
    nFactura.setCorreo(correo);
    nFactura.setUbicacion(ubi);
    nFactura.setTelefono(tel);
    int tam = this.model.getList().size();
    if (tam == 0) 
    {
    return;    
    }
    List<Producto> nlista;
    List<Producto> temp = this.model.getList();
    nlista = new ArrayList<>();
    int cantidad = 1;
    float totalP;
    float totalIva;
    float IVA;
    for (int i = 0; i < tam; i++) 
     {
         if (i+1 == tam) {
         Producto aux = temp.get(i);
         totalP = cantidad * aux.getPrecio();
         totalIva = totalP + (totalP * 0.13f);
         IVA = totalP * 0.13f;
         nFactura.aumentarTotal(totalIva);
         nFactura.aumentarIVA(IVA);
         aux.setCantidad(cantidad);
         nlista.add(aux);
         }
         else
         {   
         if (temp.get(i).getCodigo().equals(temp.get(i+1).getCodigo())) {
             cantidad++;
         }
         else
         {
         Producto aux = temp.get(i);
         aux.setCantidad(cantidad);
         totalP = cantidad * aux.getPrecio();
         totalIva = totalP + (totalP * 0.13f);
         IVA = totalP * 0.13f;
         nFactura.aumentarIVA(IVA);
         nFactura.aumentarTotal(totalIva);
         nlista.add(aux);
         cantidad = 1;
         }
         }
     }
    nFactura.setProductoList(nlista);
    Logic.Service.instance().agregarFactura(nFactura);
    model.commit();
    }
    
    public void show(){
        view.setVisible(true);
    }
    
    public float getTotal()
    {
        int tam = this.model.getList().size();
        float precioTotal = 0;
        for (int i = 0; i < tam; i++) 
        {
        precioTotal = precioTotal + this.model.getList().get(i).getPrecio();
        }
     return precioTotal;
    }
    
    public void volverAtras()
    {
        
    }
    
    public void verificarCliente(String id){
        Cliente aux = Logic.Service.instance().buscarClienteNombre(id);
        if(aux != null){
            String telefono = String.valueOf(aux.getTelefono());
            view.setNombreCliente(aux.getNombre(), aux.getCorreoElectronico(), aux.getDireccion(), telefono);
            view.cambiarEstadoId(true);
        }
        else{
            view.cambiarEstadoId(false);
            view.setNombreCliente("","","","");
        }
        
           
        
    }
   
}
