package dao;

import Model.Rota;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RotaDAO {

    private static final String ARQUIVO_JSON = "rotas.json";
    private Gson gson;

    public RotaDAO() {
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    // Inserir nova rota
    public boolean inserir(Rota rota) {
        List<Rota> rotas = listarRotas();

        // Gerar ID automático
        int novoId = rotas.stream()
                .mapToInt(Rota::getIdRota)
                .max()
                .orElse(0) + 1;
        rota.setIdRota(novoId);

        rotas.add(rota);
        return salvarLista(rotas);
    }

    // Listar todas as rotas
    public List<Rota> listarRotas() {
        try (FileReader reader = new FileReader(ARQUIVO_JSON)) {
            Type tipoLista = new TypeToken<List<Rota>>() {}.getType();
            List<Rota> rotas = gson.fromJson(reader, tipoLista);
            return rotas != null ? rotas : new ArrayList<>();
        } catch (IOException e) {
            return new ArrayList<>();
        }
    }

    // Buscar rota por ID
    public Rota buscarPorId(int idRota) {
        return listarRotas().stream()
                .filter(r -> r.getIdRota() == idRota)
                .findFirst()
                .orElse(null);
    }

    // Buscar rotas por nome (filtro)
    public List<Rota> buscarPorNome(String nomeBusca) {
        return listarRotas().stream()
                .filter(r -> r.getNome().toLowerCase().contains(nomeBusca.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Salvar toda a lista no JSON
    private boolean salvarLista(List<Rota> rotas) {
        try (FileWriter writer = new FileWriter(ARQUIVO_JSON)) {
            gson.toJson(rotas, writer);
            return true;
        } catch (IOException e) {
            System.err.println("Erro ao salvar rotas: " + e.getMessage());
            return false;
        }
    }
}
