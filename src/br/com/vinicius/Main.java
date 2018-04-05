/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius;

import javax.swing.JOptionPane;

/**
 *
 * @author vinicius.132217
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String menu = "";
        for (Menu b : Menu.values()) {
            menu += b.toString();
        }
       int escolha =Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo que você quer : \n"+ menu));
       
    }
    
}
