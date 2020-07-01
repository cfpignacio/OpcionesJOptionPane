/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opciones;
import javax.swing.*;
/**
 *
 * @author Notebook
 */
public class Opciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        
        int resp = JOptionPane.showConfirmDialog(null,"Usas mucho java");
        System.out.println(JOptionPane.OK_OPTION);
        
        if (JOptionPane.OK_OPTION == resp){
            System.out.println("Selecciono una opción Afirmativa");
        }
        else{
            System.out.println("No selecciono una opción Afirmativa");

        }
        
        
        
    }
    
}
