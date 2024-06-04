package Somativa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

public class telaLerSaldo extends JFrame {
    private JTextField ganhosText;
    private JPanel painelLerSaldo;
    private JLabel digiteGanhos;
    private JTextField gastosText;
    private JLabel digiteGastos;
    private JButton registrarSaldo;

    telaLerSaldo()throws HeadlessException{
        setTitle("Gastos e Ganhos");
        setSize( 700, 400);
        setContentPane(painelLerSaldo);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //registar saldo botao
        registrarSaldo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeArquivoSaldo = "Somativa/FluxoDeCaixa.txt";
                // criando o escritor
                try {
                    FileWriter escritor = new FileWriter(nomeArquivoSaldo, true);
                    escritor.write(ganhosText.getText() + "|" + gastosText.getText() + "\n");
                    escritor.close();
                    JOptionPane.showMessageDialog(null, "Fluxo de Caixa registrado");
                    dispose();
                } catch (IOException ex) {
                    System.out.println("Ocorreu um erro ao criar o arquivo:" + ex.getMessage());
                }
            }
        });
    }
}
