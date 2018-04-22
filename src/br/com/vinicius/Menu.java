/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius;

import br.com.vinicius.objeto.Produto;
import java.util.ArrayList;

/**
 *
 * @author vinicius.132217
 */
public enum Menu {
   
    
    cadastroCli(1," : Cadastrar Cliente"),
    vendas(2," : vendas"),
    consuta(3," : Consutar"),
    sair(4," : Sair");
    
     private int cod;
     private String nome;

    private Menu(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "\n" + this.getCod() + this.getNome();
    }
     
     
    
    
    
}
