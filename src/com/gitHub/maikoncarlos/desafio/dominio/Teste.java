package com.gitHub.maikoncarlos.desafio.dominio;

import java.math.BigDecimal;
import java.util.Scanner;

public class Teste {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextBigDecimal(), scanner.nextInt());
        scanner.nextLine(); // Limpa o buffer do teclado
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextBigDecimal(), scanner.nextInt());

        //TODO: Considerando os objetos "livro1" e "livro2", calcule o valor total da compra.
        BigDecimal total = livro1.preco.multiply(BigDecimal.valueOf(livro1.quantidade))
                .add(livro2.preco.multiply(BigDecimal.valueOf(livro2.quantidade)));


        //TODO: Considerando os objetos "livro1" e "livro2", calcule o número de livros comprados.
        int quantidadeTotal = livro1.quantidade + livro2.quantidade;

        //TODO: Imprima as linhas necessárias conforme a saída deste desafio.
        System.out.println("Valor total da compra:" + total);
        System.out.println("Numero de livros comprados:" + quantidadeTotal);
        System.out.println("Obrigado por comprar na nossa livraria!");
    }

    static class Livro {
        String nome;
        BigDecimal preco;
        int quantidade;

        Livro(String nome, BigDecimal preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
    }
}
