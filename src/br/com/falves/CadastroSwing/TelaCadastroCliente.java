/**
 * @author falvesmac
 */

package br.com.falves.CadastroSwing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class TelaCadastroCliente {

  private JButton adicionarButton;
  private JButton atualizarButton;
  private JButton removerButton;
  private JButton limparButton;
  private JTextField txtName;
  private JTextField txtCpf;
  private JTextField txtTel;
  private JTable tabela;
  private JPanel painelPrincipal;

  private List<Cliente> clientes = new ArrayList<>();
  private DefaultTableModel tableModel;

  public TelaCadastroCliente() {

    String[] colunas = {"Nome", "CPF", "Telefone"};

    tableModel = new DefaultTableModel(colunas, 0);

    tabela.setModel(tableModel);

    adicionarButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String nome = txtName.getText();
        String cpf = txtCpf.getText();
        String tel = txtTel.getText();

        if (nome.isEmpty() || cpf.isEmpty()) {
          JOptionPane.showMessageDialog(painelPrincipal,"Nome e Cpf são obrigatórios! ", "Erro de validação", JOptionPane.ERROR_MESSAGE);
          return;
        }

        Cliente novoCliente = new Cliente(nome, cpf, tel);

        clientes.add(novoCliente);

        JOptionPane.showMessageDialog(painelPrincipal,"Cliente adicionado com sucesso! ", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

        limparCampos();

        atualizarTabela();
      }
    });


    removerButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int selectedRow = tabela.getSelectedRow();

        if (selectedRow == -1) {
          JOptionPane.showMessageDialog(painelPrincipal, "Por favor selecione um cliente para remover", "Nenhum cliente selecionado", JOptionPane.WARNING_MESSAGE);
          return;
        }

        int confirm = JOptionPane.showConfirmDialog(painelPrincipal, "Tem certeza que deseja remover o cliente selecionado?", "Confirmar seleção", JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
          clientes.remove(selectedRow);

          atualizarTabela();

          JOptionPane.showMessageDialog(painelPrincipal, "Cliente removido com sucesso!");
        }
      }
    });


    tabela.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);

        int selectedRow = tabela.getSelectedRow();

        if (selectedRow != -1) {
          Cliente clienteSelecionado = clientes.get(selectedRow);

          txtName.setText(clienteSelecionado.getNome());
          txtCpf.setText(clienteSelecionado.getCpf());
          txtTel.setText(clienteSelecionado.getTel());
        }
      }
    });


    atualizarButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int selectedRow = tabela.getSelectedRow();

        if (selectedRow == -1) {
          JOptionPane.showMessageDialog(painelPrincipal, "Por favor selecione um cliente para atualizar", "Nenhum cliente selecionado", JOptionPane.WARNING_MESSAGE);
          return;
        }

        String nome = txtName.getText();
        String cpf = txtCpf.getText();
        String tel = txtTel.getText();

        Cliente clienteParaAtualizar = clientes.get(selectedRow);

        clienteParaAtualizar.setNome(nome);
        clienteParaAtualizar.setCpf(cpf);
        clienteParaAtualizar.setTel(tel);

        atualizarTabela();

        JOptionPane.showMessageDialog(painelPrincipal, "Cliente atualizado com sucesso!");
        limparCampos();
      }
    });
    limparButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        limparCampos();
      }
    });
  }

  private void limparCampos() {
    txtName.setText("");
    txtCpf.setText("");
    txtTel.setText("");
  }

  private void atualizarTabela() {
    tableModel.setRowCount(0);

    for (Cliente cliente : clientes) {
      Object[] rowData = {
              cliente.getNome(),
              cliente.getCpf(),
              cliente.getTel()
      };

      tableModel.addRow(rowData);
    }
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame("Cadastro de Clientes");
    frame.setContentPane(new TelaCadastroCliente().painelPrincipal);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }
}