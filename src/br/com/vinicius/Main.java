/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.vinicius;

import br.com.vinicius.objeto.Cliente;
import br.com.vinicius.objeto.Produto;
import br.com.vinicius.objeto.Venda;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author vinicius.132217
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        int cod;
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Venda> vendas = new ArrayList<>();
        ArrayList<Produto> prod = new ArrayList<>();
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (produto p : produto.values()) {
            produtos.add(new Produto(p.getId(), p.getNome(), p.getDescricao(), (int) p.getValor(), p.getStatus()));
        }
        
        do {
            cod = Integer.parseInt(JOptionPane.showInputDialog("Escolha :"
                    + "\nCadastrar Cliente :1 "
                    + "\nCadastrar Produto :2"
                    + "\nVendas :3 "
                    + "\nConsutar :4 "
                    + "\nSair :5 "));
            
            switch (cod) {
                case 1: {
                    
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Qual é o sue ID de cliente :"));
                    Date dataCadastro = sdf.parse(JOptionPane.showInputDialog("Qual é a sua data de nascimento :"));
                    char status = JOptionPane.showInputDialog("Qual é o seu Status :").charAt(0);
                    String nome = JOptionPane.showInputDialog("Qual é o seu nome :");
                    String rg = JOptionPane.showInputDialog("Qual é o seu RG :");
                    String cpf = JOptionPane.showInputDialog("Qual é o seu CPF :");
                    Date dataNascimento = sdf.parse(JOptionPane.showInputDialog("Qual é a sua data de nascimento :"));
                    
                    clientes.add(new Cliente(id, dataCadastro, status, nome, rg, cpf, dataNascimento));
                    break;
                }
                case 2: {
                    do {
                        String pro = "";
                        for (produto b : produto.values()) {
                            pro += b.toString();
                        }
                        int escolha = Integer.parseInt(JOptionPane.showInputDialog(pro));
                        String valEscolha;
                        for (produto b : produto.values()) {
                            if (b.getId() == escolha) {
                                JOptionPane.showMessageDialog(null, "Você escolheu " + b.toString());
                            }
                        }
                        
                    } while (JOptionPane.showConfirmDialog(null, "Deseja continuar ?") == 0);
                    break;
                }
                case 3: {
                    do {
                        String nomclente = "";
                        for (Cliente clie : clientes) {
                            nomclente += "\n" + clientes.indexOf(clie) + " : " + clie.getNome();
                        }
                        String nome = JOptionPane.showInputDialog("Qual é o nome do cliente :" + nomclente);
                        char status = JOptionPane.showInputDialog("Qual é o Status do produto :").charAt(0);
                        int id = Integer.parseInt(JOptionPane.showInputDialog("Qual é o sue ID da venda :"));
                        vendas.add(new Venda(nome, status, id));
                        
                    } while (JOptionPane.showConfirmDialog(null, "Deseja continuar ?") == 0);
                    break;
                }
                case 4: {
                    do {
                        int consu = Integer.parseInt(JOptionPane.showInputDialog("Qual você deseja consutar "
                                + "\nCliente :1"
                                + "\nVendas :2"
                        ));
                        switch (consu) {
                            case 1: {
                                
                                break;
                            }
                            case 2: {
                                
                                break;
                            }
                        }
                        
                    } while (JOptionPane.showConfirmDialog(null, "Deseja continuar ?") == 0);
                    
                    break;
                }
                case 5: {
                    
                }
                default: {
                    
                }
                
            }
        } while (cod != 5);
        
        String menu = "";
        for (Menu b : Menu.values()) {
            menu += b.toString();
        }
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo que você quer : \n" + menu));

        /* int id = Integer.parseInt(JOptionPane.showInputDialog("Qual é o sue ID de cliente :"));
                        String nome = JOptionPane.showInputDialog("Qual é o seu nome :");
                        String descricao = JOptionPane.showInputDialog("Qual é a descrição :");
                        int valor = Integer.parseInt(JOptionPane.showInputDialog("Qual é o valor do produto :"));
                        char status = JOptionPane.showInputDialog("Qual é o seu Status :").charAt(0);
                        prod.add(new Produto(id, nome, descricao, valor, status));*/
    }
    
}
