/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bol9.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Comparación { 
    private float base;
    private float altura;

    public void introducirDatos() {
        do {
            String dato = JOptionPane.showInputDialog("Teclear Base.");
            this.base = Float.parseFloat(dato);
        } while (this.validarDato(base));
        do {
            String dato2 = JOptionPane.showInputDialog("Teclear Altura.");
            this.altura = Float.parseFloat(dato2);
        } while (this.validarDato(altura));
        Float area = base * altura;
        JOptionPane.showMessageDialog(null, "Área= " + area);
    }

    private boolean validarDato(float dato) {
        if (dato <= 0) {
            JOptionPane.showMessageDialog(null, "ERROR");
            return true;
        } else {
            return false;
        }
    }
    
}
