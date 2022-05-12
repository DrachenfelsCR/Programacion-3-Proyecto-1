/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.presentation;

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
        view.setModel(model);
        view.setController(this);
        initOptions();
        initCliente();
        initFacturas();
        
    }
    Producto.presentation.Model productoModel;
    Producto.presentation.Controller productoController;
    Producto.presentation.View productoView;
    //////////////////////////////////////////////
    Cliente.presentation.Model clienteModel;
    Cliente.presentation.Controller clienteController;
    Cliente.presentation.View clienteView;
    ///////////////////////////////////////////////
     Factura.presentation.Model FacturaModel = new Factura.presentation.Model();
     Factura.presentation.View FacturaView = new Factura.presentation.View();
     Factura.presentation.Controller FacturaController = new Factura.presentation.Controller(FacturaModel, FacturaView);
    ////////////////////////////////////////////////
     Facturas.presentation.Model FacturasModel = new Facturas.presentation.Model();
     Facturas.presentation.View FacturasView = new Facturas.presentation.View();
     Facturas.presentation.Controller FacturasController = new Facturas.presentation.Controller(FacturasModel, FacturasView);
       
       
    public void initOptions() {
      productoModel = new  Producto.presentation.Model();
      productoView = new  Producto.presentation.View();
      productoController = new  Producto.presentation.Controller(productoModel,productoView);
    }
   
     public void initCliente() {
        clienteModel = new Cliente.presentation.Model();
        clienteView = new Cliente.presentation.View();
        clienteController = new Cliente.presentation.Controller(clienteModel,clienteView);
    }
     public void initFacturacion(){
        FacturaModel = new Factura.presentation.Model();
        FacturaView = new Factura.presentation.View();
        FacturaController = new Factura.presentation.Controller(FacturaModel, FacturaView);
     }
     public void initFacturas(){
         FacturasModel = new Facturas.presentation.Model();
         FacturasView = new Facturas.presentation.View();
         FacturasController = new Facturas.presentation.Controller(FacturasModel, FacturasView);
     }
    public void ClienteShow(){
        clienteController.show();
    }
    public void ProductoShow(){
      productoController.show();
  }
    public void FacturacionShow(){
        FacturaController.show();
    }
    public void FacturacionesShow(){
        FacturasController.show();
    }
    public void MenuShow()
    {
    this.view.setVisible(true);
    }
    
    
}
