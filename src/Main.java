import model.Pessoa;

public class Main {
    public static void main(String[] args) {
        // Exercício 1

        // Construtor com parâmetros
        Pessoa pessoa = new Pessoa("Banana", 6.00, 12);

        pessoa.exibirInformacores();

        System.out.println();

        // Funcionará com esses valores
        pessoa.setNome("Maçã");
        pessoa.setPreco(3.00);
        pessoa.setQuantidade(10);
        pessoa.exibirInformacores();

        // Verificação irá barrar
        pessoa.setNome("");
        pessoa.setPreco(-3.00);
        pessoa.setQuantidade(-10);

        // Exercício 2


    }
}