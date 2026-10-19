package br.com.code_squad.classes.model;

import java.time.LocalDate;

public class Logs {
    private Integer idLogs;
    private String empresa;
    private String funcionario;
    private String nivel;
    private String mensagem;
    private LocalDate dataHora;

    public Logs(Integer idLogs, String empresa, String funcionario, String nivel, String mensagem, LocalDate dataHora) {
        this.idLogs = idLogs;
        this.empresa = empresa;
        this.funcionario = funcionario;
        this.nivel = nivel;
        this.mensagem = mensagem;
        this.dataHora = dataHora;
    }

    public Integer getIdLogs() {
        return idLogs;
    }

    public void setIdLogs(Integer idLogs) {
        this.idLogs = idLogs;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDate dataHora) {
        this.dataHora = dataHora;
    }
}
