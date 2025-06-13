package Paginas;

import Model.Usuario;
import dao.UsuarioDAO;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class Login extends JFrame {
    private JTextField campoEmail = new JTextField(20);
    private JPasswordField campoSenha = new JPasswordField(20);
    private JButton btnLogin = new JButton("Entrar");
    private JButton btnCadastro = new JButton("Cadastrar");

    public Login() {
        setTitle("BikeTour - Login");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.decode("#121212"));

        // Título
        JLabel titulo = new JLabel("BikeTour", SwingConstants.CENTER);
        titulo.setForeground(Color.decode("#FFD700"));
        titulo.setFont(new Font("Arial", Font.BOLD, 30));
        titulo.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        add(titulo, BorderLayout.NORTH);

        // Painel central com formulário
        JPanel painelCentro = new JPanel(new GridBagLayout());
        painelCentro.setBackground(Color.decode("#121212"));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Label Email
        gbc.gridx = 0;
        gbc.gridy = 0;
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setForeground(Color.WHITE);
        painelCentro.add(lblEmail, gbc);

        // Campo Email
        gbc.gridx = 1;
        painelCentro.add(campoEmail, gbc);

        // Label Senha
        gbc.gridx = 0;
        gbc.gridy = 1;
        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setForeground(Color.WHITE);
        painelCentro.add(lblSenha, gbc);

        // Campo Senha
        gbc.gridx = 1;
        painelCentro.add(campoSenha, gbc);

        // Painel botoes
        JPanel painelBotoes = new JPanel();
        painelBotoes.setBackground(Color.decode("#121212"));

        btnLogin.setBackground(Color.decode("#FFD700"));
        btnLogin.setForeground(Color.BLACK);
        btnCadastro.setBackground(Color.decode("#FFD700"));
        btnCadastro.setForeground(Color.BLACK);

        painelBotoes.add(btnLogin);
        painelBotoes.add(btnCadastro);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        painelCentro.add(painelBotoes, gbc);

        add(painelCentro, BorderLayout.CENTER);

        // Ações dos botões
        btnLogin.addActionListener(e -> realizarLogin());
        btnCadastro.addActionListener(e -> {
            new Cadastro();
            dispose();
        });

        setVisible(true);
    }

    private void realizarLogin() {
        String email = campoEmail.getText().trim();
        String senha = new String(campoSenha.getPassword());

        if(email.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, preencha email e senha.");
            return;
        }

        UsuarioDAO dao = new UsuarioDAO();
        Optional<Usuario> usuarioOpt = dao.buscarPorEmailESenha(email, senha);

        if (usuarioOpt.isPresent()) {
            Usuario usuario = usuarioOpt.get();
            JOptionPane.showMessageDialog(this, "Login bem-sucedido!");
            dispose();
            new TelaInicial(usuario.getNome());
        } else {
            JOptionPane.showMessageDialog(this, "Email ou senha inválidos.");
        }
    }
}
