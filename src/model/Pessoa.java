package model;

public class Pessoa {
    private String nome;
    private double preco;
    private int quantidade;

    public Pessoa(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Pessoa() {
        this.nome = "Não inserido";
        this.preco = 0.00;
        this.quantidade = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty()) {
            System.out.println("Nomes vazios não podem ser adicionados");
        } else {
            this.nome = nome;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        } else {
            System.out.println("Precos negativos não podem ser adicionados");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Não é possível adicionar quantidades negativas");
        }
    }

    public void exibirInformacores() {
        System.out.println(getNome());
        System.out.println(getPreco());
        System.out.println(getQuantidade());
    }
}
