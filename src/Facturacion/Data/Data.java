/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facturacion.Data;
import Logic.Cliente;
import Logic.Empresa;
import Logic.Factura;
import Logic.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Data {
    private Empresa Emp;
    private List<Cliente> listaClientes;
    private List<Producto> listaProductos;
    private List<Factura> listaFacturas;
    public int serieFacturas;
    

    public  Empresa getEmp() {
        return Emp;
    }

    public void setEmp(Empresa Emp) {
        this.Emp = Emp;
    }

    public Data() {
        listaClientes = new ArrayList<>();
        listaProductos = new ArrayList<>();
        listaFacturas = new ArrayList<>();
        serieFacturas = 1000;
        Emp =  new Empresa("Grupo T1", "Heredia", 2222, "GrupoT1@gmail.com");
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public void setListaFacturas(List<Factura> listaFacturas) {
        this.listaFacturas = listaFacturas;
    }

    public int getSerieFacturas() {
        return serieFacturas;
    }

    public void setSerieFacturas(int serieFacturas) {
        this.serieFacturas = serieFacturas;
    }
    
    public void ingresarCliente(Cliente c){
        listaClientes.add(c);
    }
    
    public List<Cliente> getListaCliente(){
        return listaClientes;
    }
    
    public void ingresarProducto(Producto p){
        listaProductos.add(p);
    }
    
    public List<Producto> getListaProducto(){
        return listaProductos;
    }
    
     public void ingresarFactura(Factura f){
        listaFacturas.add(f);
    }
    
    public List<Factura> getListaFactura(){
        return listaFacturas;
    }
}
