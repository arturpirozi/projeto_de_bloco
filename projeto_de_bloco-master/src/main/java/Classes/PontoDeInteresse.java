package Classes;

import java.time.LocalDateTime;

public class PontoDeInteresse {
    private int idPonto;
    private int idRota;
    private String nome;
    private String tipo;
    private double latitude;
    private double longitude;

    public PontoDeInteresse() {}

    public PontoDeInteresse(int idPonto, int idRota, String nome, String tipo, double latitude, double longitude) {
        this.idPonto = idPonto;
        this.idRota = idRota;
        this.nome = nome;
        this.tipo = tipo;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public int getIdPonto() {
        return idPonto;
    }

    public void setIdPonto(int idPonto) {
        this.idPonto = idPonto;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
