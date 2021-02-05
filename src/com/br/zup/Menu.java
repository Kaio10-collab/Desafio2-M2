package com.br.zup;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    ArrayList <Aluno>listaAlunos = new ArrayList();

    public void menuInicial() {

        while (true) {
            IO.saidaDados("Digite: \n1 Cadastro\n2 Pesquisa \n3 Excluir \n4 sair");
            String resposta = IO.entradaDados().nextLine();

            if (resposta.equalsIgnoreCase("1")) {
                cadastrar();
            } else if (resposta.equalsIgnoreCase("2")) {
                pesquisar();
            } else if ((resposta.equalsIgnoreCase("3"))){
                excluir();
            } else if (resposta.equalsIgnoreCase("4")) {
                break;
            }
        }
    }
    private void cadastrar() {
         Aluno aluno = new Aluno();
         IO.saidaDados("Cadastre seu nome: ");
         String nome = IO.entradaDados().nextLine();
         aluno.setNome(nome);

        IO.saidaDados("Cadastre seu telefone: ");
        String telefone = IO.entradaDados().nextLine();
        aluno.setTelefone(telefone);

        IO.saidaDados("Cadastre seu email: ");
        String email = IO.entradaDados().nextLine();
        aluno.setEmail(email);
        listaAlunos.add(aluno);
    }
    private void pesquisar(){
        IO.saidaDados( "nome: ");
        String nome = IO.entradaDados().nextLine();
        for (Aluno aluno: listaAlunos) {
            if (aluno.getNome().equalsIgnoreCase(nome)){
                IO.saidaDados("nome: "+aluno.getNome());
                IO.saidaDados("telefone: "+aluno.getTelefone());
                IO.saidaDados("email: "+aluno.getEmail());
                return;
            }
        }
        IO.saidaDados("Cadastro não encontrado");
    }
    private  void excluir(){
        IO.saidaDados( "email: ");
        String email = IO.entradaDados().nextLine();
        int posicao = 0;
        for (Aluno aluno: listaAlunos) {
            if (aluno.getEmail().equalsIgnoreCase(email)){
                listaAlunos.remove(posicao);
                IO.saidaDados("Cadastro excluído com sucesso");
                break;
            }
            posicao++;
        }
    }
}