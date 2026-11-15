package br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.quantidades.Sexo;

public class QuantidadeMatriculasSexo extends Sexo {
    public QuantidadeMatriculasSexo(Integer idQuantidadeConcluintesSexo, Integer feminino, Integer masculino, Integer fkInfoConcluintes) {
        super(idQuantidadeConcluintesSexo, feminino, masculino, fkInfoConcluintes);
    }
}
