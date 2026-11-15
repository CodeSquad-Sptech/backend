package br.com.code_squad.classes.model.infoArquivo.base.quantidades;

public abstract class Raca {
    private Integer id;
    private Integer branca;
    private Integer preta;
    private Integer parda;
    private Integer amarela;
    private Integer indigena;
    private Integer corNaoDeclarada;
    private Integer fk;

    public Raca(Integer id, Integer branca, Integer preta, Integer parda, Integer amarela, Integer indigena, Integer corNaoDeclarada, Integer fk) {
        this.id = id;
        this.branca = branca;
        this.preta = preta;
        this.parda = parda;
        this.amarela = amarela;
        this.indigena = indigena;
        this.corNaoDeclarada = corNaoDeclarada;
        this.fk = fk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getFk() {
        return fk;
    }

    public void setFk(Integer fk) {
        this.fk = fk;
    }
}
