package br.com.code_squad.classes.model.infoArquivo.base.quantidades;

public abstract class Rede {
    private Integer id;
    private Integer redePublica;
    private Integer redePrivada;
    private Integer fk;

    public Rede(Integer id, Integer redePublica, Integer redePrivada, Integer fk) {
        this.id = id;
        this.redePublica = redePublica;
        this.redePrivada = redePrivada;
        this.fk = fk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRedePublica() {
        return redePublica;
    }

    public void setRedePublica(Integer redePublica) {
        this.redePublica = redePublica;
    }

    public Integer getRedePrivada() {
        return redePrivada;
    }

    public void setRedePrivada(Integer redePrivada) {
        this.redePrivada = redePrivada;
    }

    public Integer getFk() {
        return fk;
    }

    public void setFk(Integer fk) {
        this.fk = fk;
    }
}
