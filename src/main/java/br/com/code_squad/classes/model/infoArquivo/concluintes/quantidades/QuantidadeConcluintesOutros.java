package br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades;

public class QuantidadeConcluintesOutros {
    private Integer idQuantidadeConcluintesOutros;
    private Integer estrangeiro;
    private Integer financiamento;
    private Integer deficiencia;
    private Integer fkInfoConcluintes;

    public Integer getIdQuantidadeConcluintesOutros() {
        return idQuantidadeConcluintesOutros;
    }

    public void setIdQuantidadeConcluintesOutros(Integer idQuantidadeConcluintesOutros) {
        this.idQuantidadeConcluintesOutros = idQuantidadeConcluintesOutros;
    }

    public Integer getEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(Integer estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public Integer getFinanciamento() {
        return financiamento;
    }

    public void setFinanciamento(Integer financiamento) {
        this.financiamento = financiamento;
    }

    public Integer getDeficiencia() {
        return deficiencia;
    }

    public void setDeficiencia(Integer deficiencia) {
        this.deficiencia = deficiencia;
    }

    public Integer getFkInfoConcluintes() {
        return fkInfoConcluintes;
    }

    public void setFkInfoConcluintes(Integer fkInfoConcluintes) {
        this.fkInfoConcluintes = fkInfoConcluintes;
    }
}
