/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moldes;

import Logic.Producto;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;
/**
 *
 * @author tidae
 */
public class ProductoTableModel extends AbstractTableModel implements TableModel {
    String[] cols ={"Nombre","precio","Codigo","Tipo" };
    List<Producto> rows;

    public  ProductoTableModel(List<Producto> rows){
        this.rows=rows;
    }

    public int getColumnCount() {
        return 4;
    }

    public String getColumnName(int col){
        return cols[col];
    }

    public int getRowCount() {
        return rows.size();
    }
    
    public Object getValueAt(int row, int col) {
        Producto c = rows.get(row);
        java.text.DecimalFormat df = new java.text.DecimalFormat("####");
        switch (col){
            case 0: return c.getNombre();
            case 1:return c.getPrecio();
            case 2:return c.getCodigo();
            case 3:return c.getTipo();
            default: return "";
        }
    }    
    
}
