package Paginas;

import Model.Usuario;
import dao.UsuarioDAO;
import util.Validador;

import javax.swing.*;
import java.awt.*;

public class Cadastro extends JFrame {
    private JTextField campoNome = new JTextField(20);
    private JTextField campoEmail = new JTextField(20);
    private JPasswordField campoSenha = new JPasswordField(20);
    private JButton botaoCadastrar = new JButton("Cadastrar");
    private JButton botaoVoltar = new JButton("Voltar ao Login");

    public Cadastro() {
        setTitle("BikeTour - Cadastro");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.decode("#121212"));

        // Título
        JLabel titulo = new JLabel("Cadastro", SwingConstants.CENTER);
        titulo.setForeground(Color.decode("#FFD700"));
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(titulo, BorderLayout.NORTH);

        // Painel formulário central
        JPanel painelCentro = new JPanel(new GridBagLayout());
        painelCentro.setBackground(Color.decode("#121212"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(12, 12, 12, 12);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Nome
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel lblNome = new JLabel("Nome:");
        lblNome.setForeground(Color.WHITE);
        painelCentro.add(lblNome, gbc);

        gbc.gridx = 1;
        painelCentro.add(campoNome, gbc);

        // Email
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setForeground(Color.WHITE);
        painelCentro.add(lblEmail, gbc);

        gbc.gridx = 1;
        painelCentro.add(campoEmail, gbc);

        // Senha
        gbc.gridx = 0;
        gbc.gridy = 2;
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setForeground(Color.WHITE);
        painelCentro.add(lblSenha, gbc);

        gbc.gridx = 1;
        painelCentro.add(campoSenha, gbc);

        // Painel dos botões
        JPanel painelBotoes = new JPanel();
        painelBotoes.setBackground(Color.decode("#121212"));

        botaoCadastrar.setBackground(Color.decode("#FFD700"));
        botaoCadastrar.setForeground(Color.BLACK);

        botaoVoltar.setBackground(Color.decode("#FFD700"));
        botaoVoltar.setForeground(Color.BLACK);

        painelBotoes.add(botaoCadastrar);
        painelBotoes.add(botaoVoltar);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        painelCentro.add(painelBotoes, gbc);

        add(painelCentro, BorderLayout.CENTER);

        // Ações dos botões
        botaoCadastrar.addActionListener(e -> cadastrarUsuario());
        botaoVoltar.addActionListener(e -> {
            new Login();
            dispose();
        });

        setVisible(true);
    }

    private void cadastrarUsuario() {
        String nome = campoNome.getText().trim();
        String email = campoEmail.getText().trim();
        String senha = new String(campoSenha.getPassword());

        if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha todos os campos.");
            return;
        }

        if (!Validador.emailValido(email)) {
            JOptionPane.showMessageDialog(this, "Email inválido.");
            return;
        }

        if (!Validador.senhaForte(senha)) {
            JOptionPane.showMessageDialog(this, "Senha fraca. Use ao menos 6 caracteres com letras e números.");
            return;
        }

        Usuario novoUsuario = new Usuario(nome, email, senha);
        UsuarioDAO dao = new UsuarioDAO();

        boolean sucesso = dao.cadastrar(novoUsuario);

        if (sucesso) {
            JOptionPane.showMessageDialog(this, "Cadastro realizado com sucesso para " + novoUsuario.getNome() + "!");
            dispose();
            new Login();
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar. Verifique se o email já está cadastrado.");
        }
    }
}
