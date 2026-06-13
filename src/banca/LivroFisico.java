package banca;

public class LivroFisico extends Livro {
    private double pesoGramas;

    public LivroFisico(String titulo, double preco, double pesoGramas) {
        super(titulo, preco);
        this.pesoGramas = pesoGramas;
    }

    public double getPesoGramas() {
        return pesoGramas;
    }
}