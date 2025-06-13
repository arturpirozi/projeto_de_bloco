package Model;

public class Rota {
    private int idRota;
    private String nome;
    private double distanciaKm;
    private String dificuldade;
    private String tipoTerreno;

    public Rota(int idRota, String nome, double distanciaKm, String dificuldade, String tipoTerreno) {
        this.idRota = idRota;
        this.nome = nome;
        this.distanciaKm = distanciaKm;
        this.dificuldade = dificuldade;
        this.tipoTerreno = tipoTerreno;
    }

    public Rota( String nome, double distancia, String dificuldade, String tipoTerreno) {
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

    @Override
    public String toString() {
        return nome + " (" + distanciaKm + " km, " + dificuldade + ", " + tipoTerreno + ")";
    }
}
