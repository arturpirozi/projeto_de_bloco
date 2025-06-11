package Classes;

import java.time.LocalDateTime;

public class ExportacaoOffline {
    private int idExportacao;
    private int idRota;
    private String formato;
    private LocalDateTime dataExportacao;

    public ExportacaoOffline() {}

    public ExportacaoOffline(int idExportacao, int idRota, String formato, LocalDateTime dataExportacao) {
        this.idExportacao = idExportacao;
        this.idRota = idRota;
        this.formato = formato;
        this.dataExportacao = dataExportacao;
    }

    public int getIdExportacao() {
        return idExportacao;
    }

    public void setIdExportacao(int idExportacao) {
        this.idExportacao = idExportacao;
    }

    public int getIdRota() {
        return idRota;
    }

    public void setIdRota(int idRota) {
        this.idRota = idRota;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public LocalDateTime getDataExportacao() {
        return dataExportacao;
    }

    public void setDataExportacao(LocalDateTime dataExportacao) {
        this.dataExportacao = dataExportacao;
    }
}
