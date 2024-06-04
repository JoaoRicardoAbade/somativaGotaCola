package Somativa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class telaEmpresaCadastro extends JFrame{
    private JPanel painelCadastroEmpresa;
    private JTextField nomeEmpresaTexto;
    private JLabel labelNomeEmpresa;
    private JTextField empresaCNPJtexto;
    private JLabel labelCNPJempresa;
    private JTextField quantFuncionariosTexto;
    private JButton botaoCadastrar;
    private JButton botaoCancelar;

    public telaEmpresaCadastro()throws HeadlessException{
        setSize(900, 600);
        setContentPane(painelCadastroEmpresa);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeArquivo = "Somativa/Cadastros.txt";
                try{
                    FileWriter escritor = new FileWriter(nomeArquivo, true);
                    escritor.write(nomeEmpresaTexto.getText() + "|" + empresaCNPJtexto.getText() + "|" + quantFuncionariosTexto.getText() + "\n");
                    escritor.close();
                    JOptionPane.showMessageDialog(null, "Empresa cadastrada");
                    dispose();
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });
    }
}
