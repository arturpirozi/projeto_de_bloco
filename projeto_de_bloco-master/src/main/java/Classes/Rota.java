package Classes;

import java.time.LocalDateTime;

public class Rota {
    private int idRota;
    private String nome;
    private int idUsuarioCriador;
    private double distanciaKm;
    private String dificuldade;
    private String tipoTerreno;
    private LocalDateTime dataCriacao;
    private boolean visibilidade;

    public Rota() {}

    public Rota(int idRota, String nome, int idUsuarioCriador, double distanciaKm, String dificuldade,
                String tipoTerreno, LocalDateTime dataCriacao, boolean visibilidade) {
        this.idRota = idRota;
        this.nome = nome;
        this.idUsuarioCriador = idUsuarioCriador;
        this.distanciaKm = distanciaKm;
        this.dificuldade = dificuldade;
        this.tipoTerreno = tipoTerreno;
        this.dataCriacao = dataCriacao;
        this.visibilidade = visibilidade;
    }

    public int getIdRota() {
        return idRota;
    }

    public void setIdRota(int idRota) {
        this.idRota = idRota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdUsuarioCriador() {
        return idUsuarioCriador;
    }

    public void setIdUsuarioCriador(int idUsuarioCriador) {
        this.idUsuarioCriador = idUsuarioCriador;
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getTipoTerreno() {
        return tipoTerreno;
    }

    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public boolean isVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(boolean visibilidade) {
        this.visibilidade = visibilidade;
    }
}