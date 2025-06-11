package Classes;

public class EstatisticaDeUso {
    private int idEstatistica;
    private int idRota;
    private int numeroVisualizacoes;
    private int numeroUsos;
    private int curtidas;

    public EstatisticaDeUso() {}

    public EstatisticaDeUso(int idEstatistica, int idRota, int numeroVisualizacoes, int numeroUsos, int curtidas) {
        this.idEstatistica = idEstatistica;
        this.idRota = idRota;
        this.numeroVisualizacoes = numeroVisualizacoes;
        this.numeroUsos = numeroUsos;
        this.curtidas = curtidas;
    }

    public int getIdEstatistica() {
        return idEstatistica;
    }

    public void setIdEstatistica(int idEstatistica) {
        this.idEstatistica = idEstatistica;
    }

    public int getIdRota() {
        return idRota;
    }

    public void setIdRota(int idRota) {
        this.idRota = idRota;
    }

    public int getNumeroVisualizacoes() {
        return numeroVisualizacoes;
    }

    public void setNumeroVisualizacoes(int numeroVisualizacoes) {
        this.numeroVisualizacoes = numeroVisualizacoes;
    }

    public int getNumeroUsos() {
        return numeroUsos;
    }

    public void setNumeroUsos(int numeroUsos) {
        this.numeroUsos = numeroUsos;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
}
