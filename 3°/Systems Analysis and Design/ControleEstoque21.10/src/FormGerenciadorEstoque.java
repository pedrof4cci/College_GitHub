import DAO.ProdutoDAO;
import Modelo.Produto;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormGerenciadorEstoque extends JFrame {
    private JPanel Principal;
    private JTextField TF_nome;
    private JTextField TF_quantidade;
    private JTextField TF_preco;
    private JButton adicionarButton;
    private JButton excluirButton;
    private JButton salvarAtualizarButton;
    private JTable table1;
    private JTextField TF_Total;
    private JButton cancelarButton;
    private JButton editarButton;

    ProdutoDAO produtoDao = new ProdutoDAO();
    static int id;

    //CRIAMOS UM ARRAY DE STRING PARA O RÓTULO DA TABELA
    String[] colunas = {"ID", "PRODUTO", "QUANTIDADE", "PREÇO", "TOTAL (R$)"};

    //INSERIRINDO O RÓTULO NA LINHA 0 DO OBJETO model
    DefaultTableModel model = new DefaultTableModel(colunas, 0);

    public FormGerenciadorEstoque(){
        setContentPane(Principal);
        table1.setModel(model);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 600);
        setTitle("Gerenciador de Estoque");
        setLocationRelativeTo(null);
        setVisible(true);

        excluirButton.setEnabled(false);
        cancelarButton.setEnabled(false);
        habilitarCampos(false);

        listarProdutos();
        limparCampos();

        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                habilitarCampos(true);
                adicionarButton.setEnabled(false);
                editarButton.setEnabled(false);
            }
        });
        salvarAtualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = TF_nome.getText().trim();

                if(nome.isEmpty()){
                    JOptionPane.showMessageDialog(null,
                            "O nome do Produto não pode ser vazio", "Erro", JOptionPane.ERROR_MESSAGE);
                    TF_nome.requestFocus();
                    return;
                }
                int quantidade = 0;
                double preco = 0.0;

                try {
                    quantidade = Integer.parseInt(TF_quantidade.getText().trim());
                    if(quantidade < 0){
                        JOptionPane.showMessageDialog(null,
                                "A quantidade do produto não pode ser negativo.",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                        TF_quantidade.requestFocus();
                        return;
                    }

                    preco = Double.parseDouble(TF_preco.getText().trim());
                    if(preco < 0){
                        JOptionPane.showMessageDialog(null,
                                "O preço do produto não pode ser negativo",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                        TF_preco.requestFocus();
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos para quantidade e preço.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                Produto produto = new Produto(nome, quantidade, preco);

                if(salvarAtualizarButton.getText().equals("Salvar")) {
                    //Salvar
                    if (produtoDao.inserir(produto)) {
                        JOptionPane.showMessageDialog(null,
                                "Produto Inserido com Sucesso!!!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Erro ao inserir o produto no Banco de Dados", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    //atualizar
                    produto.setId(id);
                    if (produtoDao.atualizar(produto)) {
                        JOptionPane.showMessageDialog(null,
                                "Produto Atualizado com Sucesso!!!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Erro ao atualizar o produto no Banco de Dados", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                    salvarAtualizarButton.setText("Salvar");
                }
                limparCampos();
                habilitarCampos(false);
                adicionarButton.setEnabled(true);
                listarProdutos();
            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                limparCampos();
                habilitarCampos(false);
                adicionarButton.setEnabled(true);
                salvarAtualizarButton.setText("Salvar");
                cancelarButton.setEnabled(false);
                excluirButton.setEnabled(false);
                table1.clearSelection();

                //editarButton.setEnabled(false);
            }
        });
        editarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int linhaSelecionada = table1.getSelectedRow();

                excluirButton.setEnabled(true);

                if (linhaSelecionada != -1) {
                    // Preenche os campos com os dados da linha selecionada
                    TF_nome.setText(table1.getValueAt(linhaSelecionada, 1).toString());
                    TF_quantidade.setText(table1.getValueAt(linhaSelecionada, 2).toString());
                    TF_preco.setText(table1.getValueAt(linhaSelecionada, 3).toString());
                    habilitarCampos(true);
                    id = Integer.parseInt(table1.getValueAt(linhaSelecionada, 0).toString());
                    salvarAtualizarButton.setText("Atualizar");
                    adicionarButton.setEnabled(false);
                }else{
                    adicionarButton.setEnabled(true);
                    excluirButton.setEnabled(false);
                    table1.clearSelection();
                    linhaSelecionada = -1;
                    JOptionPane.showMessageDialog(null,
                            "É necessário marcar uma linha para edição", "Erro", JOptionPane.ERROR_MESSAGE);
                }


            }
        });
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(
                        null,
                        "Realmente você deseja excluir? Não há retorno!!!",
                        "Confirmação para excluir o produto",
                        JOptionPane.YES_NO_OPTION
                );
                if (resposta == JOptionPane.YES_OPTION) {
                    if (produtoDao.excluir(id)) {
                        JOptionPane.showMessageDialog(null,
                                "Produto excluido com Sucesso!!!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Erro ao excluir o produto no Banco de Dados", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Você cancelou a operação.");
                }
                listarProdutos();
                cancelarButton.setEnabled(false);
                salvarAtualizarButton.setText("Salvar");
                salvarAtualizarButton.setEnabled(false);
                adicionarButton.setEnabled(true);
                excluirButton.setEnabled(false);
                habilitarCampos(false);
                limparCampos();
            }
        });
    }

    public void habilitarCampos(Boolean status){
        TF_nome.setEnabled(status);
        TF_quantidade.setEnabled(status);
        TF_preco.setEnabled(status);
        salvarAtualizarButton.setEnabled(status);
        cancelarButton.setEnabled(status);
    }
    public void limparCampos(){
        TF_nome.setText("");
        TF_quantidade.setText("");
        TF_preco.setText("");
    }
    public void listarProdutos(){
        model.setRowCount(0);
        double total = 0;
        for(Produto l : produtoDao.listarTodos()){
            Object[] linha = {
                    l.getId(),
                    l.getNome(),
                    l.getQuantidade(),
                    l.getPreco(),
                    l.getQuantidade() * l.getPreco()
            };
            total = total + (l.getPreco()*l.getQuantidade());
            model.addRow(linha);
        }
        TF_Total.setText(String.valueOf(total));
    }
}