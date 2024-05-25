package OperacoesBasicas;

public class Tarefa {

    // atributo
    private String descricao;

    // construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // criar um método get para saber qual é a descrição da tarefa
    public String getDescricao() {
        return descricao;
    }

    // Para obter a descrição dos elementos no Sysout
    @Override
    public String toString() {
        return "Tarefa{" + descricao + '\'' + '}';
    }

}