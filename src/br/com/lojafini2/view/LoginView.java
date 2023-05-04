package br.com.lojafini2.view;

import br.com.lojafini2.factory.DbException;
import br.com.lojafini2.services.Login;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginView extends JFrame {
    private JTextField txtLogin;
    private JPasswordField txtSenha;
    private JPanel mainPainel;
    private JButton btnButton;


    public LoginView() throws DbException {
        setContentPane(mainPainel);
        setTitle("Bem Vindo");
        setSize(300, 410);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);


//        LoginDao loginDao = new LoginDao();



        btnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = txtLogin.getText();
                String senha = txtSenha.getText();

//                try {
//                    Login login = loginDao.authentic(usuario, senha);
//                    if (login != null) {
//                        if (login.getTipoUsuario().equals("admin")) {
//                            System.out.println("Bem Vindo ADM");
//                            JOptionPane.showMessageDialog(null, "Admin Aceito");
//                            new AdminView();
//                        } else {
//                            System.out.println("Entrou");
//                            JOptionPane.showMessageDialog(null, "Bem-vindo Vendedor");
//                            new VendaView();
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Usuário ou senha errada", "Tente de Novo", JOptionPane.ERROR_MESSAGE);
//                        System.out.println("Não entrou");
//                    }
//
//                } catch (DbException ex) {
//                    throw new RuntimeException(ex);
//                }

                dispose();
            }

        });

    }


    public static void main(String[] args) throws DbException {






        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    new LoginView();
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }


}
