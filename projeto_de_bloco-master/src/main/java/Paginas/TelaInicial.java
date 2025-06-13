package Paginas;

import javax.swing.*;
import java.awt.*;

public class TelaInicial extends JFrame {

    private JButton btnRotas = new JButton("Rotas");
    private JButton btnPerfil = new JButton("Perfil");
    private JButton btnConfiguracoes = new JButton("Configurações");

    public TelaInicial(String nomeUsuario) {
        setTitle("BikeTour - Tela Inicial");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#121212"));
        setLayout(new BorderLayout());

        // Título de boas-vindas
        JLabel lblBoasVindas = new JLabel("Bem-vindo, " + nomeUsuario + "!", SwingConstants.CENTER);
        lblBoasVindas.setFont(new Font("Arial", Font.BOLD, 24));
        lblBoasVindas.setForeground(Color.decode("#FFD700"));
        lblBoasVindas.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(lblBoasVindas, BorderLayout.NORTH);

        // Painel para botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.setBackground(Color.decode("#121212"));
        painelBotoes.setLayout(new GridLayout(3, 1, 10, 10));
        painelBotoes.setBorder(BorderFactory.createEmptyBorder(30, 50, 50, 50));

        // Configurações visuais dos botões
        configurarBotao(btnRotas);
        configurarBotao(btnPerfil);
        configurarBotao(btnConfiguracoes);

        // Adiciona botões no painel
        painelBotoes.add(btnRotas);
        painelBotoes.add(btnPerfil);
        painelBotoes.add(btnConfiguracoes);

        add(painelBotoes, BorderLayout.CENTER);

        // Ações dos botões
        btnRotas.addActionListener(e -> {
            new Rotas();
            dispose();
        });

        btnPerfil.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Página Perfil ainda não implementada.");
        });

        btnConfiguracoes.addActionListener(e -> {
            JOptionPane.showMessageDialog(this, "Página Configurações ainda não implementada.");
        });

        setVisible(true);
    }

    private void configurarBotao(JButton botao) {
        botao.setBackground(Color.decode("#FFD700"));
        botao.setForeground(Color.BLACK);
        botao.setFocusPainted(false);
        botao.setFont(new Font("Arial", Font.BOLD, 18));
    }
}
