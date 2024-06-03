package Somativa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class telaPrincipal extends JFrame {
    private JPanel painelPrincipal;
    private JButton cadastroEmpresaBtn;

    public telaPrincipal() throws HeadlessException {
        setSize(900, 600);
        setContentPane(painelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        cadastroEmpresaBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                telaEmpresaCadastro i= new telaEmpresaCadastro();
                setVisible(true);
                dispose();
            }
        });
    }
}