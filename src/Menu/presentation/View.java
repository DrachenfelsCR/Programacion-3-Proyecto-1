/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu.presentation;

import Logic.Service;
import java.util.Observable;
import javax.swing.JFrame;

/**
 *
 * @author David
 */

public class View extends javax.swing.JFrame implements java.util.Observer {

    /**
     * Creates new form View
     */
    public View() {
        initComponents();
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
         jLabel_Empresa.setText(Service.instance().getEmpresa().getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonMenuProductos = new javax.swing.JButton();
        BotonMenuFacturacion = new javax.swing.JButton();
        EtiquetaTituloMenu = new javax.swing.JLabel();
        Cliente = new javax.swing.JButton();
        BotonFacturas = new javax.swing.JButton();
        jButton_Guardar = new javax.swing.JButton();
        jLabel_Empresa = new javax.swing.JLabel();

        BotonMenuProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonMenuProductos.setText("Sub-menu Productos");
        BotonMenuProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMenuProductosMouseClicked(evt);
            }
        });

        BotonMenuFacturacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonMenuFacturacion.setText("Sub-menu Facturacion");
        BotonMenuFacturacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonMenuFacturacionMouseClicked(evt);
            }
        });

        EtiquetaTituloMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EtiquetaTituloMenu.setText("Menu Principal");

        Cliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });

        BotonFacturas.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonFacturas.setText("Facturas");
        BotonFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonFacturasActionPerformed(evt);
            }
        });

        jButton_Guardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_Guardar.setText("Guardar");
        jButton_Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton_GuardarMouseClicked(evt);
            }
        });

        jLabel_Empresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jLabel_Empresa)
                        .addGap(96, 96, 96)
                        .addComponent(EtiquetaTituloMenu)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonMenuProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonMenuFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30))))
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(jButton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(EtiquetaTituloMenu)
                    .addComponent(jLabel_Empresa))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonMenuProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonMenuFacturacion, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 158, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonFacturas, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)))
                .addComponent(jButton_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMenuProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMenuProductosMouseClicked
            controller.ProductoShow();
    }//GEN-LAST:event_BotonMenuProductosMouseClicked

    private void BotonMenuFacturacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonMenuFacturacionMouseClicked
       
       controller.FacturacionShow();
    }//GEN-LAST:event_BotonMenuFacturacionMouseClicked

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        controller.ClienteShow();
    }//GEN-LAST:event_ClienteActionPerformed

    private void BotonFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonFacturasActionPerformed
        controller.FacturacionesShow();
    }//GEN-LAST:event_BotonFacturasActionPerformed

    private void jButton_GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_GuardarMouseClicked
      Service.instance().store();
    }//GEN-LAST:event_jButton_GuardarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {              
                new View().setVisible(true);               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonFacturas;
    private javax.swing.JButton BotonMenuFacturacion;
    private javax.swing.JButton BotonMenuProductos;
    private javax.swing.JButton Cliente;
    private javax.swing.JLabel EtiquetaTituloMenu;
    private javax.swing.JButton jButton_Guardar;
    private javax.swing.JLabel jLabel_Empresa;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object o1) {
       
    }
      Controller controller;
      Model model;
    
    public void setController(Controller controller){
        this.controller=controller;
        
    }

    public Controller getController() {
        return controller;
        
    }
    
    public void setModel(Model model){
        this.model=model;
         model.addObserver(this);
    }

    public Model getModel() {
        return model;
    }
}