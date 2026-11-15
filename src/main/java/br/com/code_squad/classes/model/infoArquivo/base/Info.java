package br.com.code_squad.classes.model.infoArquivo.base;

public abstract class Info {
    private Integer id;
    private Integer fk;

    public Info(Integer id, Integer fk) {
        this.id = id;
        this.fk = fk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFk() {
        return fk;
    }

    public void setFk(Integer fk) {
        this.fk = fk;
    }
}
