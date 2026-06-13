package banca;

public class EBook extends Livro {
    private double tamanhoEmMB;

    public EBook(String titulo, double preco, double tamanhoEmMB) {
        super(titulo, preco);
        this.tamanhoEmMB = tamanhoEmMB;
    }

    public double getTamanhoEmMB() {
        return tamanhoEmMB;
    }
}