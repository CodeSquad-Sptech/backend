package br.com.code_squad.classes.model.infoArquivo.base.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.Base;

public abstract class Rede extends Base {
    private Integer redePublica;
    private Integer redePrivada;

    public Rede(Integer id, Integer fk, Integer redePublica, Integer redePrivada) {
        super(id, fk);
        this.redePublica = redePublica;
        this.redePrivada = redePrivada;
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
}
