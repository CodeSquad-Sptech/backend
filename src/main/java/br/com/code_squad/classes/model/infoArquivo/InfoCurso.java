package br.com.code_squad.classes.model.infoArquivo;

import java.time.LocalDate;

public class InfoCurso {
    private Integer idInfoCurso;
    private LocalDate ano;
    private String nomeCurso;
    private String tipoGrauAcademico;
    private String tipoModalidadeEnsino;
    private String tipoNivelAcademico;
    private Integer fkImportacao;

    public Integer getIdInfoCurso() {
        return idInfoCurso;
    }

    public void setIdInfoCurso(Integer idInfoCurso) {
        this.idInfoCurso = idInfoCurso;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getTipoGrauAcademico() {
        return tipoGrauAcademico;
    }

    public void setTipoGrauAcademico(String tipoGrauAcademico) {
        this.tipoGrauAcademico = tipoGrauAcademico;
    }

    public String getTipoModalidadeEnsino() {
        return tipoModalidadeEnsino;
    }

    public void setTipoModalidadeEnsino(String tipoModalidadeEnsino) {
        this.tipoModalidadeEnsino = tipoModalidadeEnsino;
    }

    public String getTipoNivelAcademico() {
        return tipoNivelAcademico;
    }

    public void setTipoNivelAcademico(String tipoNivelAcademico) {
        this.tipoNivelAcademico = tipoNivelAcademico;
    }

    public Integer getFkImportacao() {
        return fkImportacao;
    }

    public void setFkImportacao(Integer fkImportacao) {
        this.fkImportacao = fkImportacao;
    }
}
