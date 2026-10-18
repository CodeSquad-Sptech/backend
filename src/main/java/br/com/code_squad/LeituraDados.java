package br.com.code_squad;

import br.com.code_squad.classes.curso.Curso;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LeituraDados {
    public List<Curso> extrairCursos(String nomeArquivo) {
        List<Curso> cursosExtraidos = new ArrayList<>();

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

                Curso curso = new Curso();
                curso.setAno((int) row.getCell(0).getNumericCellValue());
                curso.setNomeCurso(row.getCell(1).getStringCellValue());


                cursosExtraidos.add(curso);
            }
            return cursosExtraidos;
        } catch (IOException e) {
            return cursosExtraidos;
        }
    }


    public static String validarAno(int ano) {
        if (ano < 1950 || ano > LocalDate.now().getYear()) {
            return "ano inválido: " + ano;
        }
        return "";
    }

    public static String validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            return "nome do curso em branco";
        }
        return "";
    }
}