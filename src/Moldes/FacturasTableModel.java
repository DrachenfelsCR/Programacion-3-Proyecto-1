/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Moldes;

import Logic.Factura;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author beto
 */
public class FacturasTableModel extends AbstractTableModel implements TableModel {
    String[] cols = {"CodigoFactura","NombreCliente","Cedula","Fecha Creacion"};
    private List<Factura> Facturas;
    public FacturasTableModel(List<Factura> lista){
        Facturas = lista;
    }
    public int getRowCount() {
       return Facturas.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    public String getColumnName(int col){
        return cols[col];
    }

    @Override
    public Object getValueAt(int i, int i1) {
       Factura f = Facturas.get(i);
        switch (i1){
            case 0: return f.getNumeroDeFactura();
            case 1:return f.getNombreCliente();
            case 2:return f.getIdCliente();
            case 3:return f.getFechaDeCreacion();
            default: return "";
    }
    }
    
}
