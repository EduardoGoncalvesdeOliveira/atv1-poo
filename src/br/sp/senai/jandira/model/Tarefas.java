package br.sp.senai.jandira.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tarefas {

    Scanner teclado = new Scanner(System.in);

    public String titulo, descricao;
    int data;

public void cadastroDasTarefas(){

    System.out.println("-----  T A R E F A S  -----");
    System.out.println("Qual é o título da tarefa: ");
    titulo = teclado.nextLine();
    System.out.println("Qual é a descrição: ");
    descricao = teclado.nextLine();
    System.out.println("Qual é a data de vencimento: ");
    data = teclado.nextInt();
    teclado.nextLine();

}

    public class CadastroTarefas {

        List<Tarefas> Tarefa = new ArrayList<>();

        public void AdicionarTarefa(Tarefas tarefa) {

            Tarefa.add(tarefa);

        }
    }
}
