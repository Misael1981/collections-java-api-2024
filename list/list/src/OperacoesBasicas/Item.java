package OperacoesBasicas;

public class Item {

    // Atributo
    private String nome;
    private double preco;
    private int quant;

    // Construtor
    /**
     * @param nome
     * @param preco
     * @param quant
     */
    public Item(String nome, double preco, int quant) {
        this.nome = nome;
        this.preco = preco;
        this.quant = quant;
    }

    // criar um método get para saber qual é a descrição da item para ser comprado
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuant() {
        return quant;
    }

    // Para obter a descrição dos elementos no Sysout
    @Override
    public String toString() {
        return "Item{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quant=" + quant +
                '}';
    }

}