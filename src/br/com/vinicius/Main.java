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
            produtos.add(new Produto(p.getId(), p.getNome(), p.getDescricao(), p.getStatus(), p.getValor()));
        }

        String men = "";
        for (Menu m : Menu.values()) {
            men += m.toString();
        }
        int codi;
        do {

            codi = Integer.parseInt(JOptionPane.showInputDialog(" " + men));

            switch (codi) {
                case 1: {

                    int id = Integer.parseInt(JOptionPane.showInputDialog("Qual é o sue ID de cliente :"));
                    Date dataCadastro = sdf.parse(JOptionPane.showInputDialog("Qual é a sua data de cadastro :"));
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
                        int p = Integer.parseInt(JOptionPane.showInputDialog(pro));

                        for (produto b : produto.values()) {
                            if (b.getId() == p) {
                                JOptionPane.showMessageDialog(null, "Você escolheu " + b.toString());
                            }
                        }

                    } while (JOptionPane.showConfirmDialog(null, "Deseja continuar ?") == 0);
                    break;
                }
                case 3: {
                    String nomclente = "";
                    for (Cliente clie : clientes) {
                        nomclente += "\n" + clientes.indexOf(clie) + " : " + clie.getNome();
                    }
                    int nome =Integer.parseInt( JOptionPane.showInputDialog("Qual é o codigo do cliente :" + nomclente));
                    Cliente nomecli=clientes.get(nome);
                    do {
                        char status = JOptionPane.showInputDialog("Qual é o Status do produto :").charAt(0);
                        String nomprod = "";
                        for (Produto prodi : produtos) {
                            nomprod += "\n" + produtos.indexOf(prodi) + " : " + prodi.getNome();
                        }

                        int id = Integer.parseInt(JOptionPane.showInputDialog("Qual é o sue ID da venda :" + nomprod));
                        vendas.add(new Venda(id, nomecli, status, status));

                        vendas.get(vendas.size() - 1).getProdutos().add(produtos.get(id));

                    } while (JOptionPane.showConfirmDialog(null, "Deseja continuar ?") == 0);

                    break;
                }
                case 4: {
                    do {
                        int consu = Integer.parseInt(JOptionPane.showInputDialog("Qual você deseja consutar "
                                + "\n1 : Clientes "
                                + "\n2 : Vendas "
                        ));
                        switch (consu) {
                            case 1: {
                                String nomcliente=" ";
                                for (Cliente clie : clientes) {
                                    nomcliente += "\n" + clientes.indexOf(clie) + " : " + clie.getNome();
                                }
                                int nomecon =Integer.parseInt( JOptionPane.showInputDialog("Qual é o codigo do seu nome :" + nomcliente));
                                
                                JOptionPane.showMessageDialog(null,clientes.get(nomecon));

                                break;
                            }
                            case 2: {
                                JOptionPane.showMessageDialog(null, vendas.toString());
                                break;
                            }
                        }

                    } while (JOptionPane.showConfirmDialog(null, "Deseja continuar ?") == 0);

                    break;
                }
                case 5: {
                    JOptionPane.showMessageDialog(null, "Tchal");
                    break;
                }
                default: {
                    JOptionPane.showMessageDialog(null, "codigo imcorreto!!!");
                    break;

                }

            }
        } while (codi != 5);

    }

}
