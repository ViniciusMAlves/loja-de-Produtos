/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

/**
 *
 * @author vinicius.132217
 */
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private char status;
    private float valor;

    public Produto(int id, String nome, String descricao, char status, float valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    

    

    @Override
    public String toString() {
        return "Produto :" + "\n id=" + id + "\n nome=" + nome + "\n descrição=" + descricao + "\n valor=" + valor + "\n status=" + status+"\n" ;
    }
    
    
}
