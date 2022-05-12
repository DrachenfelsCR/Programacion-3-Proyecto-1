/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;

@XmlAccessorType(XmlAccessType.FIELD)
public class Producto {
    @XmlID   
    private String Codigo;
    
    private String Tipo;
    private String Detalle;
    private float PrecioUnitario;
    private int Cantidad;

    public Producto(String Tipo, String Codigo, String Detalle, int PrecioUnitario) {
        this.Tipo = Tipo;
        this.Codigo = Codigo;
        this.Detalle = Detalle;
        this.PrecioUnitario = PrecioUnitario;
        this.Cantidad = 0;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public Producto() {

    }
    
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setNombre(String Detalle) {
        this.Detalle = Detalle;
    }

    public void setPrecio(float PrecioUnitario) {
        this.PrecioUnitario = PrecioUnitario;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Detalle;
    }

    public float getPrecio() {
        return PrecioUnitario;
    }
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.Codigo);
        return hash;
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
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.Codigo, other.Codigo)) {
            return false;
        }
        return true;
    }
    
    
}
