package br.sp.senai.jandira;

import br.sp.senai.jandira.model.Tarefas;

import java.util.Scanner;

public class GerenciamentoTarefasAPP {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Tarefas tarefa = new Tarefas();
        tarefa.cadastroDasTarefas();
    }

}
