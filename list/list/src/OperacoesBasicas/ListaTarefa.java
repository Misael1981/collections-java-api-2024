package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
  // atributo
  // importar o List
  private List<Tarefa> tarefaList;

  // construtor
  public ListaTarefa() {
    this.tarefaList = new ArrayList<>();
  }

  // Adicionar tarefa
  public void adicionarTarefa(String descricao) {
    tarefaList.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {

    // Criar um novo array para as tarefas para remover
    List<Tarefa> tarefasParaRemover = new ArrayList<>();

    // Criar o for para passar pelos elementos
    for (Tarefa t : tarefaList) {
      if (t.getDescricao().equalsIgnoreCase(descricao)) {
        tarefasParaRemover.add(t);
      }
    }
    tarefaList.removeAll(tarefasParaRemover);
  }

  // Obter o número total de tarefas
  public int obterNumeroTotalTarefas() {
    return tarefaList.size();
  }

  // Obter a descrição das tarefas
  public void obterDescricoesTarefas() {
    if (!tarefaList.isEmpty()) {
      System.out.println(tarefaList);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  public static void main(String[] args) {

    // Criar um objeto do tipo Lista Tarefa
    ListaTarefa listaTarefa = new ListaTarefa();

    // Adicionando Tarefas
    listaTarefa.adicionarTarefa("Tarefa 1");
    listaTarefa.adicionarTarefa("Tarefa 2");
    listaTarefa.adicionarTarefa("Tarefa 3");
    System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

    // Obter a descrição das tarefas
    listaTarefa.obterDescricoesTarefas();

    // Removendo uma tarefa da lista
    listaTarefa.removerTarefa("Tarefa 1");
    System.out.println("O número total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());

  }
}
