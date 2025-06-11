package Classes;

import java.time.LocalDateTime;

public class Recomendacao {
    private int idRecomendacao;
    private int idUsuario;
    private int idRota;
    private String motivo;
    private LocalDateTime dataRecomendacao;

    public Recomendacao() {}

    public Recomendacao(int idRecomendacao, int idUsuario, int idRota, String motivo, LocalDateTime dataRecomendacao) {
        this.idRecomendacao = idRecomendacao;
        this.idUsuario = idUsuario;
        this.idRota = idRota;
        this.motivo = motivo;
        this.dataRecomendacao = dataRecomendacao;
    }

    public int getIdRecomendacao() {
        return idRecomendacao;
    }

    public void setIdRecomendacao(int idRecomendacao) {
        this.idRecomendacao = idRecomendacao;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public LocalDateTime getDataRecomendacao() {
        return dataRecomendacao;
    }

    public void setDataRecomendacao(LocalDateTime dataRecomendacao) {
        this.dataRecomendacao = dataRecomendacao;
    }
}
