package Classes;

public class Mapa {
    private int idMapa;
    private int idRota;
    private String descricao;

    public Mapa() {}

    public Mapa(int idMapa, int idRota, String descricao) {
        this.idMapa = idMapa;
        this.idRota = idRota;
        this.descricao = descricao;
    }

    public int getIdMapa() {
        return idMapa;
    }

    public void setIdMapa(int idMapa) {
        this.idMapa = idMapa;
    }

    public int getIdRota() {
        return idRota;
    }

    public void setIdRota(int idRota) {
        this.idRota = idRota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
