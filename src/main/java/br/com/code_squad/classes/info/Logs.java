package br.com.evolua.classes.info;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class
Logs {
    Integer logId;
    LocalDateTime time;
    String type;
    String message;

    public Logs(
            Integer logId,
            LocalDateTime time,
            String type,
            String message
    ){
        this.logId = logId;
        this.time = time;
        this.type = type;
        this.message = message;
    }

    DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    @Override
    public String toString() {
        return String.format("%d | %s | %s | %s", logId, time.format(formatador), type, message);
    }
}
