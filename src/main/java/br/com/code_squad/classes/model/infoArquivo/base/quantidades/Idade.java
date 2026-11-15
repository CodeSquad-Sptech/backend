package br.com.code_squad.classes.model.infoArquivo.base.quantidades;

public abstract class Idade {
    private Integer idIdade;
    private Integer I0a17;
    private Integer I18a24;
    private Integer I25a29;
    private Integer I30a34;
    private Integer I35a39;
    private Integer I40a49;
    private Integer I50a59;
    private Integer I60Mais;
    private Integer fk;

    public Idade(Integer idIdade, Integer i0a17, Integer i18a24, Integer i25a29, Integer i30a34, Integer i35a39, Integer i40a49, Integer i50a59, Integer i60Mais, Integer fk) {
        this.idIdade = idIdade;
        I0a17 = i0a17;
        I18a24 = i18a24;
        I25a29 = i25a29;
        I30a34 = i30a34;
        I35a39 = i35a39;
        I40a49 = i40a49;
        I50a59 = i50a59;
        I60Mais = i60Mais;
        this.fk = fk;
    }

    public Integer getIdIdade() {
        return idIdade;
    }

    public void setIdIdade(Integer idIdade) {
        this.idIdade = idIdade;
    }

    public Integer getFk() {
        return fk;
    }

    public void setFk(Integer fk) {
        this.fk = fk;
    }

    public Integer getI0a17() {
        return I0a17;
    }

    public void setI0a17(Integer i0a17) {
        I0a17 = i0a17;
    }

    public Integer getI18a24() {
        return I18a24;
    }

    public void setI18a24(Integer i18a24) {
        I18a24 = i18a24;
    }

    public Integer getI25a29() {
        return I25a29;
    }

    public void setI25a29(Integer i25a29) {
        I25a29 = i25a29;
    }

    public Integer getI30a34() {
        return I30a34;
    }

    public void setI30a34(Integer i30a34) {
        I30a34 = i30a34;
    }

    public Integer getI35a39() {
        return I35a39;
    }

    public void setI35a39(Integer i35a39) {
        I35a39 = i35a39;
    }

    public Integer getI40a49() {
        return I40a49;
    }

    public void setI40a49(Integer i40a49) {
        I40a49 = i40a49;
    }

    public Integer getI50a59() {
        return I50a59;
    }

    public void setI50a59(Integer i50a59) {
        I50a59 = i50a59;
    }

    public Integer getI60Mais() {
        return I60Mais;
    }

    public void setI60Mais(Integer i60Mais) {
        I60Mais = i60Mais;
    }
}
