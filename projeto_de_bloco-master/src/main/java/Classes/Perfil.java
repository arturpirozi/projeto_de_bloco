package Classes;

public class Perfil {
    private int idPerfil;
    private int idUsuario;
    private String nivelExperiencia;
    private String tipoTerrenoPreferido;
    private String objetivo;

    public Perfil() {}

    public Perfil(int idPerfil, int idUsuario, String nivelExperiencia, String tipoTerrenoPreferido, String objetivo) {
        this.idPerfil = idPerfil;
        this.idUsuario = idUsuario;
        this.nivelExperiencia = nivelExperiencia;
        this.tipoTerrenoPreferido = tipoTerrenoPreferido;
        this.objetivo = objetivo;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNivelExperiencia() {
        return nivelExperiencia;
    }

    public void setNivelExperiencia(String nivelExperiencia) {
        this.nivelExperiencia = nivelExperiencia;
    }

    public String getTipoTerrenoPreferido() {
        return tipoTerrenoPreferido;
    }

    public void setTipoTerrenoPreferido(String tipoTerrenoPreferido) {
        this.tipoTerrenoPreferido = tipoTerrenoPreferido;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
}
