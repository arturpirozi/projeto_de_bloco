package Paginas;

import Model.Rota;
import dao.RotaDAO;

import javax.swing.*;
import java.awt.*;

public class CadastroRotas extends JFrame {
    private JTextField campoNome = new JTextField();
    private JTextField campoDistancia = new JTextField();
    private JComboBox<String> comboDificuldade = new JComboBox<>(new String[]{"Fácil", "Média", "Difícil"});
    private JComboBox<String> comboTipoTerreno = new JComboBox<>(new String[]{"Asfalto", "Trilha", "Misto"});

    private JButton btnSalvar = new JButton("Salvar");
    private JButton btnCancelar = new JButton("Cancelar");

    public CadastroRotas() {
        setTitle("Cadastrar Nova Rota");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        getContentPane().setBackground(Color.decode("#121212"));
        setLayout(new GridLayout(6, 2, 10, 10));
        setResizable(false);

        add(criarLabel("Nome da Rota:"));
        add(campoNome);

        add(criarLabel("Distância (km):"));
        add(campoDistancia);

        add(criarLabel("Dificuldade:"));
        comboDificuldade.setBackground(Color.WHITE);
        add(comboDificuldade);

        add(criarLabel("Tipo de Terreno:"));
        comboTipoTerreno.setBackground(Color.WHITE);
        add(comboTipoTerreno);

        btnSalvar.setBackground(Color.decode("#FFD700"));
        btnCancelar.setBackground(Color.GRAY);
        btnSalvar.setForeground(Color.BLACK);
        btnCancelar.setForeground(Color.WHITE);
        add(btnSalvar);
        add(btnCancelar);

        btnSalvar.addActionListener(e -> salvarRota());
        btnCancelar.addActionListener(e -> dispose());

        setVisible(true);
    }

    private JLabel criarLabel(String texto) {
        JLabel label = new JLabel(texto);
        label.setForeground(Color.WHITE);
        return label;
    }

    private void salvarRota() {
        String nome = campoNome.getText().trim();
        String distanciaStr = campoDistancia.getText().trim();
        String dificuldade = (String) comboDificuldade.getSelectedItem();
        String tipoTerreno = (String) comboTipoTerreno.getSelectedItem();

        if (nome.isEmpty() || distanciaStr.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos.");
            return;
        }

        try {
            double distancia = Double.parseDouble(distanciaStr);
            Rota novaRota = new Rota(nome, distancia, dificuldade, tipoTerreno);

            RotaDAO dao = new RotaDAO();
            boolean sucesso = dao.inserir(novaRota);

            if (sucesso) {
                JOptionPane.showMessageDialog(this, "Rota cadastrada com sucesso!");
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Erro ao salvar a rota.");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Distância inválida.");
        }
    }
}
