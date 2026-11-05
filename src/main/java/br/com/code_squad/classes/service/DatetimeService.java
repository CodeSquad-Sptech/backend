package br.com.code_squad.classes.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DatetimeService {

    public String horaAtual() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:SSS");

        return agora.format(formatador) + " - ";
    }

}
