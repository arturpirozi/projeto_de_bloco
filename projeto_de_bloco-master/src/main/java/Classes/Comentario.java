package Classes;

import java.time.LocalDateTime;

public class Comentario {
    private int idComentario;
    private int idUsuario;
    private int idRota;
    private String texto;
    private LocalDateTime dataComentario;

    public Comentario() {}

    public Comentario(int idComentario, int idUsuario, int idRota, String texto, LocalDateTime dataComentario) {
        this.idComentario = idComentario;
        this.idUsuario = idUsuario;
        this.idRota = idRota;
        this.texto = texto;
        this.dataComentario = dataComentario;
    }

    public int getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(int idComentario) {
        this.idComentario = idComentario;
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

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(LocalDateTime dataComentario) {
        this.dataComentario = dataComentario;
    }
}
