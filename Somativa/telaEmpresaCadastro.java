package Somativa;

import javax.swing.*;
import java.awt.*;

public class telaEmpresaCadastro extends JFrame{
    private JPanel painelCadastroEmpresa;
    private JTextField nomeEmpresaTexto;
    private JLabel labelNomeEmpresa;
    private JTextField empresaCNPJtexto;
    private JLabel labelCNPJempresa;
    private JTextField textField1;

    public telaEmpresaCadastro()throws HeadlessException{
        setSize(900, 600);
        setContentPane(painelCadastroEmpresa);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
