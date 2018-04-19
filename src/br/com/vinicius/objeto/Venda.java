/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

import java.util.ArrayList;

/**
 *
 * @author vinicius.132217
 */
public class Venda {
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private int id;
    private Cliente nomecli;
    private char status;
    private float totalPagar;

    public Venda(int id, Cliente nomecli, char status, float totalPagar) {
        this.id = id;
        this.nomecli = nomecli;
        this.status = status;
        this.totalPagar = totalPagar;
    }

    public Cliente getNomecli() {
        return nomecli;
    }

    public void setNomecli(Cliente nomecli) {
        this.nomecli = nomecli;
    }

   

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
   

    @Override
    public String toString() {
        
       
        return " Venda :" + "\n nome=" + nomecli + "\n produtos=" + produtos + "\n total a Pagar=" + totalPagar + "\n status=" + status + "\n ID=" + id+"\n "  ;
        
    }
     
    
    
}
