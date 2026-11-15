package br.com.code_squad.classes.model.infoArquivo.base.quantidades;

public abstract class Sexo {
    private Integer id;
    private Integer feminino;
    private Integer masculino;
    private Integer fk;

    public Sexo(Integer idQuantidadeConcluintesSexo, Integer feminino, Integer masculino, Integer fkInfoConcluintes) {
        this.id = idQuantidadeConcluintesSexo;
        this.feminino = feminino;
        this.masculino = masculino;
        this.fk = fkInfoConcluintes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getFk() {
        return fk;
    }

    public void setFk(Integer fk) {
        this.fk = fk;
    }
}
