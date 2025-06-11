package Classes;

import java.time.LocalDateTime;

public class Avaliacao {
    private int idAvaliacao;
    private int idUsuario;
    private int idRota;
    private int nota;
    private String descricao;
    private LocalDateTime dataAvaliacao;

    public Avaliacao() {}

    public Avaliacao(int idAvaliacao, int idUsuario, int idRota, int nota, String descricao, LocalDateTime dataAvaliacao) {
        this.idAvaliacao = idAvaliacao;
        this.idUsuario = idUsuario;
        this.idRota = idRota;
        this.nota = nota;
        this.descricao = descricao;
        this.dataAvaliacao = dataAvaliacao;
    }

    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRota() {
        return idRota;
    }

    public void setIdRota(int idRota) {
        this.idRota = idRota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDateTime getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(LocalDateTime dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
}
