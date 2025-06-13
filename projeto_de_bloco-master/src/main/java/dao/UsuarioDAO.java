package dao;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import Model.Usuario;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UsuarioDAO {

    private static final String ARQUIVO = "usuarios.json";
    private ObjectMapper mapper;
    private List<Usuario> usuarios;

    public UsuarioDAO() {
        mapper = new ObjectMapper();
        usuarios = carregarUsuarios();
    }

    private List<Usuario> carregarUsuarios() {
        File arquivo = new File(ARQUIVO);
        if (!arquivo.exists()) {
            return new ArrayList<>();
        }
        try {
            return mapper.readValue(arquivo, new TypeReference<List<Usuario>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    private void salvarUsuarios() {
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(ARQUIVO), usuarios);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean cadastrar(Usuario usuario) {
        // Verificar se email já existe
        if (usuarios.stream().anyMatch(u -> u.getEmail().equalsIgnoreCase(usuario.getEmail()))) {
            System.out.println("Email já cadastrado.");
            return false;
        }
        usuarios.add(usuario);
        salvarUsuarios();
        return true;
    }

    public Optional<Usuario> buscarPorEmailESenha(String email, String senha) {
        return usuarios.stream()
                .filter(u -> u.getEmail().equalsIgnoreCase(email) && u.getSenha().equals(senha))
                .findFirst();
    }
}
