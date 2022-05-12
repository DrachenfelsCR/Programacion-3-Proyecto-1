/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moldes;

import Logic.Cliente;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author tidae
 */
public class ClienteTableModel extends AbstractTableModel implements TableModel {
    String[] cols ={"Cedula","Nombre","Telefono","Correo","Direccion" };
    List<Cliente> rows;

    public  ClienteTableModel(List<Cliente> rows){
        this.rows=rows;
    }

    public int getColumnCount() {
        return 5;
    }

    public String getColumnName(int col){
        return cols[col];
    }

    public int getRowCount() {
        return rows.size();
    }
    
    public Object getValueAt(int row, int col) {
        Cliente c = rows.get(row);
        
        switch (col){
            case 0:return c.getCedula();
            case 1: return c.getNombre();  
            case 2:return c.getTelefono();
            case 3:return c.getCorreoElectronico();
            case 4:return c.getDireccion();
            default: return "";
        }
    }    
    
}
