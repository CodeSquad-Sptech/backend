package br.com.code_squad.classes.model.infoArquivo.base.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.Base;

public abstract class Idade extends Base {
    private Integer i0a17;
    private Integer i18a24;
    private Integer i25a29;
    private Integer i30a34;
    private Integer i35a39;
    private Integer i40a49;
    private Integer i50a59;
    private Integer i60Mais;



    public Idade(Integer id, Integer fk, Integer i0a17, Integer i18a24, Integer i25a29, Integer i30a34, Integer i35a39, Integer i40a49, Integer i50a59, Integer i60Mais) {
        super(id, fk);
        this.i0a17 = i0a17;
        this.i18a24 = i18a24;
        this.i25a29 = i25a29;
        this.i30a34 = i30a34;
        this.i35a39 = i35a39;
        this.i40a49 = i40a49;
        this.i50a59 = i50a59;
        this.i60Mais = i60Mais;
    }

    public Integer getI0a17() {
        return i0a17;
    }

    public void setI0a17(Integer i0a17) {
        this.i0a17 = i0a17;
    }

    public Integer getI18a24() {
        return i18a24;
    }

    public void setI18a24(Integer i18a24) {
        this.i18a24 = i18a24;
    }

    public Integer getI25a29() {
        return i25a29;
    }

    public void setI25a29(Integer i25a29) {
        this.i25a29 = i25a29;
    }

    public Integer getI30a34() {
        return i30a34;
    }

    public void setI30a34(Integer i30a34) {
        this.i30a34 = i30a34;
    }

    public Integer getI35a39() {
        return i35a39;
    }

    public void setI35a39(Integer i35a39) {
        this.i35a39 = i35a39;
    }

    public Integer getI40a49() {
        return i40a49;
    }

    public void setI40a49(Integer i40a49) {
        this.i40a49 = i40a49;
    }

    public Integer getI50a59() {
        return i50a59;
    }

    public void setI50a59(Integer i50a59) {
        this.i50a59 = i50a59;
    }

    public Integer getI60Mais() {
        return i60Mais;
    }

    public void setI60Mais(Integer i60Mais) {
        this.i60Mais = i60Mais;
    }
}
