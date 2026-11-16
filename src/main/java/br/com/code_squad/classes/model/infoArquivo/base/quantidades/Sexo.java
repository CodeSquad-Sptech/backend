package br.com.code_squad.classes.model.infoArquivo.base.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.Base;

public abstract class Sexo extends Base {
    private Integer feminino;
    private Integer masculino;

    public Sexo(Integer id, Integer fk, Integer feminino, Integer masculino) {
        super(id, fk);
        this.feminino = feminino;
        this.masculino = masculino;
    }

    public Integer getFeminino() {
        return feminino;
    }

    public void setFeminino(Integer feminino) {
        this.feminino = feminino;
    }

    public Integer getMasculino() {
        return masculino;
    }

    public void setMasculino(Integer masculino) {
        this.masculino = masculino;
    }
}
