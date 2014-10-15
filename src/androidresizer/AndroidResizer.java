/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package androidresizer;

import javax.swing.UIManager;

/**
 *
 * @author planys
 */
public class AndroidResizer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("TEST");
        try { 
    UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel"); 
} catch (Exception ex) { 
    ex.printStackTrace(); 
}
        new AResizerFrame().setVisible(true);
    }
    
}
