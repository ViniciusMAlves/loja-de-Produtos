/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius;

/**
 *
 * @author vinicius.132217
 */
public enum produto {
    TVLG(1,"Televisão LG 32","",'a', (float) 150.00),
    TVPhilco(2,"Televisão Philco 49","Smart TV LED 49\" Philco Full HD",'a', (float) 1799.99),
    TVSamsung(3,"Televisão Samsung 32","Smart TV LED 32\" HD Samsung com Connect Share Movie",'a', (float) 1091.99),
    ComputadorE(4,"Computador EasyPC","Intel Core I3 4GB 1TB Monitor 19\" ",'a', (float) 1445.55),
    ComputadorP(5,"Computador Positivo","All In One Positivo UD3630 Intel Dual Core 4GB 32GB SSD LED 18,5\" - Windows 10",'a', (float) 1199.99),
    ComputadorL(6,"Computador Lenovo","All in One Lenovo IdeaCentre AIO 510 - Intel Core i3 4GB 1TB LCD 21,5” Windows 10",'a', (float) 2374.05),
    NotebookM(7,"Notebook PC MIX","Dual Core 4GB 32GB SSD Tela 14” Linux",'a', (float) 773.01),
    NotebookS(8,"Notebook Samsung","Essentials E21 Intel Celeron Dual Core 4GB 500GB Tela LED FULL HD 15.6\" Windows 10",'a', (float) 1377.49),
    NotebookA(9,"Notebook Acer","ES1-572-347R Intel Core i3 4GB 500GB Tela HD 15,6\" Windows 10",'a', (float) 1567.49),
    Celular(10,"Celular Motorola","Smartphone Motorola Moto G5s XT1792 Platinum com 32GB",'a', (float) 747.12);
    
    private int id;
    private String nome;
    private String descricao;
    private char status;
    private float valor;

    private produto(int id, String nome, String descricao, char status, float valor) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.status = status;
        this.valor = valor;
    }

    
    
    public int getId() {
        return id;
    }

    public char getStatus() {
        return status;
    }
    

    
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", status=" + status + ", valor=" + valor + '}';
    }
    
}
