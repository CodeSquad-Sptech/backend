package br.com.code_squad.classes.model.infoArquivo.base.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.Base;

public abstract class Outros extends Base {
    private Integer estrangeiro;
    private Integer financiamento;
    private Integer deficiencia;

    public Outros(Integer id, Integer fk, Integer estrangeiro, Integer financiamento, Integer deficiencia) {
        super(id, fk);
        this.estrangeiro = estrangeiro;
        this.financiamento = financiamento;
        this.deficiencia = deficiencia;
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


}
