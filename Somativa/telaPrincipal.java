package Somativa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class telaPrincipal extends JFrame {
    private JPanel painelPrincipal;
    private JButton cadastroEmpresaBtn;

    public telaPrincipal() throws HeadlessException {
        setSize(900, 600);
        setContentPane(painelPrincipal);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        String nomeArquivo = "Somativa/Cadastro.txt";
//        try{
//            BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo));
//
//        }



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