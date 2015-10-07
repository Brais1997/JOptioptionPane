/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jopytionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author balvarezescudero
 */
public class Jopytionpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       float base,altura;
        
      String resposta =JOptionPane.showInputDialog("base");
      base= Float.parseFloat(resposta);
      String billy =JOptionPane.showInputDialog("altura");
      altura= Float.parseFloat(billy);
      JOptionPane.showMessageDialog(null,"base="+base*altura);
    }
    
}
