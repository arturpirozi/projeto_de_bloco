package Model;

public class Avaliacao {
    private int id;
    private int idRota;
    private int nota;

    public Avaliacao(int idRota, int nota) {
        this.idRota = idRota;
        this.nota = nota;
    }

    public int getId() {
        return id;
    }

    public int getIdRota() {
        return idRota;
    }

    public int getNota() {
        return nota;
    }
}
