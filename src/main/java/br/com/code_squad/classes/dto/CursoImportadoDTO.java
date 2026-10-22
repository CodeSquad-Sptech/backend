package br.com.code_squad.classes.dto;

import br.com.code_squad.classes.model.infoArquivo.InfoCurso;

import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasIdade;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasRaca;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasSexo;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasTurno;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasOutros;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.QuantidadeMatriculasRede;

import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesIdade;
import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesOutros;
import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesRaca;
import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesSexo;
import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesTurno;
import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.QuantidadeConcluintesRede;

public class CursoImportadoDTO {

    private InfoCurso infoCurso;

    private QuantidadeMatriculasIdade quantidadeMatriculasIdade;
    private QuantidadeMatriculasRaca quantidadeMatriculasRaca;
    private QuantidadeMatriculasSexo quantidadeMatriculasSexo;
    private QuantidadeMatriculasTurno quantidadeMatriculasTurno;
    private QuantidadeMatriculasOutros quantidadeMatriculasOutros;
    private QuantidadeMatriculasRede quantidadeMatriculasRede;

    private QuantidadeConcluintesIdade quantidadeConcluintesIdade;
    private QuantidadeConcluintesOutros quantidadeConcluintesOutros;
    private QuantidadeConcluintesRaca quantidadeConcluintesRaca;
    private QuantidadeConcluintesSexo quantidadeConcluintesSexo;
    private QuantidadeConcluintesTurno quantidadeConcluintesTurno;
    private QuantidadeConcluintesRede quantidadeConcluintesRede;

//      CursoImportadoDTO cursoDTO = new CursoImportadoDTO();
//
//      cursoDTO.setInfoCurso(infoCurso);
//
//      cursoDTO.setQuantidadeMatriculasIdade(matriculasIdade);
//      cursoDTO.setQuantidadeMatriculasRaca(matriculasRaca);
//
//      cursoDTO.setQuantidadeConcluintesIdade(concluintesIdade);
//      cursoDTO.setQuantidadeConcluintesRaca(concluintesRaca);

    public InfoCurso getInfoCurso() {
        return infoCurso;
    }

    public void setInfoCurso(InfoCurso infoCurso) {
        this.infoCurso = infoCurso;
    }

    public QuantidadeMatriculasIdade getQuantidadeMatriculasIdade() {
        return quantidadeMatriculasIdade;
    }

    public void setQuantidadeMatriculasIdade(
            QuantidadeMatriculasIdade quantidadeMatriculasIdade) {
        this.quantidadeMatriculasIdade = quantidadeMatriculasIdade;
    }

    public QuantidadeMatriculasRaca getQuantidadeMatriculasRaca() {
        return quantidadeMatriculasRaca;
    }

    public void setQuantidadeMatriculasRaca(
            QuantidadeMatriculasRaca quantidadeMatriculasRaca) {
        this.quantidadeMatriculasRaca = quantidadeMatriculasRaca;
    }

    public QuantidadeMatriculasSexo getQuantidadeMatriculasSexo() {
        return quantidadeMatriculasSexo;
    }

    public void setQuantidadeMatriculasSexo(
            QuantidadeMatriculasSexo quantidadeMatriculasSexo) {
        this.quantidadeMatriculasSexo = quantidadeMatriculasSexo;
    }

    public QuantidadeMatriculasTurno getQuantidadeMatriculasTurno() {
        return quantidadeMatriculasTurno;
    }

    public void setQuantidadeMatriculasTurno(
            QuantidadeMatriculasTurno quantidadeMatriculasTurno) {
        this.quantidadeMatriculasTurno = quantidadeMatriculasTurno;
    }

    public QuantidadeMatriculasOutros getQuantidadeMatriculasOutros() {
        return quantidadeMatriculasOutros;
    }

    public void setQuantidadeMatriculasOutros(
            QuantidadeMatriculasOutros quantidadeMatriculasOutros) {
        this.quantidadeMatriculasOutros = quantidadeMatriculasOutros;
    }

    public QuantidadeMatriculasRede getQuantidadeMatriculasRede() {
        return quantidadeMatriculasRede;
    }

    public void setQuantidadeMatriculasRede(
            QuantidadeMatriculasRede quantidadeMatriculasRede) {
        this.quantidadeMatriculasRede = quantidadeMatriculasRede;
    }

    public QuantidadeConcluintesIdade getQuantidadeConcluintesIdade() {
        return quantidadeConcluintesIdade;
    }

    public void setQuantidadeConcluintesIdade(
            QuantidadeConcluintesIdade quantidadeConcluintesIdade) {
        this.quantidadeConcluintesIdade = quantidadeConcluintesIdade;
    }

    public QuantidadeConcluintesOutros getQuantidadeConcluintesOutros() {
        return quantidadeConcluintesOutros;
    }

    public void setQuantidadeConcluintesOutros(
            QuantidadeConcluintesOutros quantidadeConcluintesOutros) {
        this.quantidadeConcluintesOutros = quantidadeConcluintesOutros;
    }

    public QuantidadeConcluintesRaca getQuantidadeConcluintesRaca() {
        return quantidadeConcluintesRaca;
    }

    public void setQuantidadeConcluintesRaca(
            QuantidadeConcluintesRaca quantidadeConcluintesRaca) {
        this.quantidadeConcluintesRaca = quantidadeConcluintesRaca;
    }

    public QuantidadeConcluintesSexo getQuantidadeConcluintesSexo() {
        return quantidadeConcluintesSexo;
    }

    public void setQuantidadeConcluintesSexo(
            QuantidadeConcluintesSexo quantidadeConcluintesSexo) {
        this.quantidadeConcluintesSexo = quantidadeConcluintesSexo;
    }

    public QuantidadeConcluintesTurno getQuantidadeConcluintesTurno() {
        return quantidadeConcluintesTurno;
    }

    public void setQuantidadeConcluintesTurno(
            QuantidadeConcluintesTurno quantidadeConcluintesTurno) {
        this.quantidadeConcluintesTurno = quantidadeConcluintesTurno;
    }

    public QuantidadeConcluintesRede getQuantidadeConcluintesRede() {
        return quantidadeConcluintesRede;
    }

    public void setQuantidadeConcluintesRede(
            QuantidadeConcluintesRede quantidadeConcluintesRede) {
        this.quantidadeConcluintesRede = quantidadeConcluintesRede;
    }
}