package Paginas;

import Model.Rota;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Rotas extends JFrame {

    private List<Rota> rotas = new ArrayList<>();

    private DefaultTableModel modeloTabela;
    private JTable tabelaRotas;
    private JTextField campoFiltro = new JTextField(15);
    private JButton btnFiltrar = new JButton("Filtrar");
    private JButton btnCadastrarRota = new JButton("Cadastrar Rota");

    public Rotas() {
        setTitle("BikeTour - Rotas");
        setSize(700, 450);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());
        getContentPane().setBackground(Color.decode("#121212"));

        JLabel titulo = new JLabel("Rotas Disponíveis", SwingConstants.CENTER);
        titulo.setForeground(Color.decode("#FFD700"));
        titulo.setFont(new Font("Arial", Font.BOLD, 28));
        titulo.setBorder(new EmptyBorder(20, 0, 20, 0));
        add(titulo, BorderLayout.NORTH);

        // Tabela com colunas
        String[] colunas = {"ID", "Nome", "Distância (km)", "Dificuldade", "Tipo Terreno"};
        modeloTabela = new DefaultTableModel(colunas, 0) {
            public boolean isCellEditable(int row, int column) {
                return false; // impedir edição direta
            }
        };
        tabelaRotas = new JTable(modeloTabela);
        tabelaRotas.setBackground(Color.decode("#1E1E1E"));
        tabelaRotas.setForeground(Color.WHITE);
        tabelaRotas.getTableHeader().setBackground(Color.decode("#FFD700"));
        tabelaRotas.getTableHeader().setForeground(Color.BLACK);
        JScrollPane scroll = new JScrollPane(tabelaRotas);
        add(scroll, BorderLayout.CENTER);

        // Painel inferior com filtros e botões
        JPanel painelInferior = new JPanel();
        painelInferior.setBackground(Color.decode("#121212"));
        painelInferior.setBorder(new EmptyBorder(10, 10, 10, 10));

        campoFiltro.setBackground(Color.decode("#1E1E1E"));
        campoFiltro.setForeground(Color.WHITE);
        campoFiltro.setCaretColor(Color.WHITE);

        btnFiltrar.setBackground(Color.decode("#FFD700"));
        btnFiltrar.setForeground(Color.BLACK);

        btnCadastrarRota.setBackground(Color.decode("#FFD700"));
        btnCadastrarRota.setForeground(Color.BLACK);

        painelInferior.add(new JLabel("Buscar:"));
        JLabel lblBuscar = new JLabel("Buscar:");
        lblBuscar.setForeground(Color.WHITE);
        painelInferior.add(lblBuscar);

        painelInferior.add(campoFiltro);
        painelInferior.add(btnFiltrar);
        painelInferior.add(btnCadastrarRota);

        add(painelInferior, BorderLayout.SOUTH);

        // Ações dos botões
        btnFiltrar.addActionListener(e -> filtrarRotas());
        btnCadastrarRota.addActionListener(e -> {
            new CadastroRotas();
            // opcional: atualizar tabela após fechar a janela de cadastro
        });

        // Pré-cadastro de algumas rotas
        precadastrarRotas();
        carregarTabela(rotas);

        setVisible(true);
    }

    private void precadastrarRotas() {
        rotas.add(new Rota(1, "Rota do Sol", 25.5, "Fácil", "Asfalto"));
        rotas.add(new Rota(2, "Trilha das Montanhas", 40.0, "Difícil", "Trilha"));
        rotas.add(new Rota(3, "Ciclo Urbano", 15.0, "Médio", "Misto"));
        rotas.add(new Rota(4, "Pedal do Lago", 30.2, "Fácil", "Asfalto"));
    }

    private void carregarTabela(List<Rota> listaRotas) {
        modeloTabela.setRowCount(0); // limpar tabela
        for (Rota r : listaRotas) {
            Object[] linha = {r.getIdRota(), r.getNome(), r.getDistanciaKm(), r.getDificuldade(), r.getTipoTerreno()};
            modeloTabela.addRow(linha);
        }
    }

    private void filtrarRotas() {
        String filtro = campoFiltro.getText().toLowerCase().trim();

        List<Rota> filtradas = rotas.stream()
                .filter(r -> r.getNome().toLowerCase().contains(filtro)
                        || r.getDificuldade().toLowerCase().contains(filtro)
                        || r.getTipoTerreno().toLowerCase().contains(filtro))
                .collect(Collectors.toList());

        carregarTabela(filtradas);
    }
    public void atualizarTabela() {
        carregarTabela(rotas);
    }
}
