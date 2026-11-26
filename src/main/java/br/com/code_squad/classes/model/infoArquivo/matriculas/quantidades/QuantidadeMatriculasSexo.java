package br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.quantidades.Sexo;

public class QuantidadeMatriculasSexo extends Sexo {

    public QuantidadeMatriculasSexo(Integer id, Integer fk, Integer feminino, Integer masculino) {
        super(id, fk, feminino, masculino);
    }
}
