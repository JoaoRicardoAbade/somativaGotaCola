package Somativa;

import javax.swing.*;
import java.awt.*;

public class telaLerSaldo extends JFrame {
    private JTextField ganhosText;
    private JPanel painelLerSaldo;
    private JLabel digiteGanhos;
    private JTextField gastosText;
    private JLabel digiteGastos;

    telaLerSaldo()throws HeadlessException{
        setTitle("Gastos e Ganhos");
        setSize( 450, 250);
        setContentPane(painelLerSaldo);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
}
