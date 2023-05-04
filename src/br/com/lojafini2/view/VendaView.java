package br.com.lojafini2.view;

import javax.swing.*;

public class VendaView extends JFrame {

    private JPanel mainPainel;
    private JTabbedPane tabbedPane1;
    private JTextField txtConsultaCliente;
    private JButton consultarButton;
    private JTextField txtNome;
    private JTextField txtCpf;
    private JTextField txtEnde;
    private JButton CADASTRARButton;
    private JTable table1;
    private JTabbedPane tabbedPane2;
    private JTextField textField1;
    private JButton CONSULTARButton;
    private JButton TODOSButton;
    private JTable table2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;
    private JButton CRIARPRODUTOButton;
    private JTabbedPane tabbedPane3;
    private JComboBox comboBoxCliente;
    private JComboBox comboBoxProduto;
    private JButton ADDCARRINHOButton;
    private JButton COMPRAButton;
    private JTextPane textoCarrinho;
    private JTextField textField2;
    private JButton CONSULTARButton1;
    private JButton LISTARButton;
    private JTable table3;
    private JTextField textField3;
    private JButton IMPRIMIRButton;

    public VendaView() {
        setContentPane(mainPainel);
        setTitle("Bem Vindo");
        setSize(700,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    VendaView vendaView = new VendaView();
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
}
