package br.com.evolua.classes.usuario;

public class Usuario{
    Integer userId;
    String nome;
    Integer idade;
    String senha;

    public Usuario(Integer userId, String nome, Integer idade, String senha){
        this.userId = userId;
        this.nome = nome;
        this.idade = idade;
        this.senha = senha;
    }


    @Override
    public String toString() {
        return String.format("NOME: %s - IDADE: %d", nome, idade);
    }
}
