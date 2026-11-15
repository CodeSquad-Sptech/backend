package br.com.code_squad.classes.model.infoArquivo.base.quantidades;

public abstract class Outros{
    private Integer id;
    private Integer estrangeiro;
    private Integer financiamento;
    private Integer deficiencia;
    private Integer fk;

    public Outros(Integer id, Integer estrangeiro, Integer financiamento, Integer deficiencia, Integer fk) {
        this.id = id;
        this.estrangeiro = estrangeiro;
        this.financiamento = financiamento;
        this.deficiencia = deficiencia;
        this.fk = fk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getFk() {
        return fk;
    }

    public void setFk(Integer fk) {
        this.fk = fk;
    }
}
