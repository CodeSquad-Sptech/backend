package br.com.code_squad;

import br.com.evolua.classes.info.Logs;
import br.com.evolua.classes.usuario.Usuario;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Logs> todosLogs = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Integer opt;
        Boolean ligado = true;
        System.out.println("\nSeja bem vindo ao Evolua!\n");
        todosLogs.add(new Logs((todosLogs.size()), LocalDateTime.now(),
                "INFO", "Sistema foi iniciado"));
        while (ligado){
            do {

                System.out.printf("""
                        Oque deseja fazer?
                        
                        >Cadastrar Usuário: Digite 1
                        >Consultar Logs: Digite 2
                        >Ver todos os usuários: Digite 3
                        >Desligar sistema: Digite 4
                        """);
                opt = scanner.nextInt();
                scanner.nextLine();

                if (opt == null || opt < 1 || opt > 4) {
                    System.out.println("Opção inválida\n");
                    todosLogs.add(new Logs((todosLogs.size()), LocalDateTime.now(),
                            "ERRO", "Erro ao receber opção desejada pelo usuário"));
                }
            } while (opt == null || opt < 1 || opt > 4);

            switch (opt){
               case 1 -> cadastrarUser(scanner, usuarios, todosLogs);
               case 2 -> consultarLogs(todosLogs);
               case 3 -> consultarUsers(usuarios);
               case 4 -> ligado = false;
            }

        }






    }

    static void consultarLogs(List<Logs> todosLogs){
        System.out.println("\n=================================================================================\n");
        if(todosLogs.size() < 1){
            System.out.println("Sem registro de logs no sistema");
        } else {
            for (int i = 0; i < todosLogs.size(); i++) {
                System.out.println(todosLogs.get(i));
            }
        }
        System.out.println("\n=================================================================================\n");

    }



    static void consultarUsers(List<Usuario> usuarios){
        System.out.println("\n=================================================================================\n");
        if(usuarios.size() < 1){
            System.out.println("Sem registro de usuários no sistema");
        } else {
            for (int i = 0; i < usuarios.size(); i++) {
                System.out.println(usuarios.get(i));
            }
        }
        System.out.println("\n=================================================================================\n");

    }

    static void cadastrarUser(Scanner scanner, List<Usuario> usuarios, List<Logs> todosLogs ){

            Integer idUserAtual;

            String nome;
            Integer idade;
            String senha;

            do {
                System.out.println("\nNome do usuário:");
                nome = scanner.nextLine();
                if (nome == null || nome.length() < 4) {
                    System.out.println("Nome invalido!\n");
                    todosLogs.add(new Logs(todosLogs.size(), LocalDateTime.now(),
                            "ERRO", "Erro ao validar nome"));
                }
            } while (nome == null || nome.length() < 4);


            do {
                System.out.println("\nIdade do usuário:");
                idade = scanner.nextInt();
                scanner.nextLine();
                if (idade == null || idade <= 0) {
                    System.out.println("Idade invalida!\n");
                    todosLogs.add(new Logs(todosLogs.size(), LocalDateTime.now(),
                            "ERRO", "Erro ao validar idade"));
                }
            } while (idade == null || idade <= 0);

            do {
                System.out.println("\nSenha do usuário: (deve conter no mínimo 8 caracteres)");
                senha = scanner.nextLine();
                if (senha == null || senha.length() < 8) {
                    System.out.println("Senha invalida!\n");
                    todosLogs.add(new Logs(todosLogs.size(), LocalDateTime.now(),
                            "ERRO", "Erro ao validar senha"));
                }
            } while (senha == null || senha.length() < 8);

            idUserAtual = usuarios.size();
            usuarios.add(new Usuario(idUserAtual, nome, idade, senha));

            todosLogs.add(new Logs((todosLogs.size()), LocalDateTime.now(),
                    "INFO", "Usuário cadastrado"));

            System.out.println("Usuário cadastrado com sucesso! \n");

    }



}



