package br.com.code_squad;

import br.com.code_squad.classes.dto.CursoImportadoDTO;
import br.com.code_squad.classes.model.infoArquivo.InfoCurso;
import br.com.code_squad.classes.model.infoArquivo.concluintes.quantidades.*;
import br.com.code_squad.classes.model.infoArquivo.matriculas.quantidades.*;
import br.com.code_squad.classes.service.DatetimeService;
import org.apache.commons.compress.compressors.zstandard.ZstdCompressorOutputStream;
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

    private DatetimeService time = new DatetimeService();

    public List<CursoImportadoDTO> extrairCursos(Path caminho) {
        return extrairCursos(caminho.toString());
    }

    public List<CursoImportadoDTO> extrairCursos(String nomeArquivo) {
        List<CursoImportadoDTO> cursosExtraidos = new ArrayList<>();

        System.out.println(time.horaAtual() + " | INFO | Tentando abrir o arquivo: " + nomeArquivo + " | Evolua");
        try (
                InputStream arquivo = new FileInputStream(nomeArquivo);
                Workbook workbook = new XSSFWorkbook(arquivo)
        ) {
            System.out.println(time.horaAtual() + " | INFO | Iniciando leitura do arquivo: " + nomeArquivo + " | Evolua");

            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                if (row.getRowNum() == 0) {
                    continue;
                }

                System.out.println(time.horaAtual() + " | INFO | Lendo a linha: " + row.getRowNum() + " | Evolua");

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

                System.out.println(time.horaAtual() + " | INFO | Curso lido: " + row.getCell(1).getStringCellValue() + " | Evolua");

                curso.setQuantidadeMatriculasSexo(new QuantidadeMatriculasSexo(
                        null,
                        Integer.parseInt(row.getCell(5).getStringCellValue()),
                        Integer.parseInt(row.getCell(6).getStringCellValue()),
                        null
                ));

                System.out.println(time.horaAtual() + " | INFO | Matrículas por sexo lidas: " + row.getCell(5).getStringCellValue() + ", " + row.getCell(6).getStringCellValue() + " | Evolua");

                curso.setQuantidadeMatriculasTurno(new QuantidadeMatriculasTurno(
                        null,
                        Integer.parseInt(row.getCell(7).getStringCellValue()),
                        Integer.parseInt(row.getCell(8).getStringCellValue()),
                        null
                ));

                System.out.println(time.horaAtual() + " | INFO | Matrículas por turno lidas: " + row.getCell(7).getStringCellValue() + ", " + row.getCell(8).getStringCellValue() + " | Evolua");

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

                System.out.println(time.horaAtual() + " | INFO | Matrículas por idade lidas: " + row.getCell(9).getStringCellValue() + ", " + row.getCell(10).getStringCellValue() + ", " + row.getCell(11).getStringCellValue() + ", " + row.getCell(12).getStringCellValue() + ", " + row.getCell(13).getStringCellValue() + ", " + row.getCell(14).getStringCellValue() + ", " + row.getCell(15).getStringCellValue() + ", " + row.getCell(16).getStringCellValue() + " | Evolua");

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

                System.out.println(time.horaAtual() + " | INFO | Matrículas por raça lidas: " + row.getCell(17).getStringCellValue() + ", " + row.getCell(18).getStringCellValue() + ", " + row.getCell(19).getStringCellValue() + ", " + row.getCell(20).getStringCellValue() + ", " + row.getCell(21).getStringCellValue() + ", " + row.getCell(22).getStringCellValue() + " | Evolua");

                curso.setQuantidadeMatriculasOutros(new QuantidadeMatriculasOutros(
                        null,
                        Integer.parseInt(row.getCell(41).getStringCellValue()),
                        Integer.parseInt(row.getCell(45).getStringCellValue()),
                        Integer.parseInt(row.getCell(43).getStringCellValue()),
                        Integer.parseInt(row.getCell(52).getStringCellValue()),
                        null
                ));

                System.out.println(time.horaAtual() + " | INFO | Outros dados de matrículas lidos: " + row.getCell(41).getStringCellValue() + ", " + row.getCell(45).getStringCellValue() + ", " + row.getCell(43).getStringCellValue() + ", " + row.getCell(52).getStringCellValue() + " | Evolua");

                curso.getQuantidadeMatriculasOutros().setQuantidadeAlunosSituacaoTrancada(
                        Integer.parseInt(row.getCell(47).getStringCellValue())
                );

                System.out.println(time.horaAtual() + " | INFO | Matrículas trancadas lidas: " + row.getCell(47).getStringCellValue() + " | Evolua");

                curso.setQuantidadeMatriculasRede(new QuantidadeMatriculasRede(
                        null,
                        Integer.parseInt(row.getCell(48).getStringCellValue()),
                        Integer.parseInt(row.getCell(49).getStringCellValue()),
                        null
                ));

                System.out.println(time.horaAtual() + " | INFO | Matrículas por rede lidas: " + row.getCell(48).getStringCellValue() + ", " + row.getCell(49).getStringCellValue() + " | Evolua");

                curso.setQuantidadeConcluintesSexo(new QuantidadeConcluintesSexo(
                        null,
                        Integer.parseInt(row.getCell(23).getStringCellValue()),
                        Integer.parseInt(row.getCell(24).getStringCellValue()),
                        null
                ));

                System.out.println(time.horaAtual() + " | INFO | Concluintes por sexo lidos: " + row.getCell(23).getStringCellValue() + ", " + row.getCell(24).getStringCellValue() + " | Evolua");

                curso.setQuantidadeConcluintesTurno(new QuantidadeConcluintesTurno(
                        null,
                        Integer.parseInt(row.getCell(25).getStringCellValue()),
                        Integer.parseInt(row.getCell(26).getStringCellValue()),
                        null
                ));

                System.out.println(time.horaAtual() + " | INFO | Concluintes por turno lidos: " + row.getCell(25).getStringCellValue() + ", " + row.getCell(26).getStringCellValue() + " | Evolua");

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

                System.out.println(time.horaAtual() + " | INFO | Concluintes por idade lidos: " + row.getCell(27).getStringCellValue() + ", " + row.getCell(28).getStringCellValue() + ", " + row.getCell(29).getStringCellValue() + ", " + row.getCell(30).getStringCellValue() + ", " + row.getCell(31).getStringCellValue() + ", " + row.getCell(32).getStringCellValue() + ", " + row.getCell(33).getStringCellValue() + ", " + row.getCell(34).getStringCellValue() + " | Evolua");

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

                System.out.println(time.horaAtual() + " | INFO | Concluintes por raça lidos: " + row.getCell(35).getStringCellValue() + ", " + row.getCell(36).getStringCellValue() + ", " + row.getCell(37).getStringCellValue() + ", " + row.getCell(38).getStringCellValue() + ", " + row.getCell(39).getStringCellValue() + ", " + row.getCell(40).getStringCellValue() + " | Evolua");

                curso.setQuantidadeConcluintesOutros(new QuantidadeConcluintesOutros(
                        null,
                        Integer.parseInt(row.getCell(42).getStringCellValue()),
                        Integer.parseInt(row.getCell(46).getStringCellValue()),
                        Integer.parseInt(row.getCell(44).getStringCellValue()),
                        null
                ));

                System.out.println(time.horaAtual() + " | INFO | Outros dados de concluintes lidos: " + row.getCell(42).getStringCellValue() + ", " + row.getCell(46).getStringCellValue() + ", " + row.getCell(44).getStringCellValue() + " | Evolua");

                curso.setQuantidadeConcluintesRede(new QuantidadeConcluintesRede(
                        null,
                        Integer.parseInt(row.getCell(50).getStringCellValue()),
                        Integer.parseInt(row.getCell(51).getStringCellValue()),
                        null
                ));

                System.out.println(time.horaAtual() + " | INFO | Concluintes por rede lidos: " + row.getCell(50).getStringCellValue() + ", " + row.getCell(51).getStringCellValue() + " | Evolua");

                cursosExtraidos.add(curso);
            }

            System.out.println(time.horaAtual() + " | INFO | Leitura do arquivo finalizada: " + nomeArquivo + " | Evolua");
            return cursosExtraidos;
        } catch (IOException e) {
            System.err.println(time.horaAtual() + " | ERROR | Erro ao ler o arquivo " + nomeArquivo + ": " + e.getMessage() + " | Evolua");
            return cursosExtraidos;
        }
    }
}