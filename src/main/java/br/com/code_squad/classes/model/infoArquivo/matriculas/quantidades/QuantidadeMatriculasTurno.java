package br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades;

import br.com.code_squad.classes.model.infoArquivo.base.quantidades.Turno;

public class QuantidadeMatriculasTurno extends Turno {
    public QuantidadeMatriculasTurno(Integer id, Integer fk, Integer diurno, Integer noturno) {
        super(id, fk, diurno, noturno);
    }
}
