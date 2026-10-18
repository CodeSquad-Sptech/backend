package br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades;

public class QuantidadeConcluintesRaca {
    private Integer idQuantidadeConcluintesRaca;
    private Integer branca;
    private Integer preta;
    private Integer parda;
    private Integer amarela;
    private Integer indigena;
    private Integer corNaoDeclarada;
    private Integer fkInfoConcluintes;

    public Integer getIdQuantidadeConcluintesRaca() {

        return idQuantidadeConcluintesRaca;
    }

    public void setIdQuantidadeConcluintesRaca(Integer idQuantidadeConcluintesRaca) {
        this.idQuantidadeConcluintesRaca = idQuantidadeConcluintesRaca;
    }

    public Integer getBranca() {
        return branca;
    }

    public void setBranca(Integer branca) {
        this.branca = branca;
    }

    public Integer getPreta() {
        return preta;
    }

    public void setPreta(Integer preta) {
        this.preta = preta;
    }

    public Integer getParda() {
        return parda;
    }

    public void setParda(Integer parda) {
        this.parda = parda;
    }

    public Integer getAmarela() {
        return amarela;
    }

    public void setAmarela(Integer amarela) {
        this.amarela = amarela;
    }

    public Integer getIndigena() {
        return indigena;
    }

    public void setIndigena(Integer indigena) {
        this.indigena = indigena;
    }

    public Integer getCorNaoDeclarada() {
        return corNaoDeclarada;
    }

    public void setCorNaoDeclarada(Integer corNaoDeclarada) {
        this.corNaoDeclarada = corNaoDeclarada;
    }

    public Integer getFkInfoConcluintes() {
        return fkInfoConcluintes;
    }

    public void setFkInfoConcluintes(Integer fkInfoConcluintes) {
        this.fkInfoConcluintes = fkInfoConcluintes;
    }
}
