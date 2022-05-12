/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Application;

/*import Producto.presentation.Controller;
import Producto.presentation.Model;
import Producto.presentation.View;*/
import Menu.presentation.Controller;
import Menu.presentation.Model;
import Menu.presentation.View;

public class Proyecto1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try { 
       for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
           if ("Nimbus".equals(info.getName())) {   
               javax.swing.UIManager.setLookAndFeel(info.getClassName());
               break;
           }
       } catch (Exception ex) { 
    ex.printStackTrace(); 
}
       Model model = new Model();     
       View view = new View();
       Controller controller = new Controller(model, view);
       view.setVisible(true);
    }
    
}
