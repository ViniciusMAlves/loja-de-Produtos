/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius.objeto;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author vinicius.132217
 */
public class Cliente extends Pessoas{
    private int id;
    private Date dataCadastro;
    private char status;
    private int idade;

    public Cliente(int id, Date dataCadastro, char status, String nome, String rg, String cpf, Date dataNascimento) {
        super(nome, rg, cpf, dataNascimento);
        this.id = id;
        this.dataCadastro = dataCadastro;
        this.status = status;
        this.idade = this.calculoIdade(dataNascimento);
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public static int calculoIdade(java.util.Date dataNasc ){
       Calendar dataNascimento = Calendar.getInstance();
       dataNascimento.setTime(dataNasc);
       Calendar hoje = Calendar.getInstance();
       
       int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR); 

    if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
      idade--;  
    } 
    else 
    { 
        if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH) && hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
            idade--; 
        }
    }

    return idade;
        
    }

    @Override
    public String toString() {
        return super.toString()+"Cliente :" + "\nid =" + id + "\n data de Cadastro =" + dataCadastro + "\n status =" + status + "\n idade =" + idade +"\n";
    }
    
    
}
