package br.com.code_squad.classes.model.infoArquivo.base.quantidades;

public abstract class Turno {
    private Integer id;
    private Integer diurno;
    private Integer noturno;
    private Integer fk;

    public Turno(Integer id, Integer diurno, Integer noturno, Integer fk) {
        this.id = id;
        this.diurno = diurno;
        this.noturno = noturno;
        this.fk = fk;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getFk() {
        return fk;
    }

    public void setFk(Integer fk) {
        this.fk = fk;
    }
}
