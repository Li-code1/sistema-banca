package banca;

public class Revista implements Produto {
    private String nome;
    private int edicao;
    private double preco;

    public Revista(String nome, int edicao, double preco) {
        this.nome = nome;
        this.edicao = edicao;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public int getEdicao() {
        return edicao;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        // Exemplo de polimorfismo: revistas podem ter regras de desconto diferentes se necessário
        if (percentual > 0 && percentual <= 50) { // Limitando desconto de revista a no máximo 50%
            this.preco -= this.preco * (percentual / 100.0);
        }
    }
}