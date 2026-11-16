package br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.quantidades.Rede;

public class QuantidadeMatriculasRede extends Rede {

    public QuantidadeMatriculasRede(Integer id, Integer fk, Integer redePublica, Integer redePrivada) {
        super(id, fk, redePublica, redePrivada);
    }
}
