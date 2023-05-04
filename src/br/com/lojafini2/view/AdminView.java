package br.com.lojafini2.view;

import br.com.lojafini2.data.model.Cliente;
import br.com.lojafini2.factory.connection.ClienteDao;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class AdminView extends JFrame{
    private JPanel mainPainel;
    private JTabbedPane tabbedPane1;
    private JButton cadastrarButton;
    private JButton alterarButton;
    private JButton excluirButton;
    private JButton cancelarButton;
    private JTextField txtID;
    private JTextField txtNome;
    private JTextField txtCPF;
    private JButton buscarButton;
    private JButton listarButton;
    private JRadioButton clienteRadioButton;
    private JRadioButton vendedorRadioButton;
    private JFormattedTextField txtNomeIngrediente;
    private JTextField txtPesoIngrediente;
    private JButton cadastrarButton1;
    private JButton consultarListaButton;
    private JTable table2;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton cadastrarButton2;
    private JButton alterarButton1;
    private JButton cancelarButton1;
    private JButton excluirButton1;
    private JButton listaProdutosButton;
    private JButton buscarButton1;
    private JTable table3;


    public AdminView() {
        setContentPane(mainPainel);
        setTitle("Bem Vindo");
        setSize(700,510);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Cliente cliente = new Cliente();
        ClienteDao clienteDao = new ClienteDao();

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (clienteRadioButton.isSelected()){
                    cliente.setNome(txtNome.getText());
                    cliente.setCpf(txtCPF.getText());
                    clienteDao.save(cliente);

                    clienteTableModel model = new clienteTableModel();


                }

            }
        });
        cadastrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        listarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    AdminView admView = new AdminView();
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }

    public static class clienteTableModel extends AbstractTableModel {

        private final String[] COLUMNS = {"Id", "Nome", "Cpf"};
        private final List<Cliente> clientes = new ArrayList<>();

        @Override
        public int getRowCount() {
            return clientes.size();
        }

        @Override
        public int getColumnCount() {
            return COLUMNS.length;
        }

        @Override
        public Object getValueAt(int linha, int coluna) {
            switch (coluna) {
                case 0:
                    return clientes.get(linha).getId();
                case 1:
                    return clientes.get(linha).getNome();
                case 2:
                    return clientes.get(linha).getCpf();
            }
            return null;
        }

        @Override
        public String getColumnName(int column) {
            return COLUMNS[column];
        }

        @Override
        public Class<?> getColumnClass(int columnIndex) {
            if (getValueAt(0, columnIndex) != null) {
                return getValueAt(0, columnIndex).getClass();

            } else {
                return Object.class;
            }
        }
    }


}
