package br.com.code_squad.classes.model.infoArquivo;

public class Importacao {
    private Integer idImportacao;
    private String nomeArquivo;
    private String dataImportacao;
    private Integer fkUsuario;

    public Importacao(Integer idImportacao, String nomeArquivo, String dataImportacao, Integer fkUsuario) {
        this.idImportacao = idImportacao;
        this.nomeArquivo = nomeArquivo;
        this.dataImportacao = dataImportacao;
        this.fkUsuario = fkUsuario;
    }

    public Integer getIdImportacao() {
        return idImportacao;
    }

    public void setIdImportacao(Integer idImportacao) {
        this.idImportacao = idImportacao;
    }

    public String getNomeArquivo() {
        return nomeArquivo;
    }

    public void setNomeArquivo(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public String getDataImportacao() {
        return dataImportacao;
    }

    public void setDataImportacao(String dataImportacao) {
        this.dataImportacao = dataImportacao;
    }

    public Integer getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(Integer fkUsuario) {
        this.fkUsuario = fkUsuario;
    }
}
