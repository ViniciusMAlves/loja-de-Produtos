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
    private String nome;
    private ArrayList<Produto> produtos = new ArrayList<Produto>();
    private float totalPagar;
    private char status;
    private int id;

    public Venda(String nome, char status, int id) {
        this.nome = nome;
        this.status = status;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return "Venda :" + "\n nome=" + nome + "\n produtos=" + produtos + "\n totalPagar=" + totalPagar + "\n status=" + status + "\n id=" + id  ;
    }
    
    
}
