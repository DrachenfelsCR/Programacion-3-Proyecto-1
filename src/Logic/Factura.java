/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Logic;
//Cambiado atributo numeroFact de int a string
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Factura {
    
 @XmlID
    private String NumeroConsecutivo;
    private String FechaEmision;
    private String FechaVencimiento;
    private Empresa Emisor;   
    private int plazoMeses;
    private float tipoDeCambio;   
    private String Receptor;
    private String Identificacion;
    private String Correo;
    private String Ubicacion;
    private String Telefono;
    private String MedioDePago; 
    private List<Producto> listaComprados; 
    private float SubTotal;
    private float MontoTotal;
    private float Impuesto;
    
     public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }  
     public Empresa getEmp() {
        return Emisor;
    }

    public void setEmp(Empresa Emp) {
        this.Emisor = Emp;
    }
    public float getIVA() {
        return Impuesto;
    }

    public void setIVA(float Impuesto) {
        this.Impuesto = Impuesto;
    }
    
    public void aumentarIVA(float Impuesto) {
        this.Impuesto = this.Impuesto + Impuesto;
    }
    public float getTotalIVA() {
        return MontoTotal;
    }

    public void setTotalIVA(float MontoTotal) {
        this.MontoTotal = MontoTotal;
    }
    public void aumentarTotal(float MontoTotal) {
        this.MontoTotal = this.MontoTotal + MontoTotal;
    }
    
    
    public List<Producto> getListaComprados() {
        return listaComprados;
    }

    public void setListaComprados(List<Producto> listaComprados) {
        this.listaComprados = listaComprados;
    }
   
    
     public Factura(String NumeroConsecutivo, String FechaVencimiento, String MedioDePago, String FechaEmision, int plazoMeses, float tipoDeCambio, String id, String nomCliente) {
        this.NumeroConsecutivo = NumeroConsecutivo;
        this.FechaVencimiento = FechaVencimiento;
        this.MedioDePago = MedioDePago;
        this.FechaEmision = FechaEmision;
        this.plazoMeses = plazoMeses;
        this.tipoDeCambio = tipoDeCambio;
        this.Identificacion = id;
        this.Receptor = nomCliente;
        this.listaComprados = new ArrayList<>();
        this.Emisor =  new Empresa("Grupo T1", "Heredia", 2222, "GrupoT1@gmail.com");
    }

    public Factura() {
        this.NumeroConsecutivo = "";
        this.FechaVencimiento = "";
        this.MedioDePago = "";
        this.FechaEmision = "";
        this.plazoMeses = 0;
        this.tipoDeCambio = 0;
        this.Emisor =  new Empresa("Grupo T1", "Heredia", 2222, "GrupoT1@gmail.com");
    }

    public float getTotal() {
        return SubTotal;
    }

    public void setTotal(float SubTotal) {
        this.SubTotal = SubTotal;
    }
    
    public String getNombreCliente() {
        return Receptor;
    }

    public void setNombreCliente(String Receptor) {
        this.Receptor = Receptor;
    }

    public String getIdCliente() {
        return Identificacion;
    }

    public void setIdCliente(String Identificacion) {
        this.Identificacion = Identificacion;
    }
    public void setProductoList(List<Producto> lp)
    {
        this.listaComprados = lp;
    }

    public void setNumeroDeFactura(String NumeroConsecutivo) {
        this.NumeroConsecutivo = NumeroConsecutivo;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public void setFormaDePago(String MedioDePago) {
        this.MedioDePago = MedioDePago;
    }

    public void setFechaDeCreacion(String FechaEmision) {
        this.FechaEmision = FechaEmision;
    }

    public void setPlazoMeses(int plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public void setTipoDeCambio(float tipoDeCambio) {
        this.tipoDeCambio = tipoDeCambio;
    }

    public String getNumeroDeFactura() {
        return NumeroConsecutivo;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public String getFormaDePago() {
        return MedioDePago;
    }

    public String getFechaDeCreacion() {
        return FechaEmision;
    }

    public int getPlazoMeses() {
        return plazoMeses;
    }

    public float getTipoDeCambio() {
        return tipoDeCambio;
    }
    public void ingresarProducto(Producto p) {
        this.listaComprados.add(p);
    }
    
    public List<Producto> getList() {
        return  this.listaComprados;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Factura other = (Factura) obj;
        if (this.NumeroConsecutivo != other.NumeroConsecutivo) {
            return false;
        }
        return true;
    }
  
      
}
