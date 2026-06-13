package banca;

public interface Produto {
    double getPreco();
    void aplicarDesconto(double percentual);
}