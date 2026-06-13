package banca;

public abstract class Livro implements Produto {
    private String titulo;
    private double preco;

    public Livro(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public double getPreco() {
        return this.preco;
    }

    @Override
    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            this.preco -= this.preco * (percentual / 100.0);
        }
    }
}