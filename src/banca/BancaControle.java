package banca;

import java.util.ArrayList;
import java.util.List;

public class BancaControle {
    public static void main(String[] args) {
        // Criando uma lista polimórfica que aceita qualquer tipo de Produto da Banca
        List<Produto> estoqueBanca = new ArrayList<>();

        // Instanciando os objetos conforme modelado
        estoqueBanca.add(new EBook("Java Como Programar", 89.90, 15.4));
        estoqueBanca.add(new Minilivro("A Arte da Guerra (Edição de Bolso)", 15.00));
        estoqueBanca.add(new LivroFisico("Código Limpo", 120.00, 650.0));
        estoqueBanca.add(new Revista("Mundo Estranho", 245, 19.90));

        System.out.println("=== ESTOQUE INICIAL DA BANCA ===");
        for (Produto p : estoqueBanca) {
            // Polimorfismo em ação: getPreco() funciona de forma diferente para cada tipo de objeto
            System.out.printf("Produto: %s | Preço: R$ %.2f%n", p.getClass().getSimpleName(), p.getPreco());
        }

        System.out.println("\n=== APLICANDO DESCONTO DE 10% EM TODOS OS PRODUTOS ===");
        for (Produto p : estoqueBanca) {
            p.aplicarDesconto(10);
            System.out.printf("Novo Preço do %s: R$ %.2f%n", p.getClass().getSimpleName(), p.getPreco());
        }
    }
}