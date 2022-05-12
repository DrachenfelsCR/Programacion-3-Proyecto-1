/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Facturacion.Data.Data;
import Facturacion.Data.XmlPersister;
import java.util.ArrayList;
import java.util.List;

public class Service {
    private static Service theInstance;
    public static Service instance(){
        if (theInstance==null){ 
            theInstance=new Service();
        }
        return theInstance;
    }
    private Data data;

    public Service() {      
         try{
            data=XmlPersister.instance().load();
        }
        catch(Exception e){
            data =  new Data();
        }
    }
    
    public Producto buscarProducto(Producto o){
       
    for(Producto c:data.getListaProducto()) {if (c.equals(o)) return c;};
       return null;
    }

    public void agregarProducto(Producto p){
        if(buscarProducto(p) == null){
            data.ingresarProducto(p);
        }
    }
    
    public List<Producto> getListaProducto(){
        return data.getListaProducto();
    }

    
    public List<Producto> buscarProductos(Producto o){
        List<Producto> result = new ArrayList<>();
        for(Producto c:data.getListaProducto()) {if (c.getCodigo().equals(o.getCodigo())) result.add(c);};
        return result;
    }
    
    public List<Producto> buscarProductosNombre(Producto o){
        List<Producto> result = new ArrayList<>();
        for(Producto c:data.getListaProducto()) {if (c.getNombre().contains(o.getNombre())) result.add(c);};
        return result;
    }
    
    public List<Producto> buscarProductosNombre(String o){
        List<Producto> result = new ArrayList<>();
        for(Producto c:data.getListaProducto()) {if (c.getNombre().contains(o)) result.add(c);};
        return result;
    }
    
    public Producto buscarProductoCodigo(String str){
        for(Producto c:data.getListaProducto()) {if (c.getCodigo().equals(str)) return c;};
        return null;
    }
    
      public Producto buscarProductoNombre(String nombre){
        for(Producto c:data.getListaProducto()) {if (c.getCodigo().contains(nombre)) return c;};
        return null;
    }
    
    public Cliente buscarCliente(Cliente o){
       
    for(Cliente c:data.getListaCliente()) {if (c.getCedula().contains(o.getCedula())) return c;};
       return null;
    }
    
    public Cliente buscarClienteNombre(String n){
       
    for(Cliente c:data.getListaCliente()) {if (c.getCedula().equals(n) ) return c;};
       return null;
    }
    
    public Factura buscarFactura(Factura f){
        for(Factura ft:data.getListaFactura()) {if (ft.getNumeroDeFactura() == f.getNumeroDeFactura()) return ft;};
        return null;
    }  
    
      public Factura buscarIDFactura(String id){
        for(Factura ft:data.getListaFactura()) {if (ft.getNumeroDeFactura().equals(id)) return ft;};
        return null;
    }  

    public void agregarCliente(Cliente c){
        if(buscarCliente(c) == null){
            data.ingresarCliente(c);
    }
        }
        
    
    public List<Cliente> getListaCliente(){
        return data.getListaCliente();
    }

     public List<Factura> getListaFactura(){
        return data.getListaFactura();
    }
    
      public List<Factura> buscarFacturas(Factura o){
        List<Factura> result = new ArrayList<>();
        for(Factura f:data.getListaFactura()) {if (f.getNumeroDeFactura().contains(o.getNumeroDeFactura())) result.add(f);};
        return result;
    } 
   public List<Cliente> buscarClientes(Cliente o){
        List<Cliente> result = new ArrayList<>();
        for(Cliente c:data.getListaCliente()) {if (c.getCedula().contains(o.getCedula())) result.add(c);};
        return result;
    } 
   
   public void agregarFactura(Factura f){
        if(buscarFactura(f) == null){
            data.ingresarFactura(f);
        }
    }
   
   public int getSerieFactura()
   {
   return this.data.serieFacturas;
   }
   
   public void aumentarSerieFactura()
   {
   this.data.serieFacturas++;
   }
   
   public Empresa getEmpresa()
   {
   return this.data.getEmp();
   }
   
    public void store(){
        try{  XmlPersister.instance().store(data); }
        catch(Exception e){ 
            System.out.println("error");
        }
    }
    
    public void storeFac(Factura f, String p){
        try{  XmlPersister.instance().storeFactura(f,p); }
        catch(Exception e){ 
            System.out.println("error");
        }
    }
}
