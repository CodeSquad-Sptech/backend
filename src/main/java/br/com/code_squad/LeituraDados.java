package br.com.code_squad;

import br.com.code_squad.classes.dto.CursoImportadoDTO;
import br.com.code_squad.classes.model.infoArquivo.InfoCurso;
import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.*;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.*;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class LeituraDados {

    public List<CursoImportadoDTO> extrairCursos(Path caminho) {
        return extrairCursos(caminho.toString());
    }

    public List<CursoImportadoDTO> extrairCursos(String nomeArquivo) {
        List<CursoImportadoDTO> cursosExtraidos = new ArrayList<>();

        try (
                InputStream arquivo = new FileInputStream(nomeArquivo);
                Workbook workbook = new XSSFWorkbook(arquivo)
        ) {
            System.out.printf("Iniciando leitura do arquivo %s%n", nomeArquivo);

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue;
                }

                CursoImportadoDTO curso = new CursoImportadoDTO();
                curso.setInfoCurso(new InfoCurso(
                        null,
                        Integer.parseInt(row.getCell(0).getStringCellValue()),
                        row.getCell(1).getStringCellValue(),
                        row.getCell(2).getStringCellValue(),
                        row.getCell(3).getStringCellValue(),
                        row.getCell(4).getStringCellValue(),
                        null
                ));

                curso.setQuantidadeMatriculasSexo(new QuantidadeMatriculasSexo(
                        null,
                        Integer.parseInt(row.getCell(5).getStringCellValue()),
                        Integer.parseInt(row.getCell(6).getStringCellValue()),
                        null
                ));
                curso.setQuantidadeMatriculasTurno(new QuantidadeMatriculasTurno(
                        null,
                        Integer.parseInt(row.getCell(7).getStringCellValue()),
                        Integer.parseInt(row.getCell(8).getStringCellValue()),
                        null
                ));
                curso.setQuantidadeMatriculasIdade(new QuantidadeMatriculasIdade(
                        null,
                        Integer.parseInt(row.getCell(9).getStringCellValue()),
                        Integer.parseInt(row.getCell(10).getStringCellValue()),
                        Integer.parseInt(row.getCell(11).getStringCellValue()),
                        Integer.parseInt(row.getCell(12).getStringCellValue()),
                        Integer.parseInt(row.getCell(13).getStringCellValue()),
                        Integer.parseInt(row.getCell(14).getStringCellValue()),
                        Integer.parseInt(row.getCell(15).getStringCellValue()),
                        Integer.parseInt(row.getCell(16).getStringCellValue()),
                        null
                ));
                curso.setQuantidadeMatriculasRaca(new QuantidadeMatriculasRaca(
                        null,
                        Integer.parseInt(row.getCell(17).getStringCellValue()),
                        Integer.parseInt(row.getCell(18).getStringCellValue()),
                        Integer.parseInt(row.getCell(19).getStringCellValue()),
                        Integer.parseInt(row.getCell(20).getStringCellValue()),
                        Integer.parseInt(row.getCell(21).getStringCellValue()),
                        Integer.parseInt(row.getCell(22).getStringCellValue()),
                        null
                ));
                curso.setQuantidadeMatriculasOutros(new QuantidadeMatriculasOutros(
                        null,
                        Integer.parseInt(row.getCell(41).getStringCellValue()),
                        Integer.parseInt(row.getCell(45).getStringCellValue()),
                        Integer.parseInt(row.getCell(43).getStringCellValue()),
                        Integer.parseInt(row.getCell(52).getStringCellValue()),
                        null
                ));
                curso.getQuantidadeMatriculasOutros().setQuantidadeAlunosSituacaoTrancada(
                        Integer.parseInt(row.getCell(47).getStringCellValue())
                );
                curso.setQuantidadeMatriculasRede(new QuantidadeMatriculasRede(
                        null,
                        Integer.parseInt(row.getCell(48).getStringCellValue()),
                        Integer.parseInt(row.getCell(49).getStringCellValue()),
                        null
                ));

                curso.setQuantidadeConcluintesSexo(new QuantidadeConcluintesSexo(
                        null,
                        Integer.parseInt(row.getCell(23).getStringCellValue()),
                        Integer.parseInt(row.getCell(24).getStringCellValue()),
                        null
                ));
                curso.setQuantidadeConcluintesTurno(new QuantidadeConcluintesTurno(
                        null,
                        Integer.parseInt(row.getCell(25).getStringCellValue()),
                        Integer.parseInt(row.getCell(26).getStringCellValue()),
                        null
                ));
                curso.setQuantidadeConcluintesIdade(new QuantidadeConcluintesIdade(
                        null,
                        Integer.parseInt(row.getCell(27).getStringCellValue()),
                        Integer.parseInt(row.getCell(28).getStringCellValue()),
                        Integer.parseInt(row.getCell(29).getStringCellValue()),
                        Integer.parseInt(row.getCell(30).getStringCellValue()),
                        Integer.parseInt(row.getCell(31).getStringCellValue()),
                        Integer.parseInt(row.getCell(32).getStringCellValue()),
                        Integer.parseInt(row.getCell(33).getStringCellValue()),
                        Integer.parseInt(row.getCell(34).getStringCellValue()),
                        null
                ));
                curso.setQuantidadeConcluintesRaca(new QuantidadeConcluintesRaca(
                        null,
                        Integer.parseInt(row.getCell(35).getStringCellValue()),
                        Integer.parseInt(row.getCell(36).getStringCellValue()),
                        Integer.parseInt(row.getCell(37).getStringCellValue()),
                        Integer.parseInt(row.getCell(38).getStringCellValue()),
                        Integer.parseInt(row.getCell(39).getStringCellValue()),
                        Integer.parseInt(row.getCell(40).getStringCellValue()),
                        null
                ));
                curso.setQuantidadeConcluintesOutros(new QuantidadeConcluintesOutros(
                        null,
                        Integer.parseInt(row.getCell(42).getStringCellValue()),
                        Integer.parseInt(row.getCell(46).getStringCellValue()),
                        Integer.parseInt(row.getCell(44).getStringCellValue()),
                        null
                ));
                curso.setQuantidadeConcluintesRede(new QuantidadeConcluintesRede(
                        null,
                        Integer.parseInt(row.getCell(50).getStringCellValue()),
                        Integer.parseInt(row.getCell(51).getStringCellValue()),
                        null
                ));

                cursosExtraidos.add(curso);
            }

            System.out.println("Leitura do arquivo finalizada");
            return cursosExtraidos;
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
            return cursosExtraidos;
        }
    }
}
