package br.com.code_squad.classes.model.infoArquivo.base.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.Base;

public abstract class Turno extends Base {
    private Integer diurno;
    private Integer noturno;

    public Turno(Integer id, Integer fk, Integer diurno, Integer noturno) {
        super(id, fk);
        this.diurno = diurno;
        this.noturno = noturno;
    }

    public Integer getDiurno() {
        return diurno;
    }

    public void setDiurno(Integer diurno) {
        this.diurno = diurno;
    }

    public Integer getNoturno() {
        return noturno;
    }

    public void setNoturno(Integer noturno) {
        this.noturno = noturno;
    }
}
