package br.sp.senai.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {

    Scanner teclado = new Scanner(System.in);

    public String titulo, descricao, resposta, data;

    public void cadastrarTarefas() {

        System.out.println("-----  T A R E F A S  -----");
        System.out.println("Qual é o título da tarefa: ");
        titulo = teclado.nextLine();
        System.out.println("Qual é a descrição: ");
        descricao = teclado.nextLine();
        System.out.println("Qual é a data de vencimento: ");
        data = teclado.nextLine();
        teclado.nextLine();
    }

    public void novoCadastro() {

        boolean validacao = true;

        while (validacao) {

            System.out.println("Deseja cadastrar mais uma tarefa? [S -- N]");
            resposta = teclado.nextLine();

            Tarefas tarefa = new Tarefas();

            if (resposta.equalsIgnoreCase("S")) {

                tarefa.cadastrarTarefas();
                ListaTarefa.add(tarefa);
                tarefa.listarTarefas();

            } else if (resposta.equalsIgnoreCase("N")) {

                validacao = false;
                tarefa.listarTarefas();

            } else {
                System.out.println("Tecla Invalida");
            }
        }
    }

    List<Tarefas> ListaTarefa = new ArrayList<>();

    public void AdicionarTarefa(Tarefas tarefa) {

        ListaTarefa.add(tarefa);
    }

    public void listarTarefas() {

        for (Tarefas tarefa : ListaTarefa) {
            System.out.println(tarefa.titulo);
        }
    }
}