package br.com.cdl.moviehub.modelos;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Filme filme1 = new Filme();

        System.out.print("Nome do filme: ");
        String nome = scanner.nextLine();
        filme1.setNome(nome);

        System.out.print("Ano de lançamento: ");
        int ano = scanner.nextInt();
        filme1.setAnoDeLancamento(ano);

        System.out.print("Duração em minutos: ");
        int minutos = scanner.nextInt();
        filme1.setTotalEmMinutos(minutos);

        System.out.print("Quantas avaliações você quer inserir? ");
        int qtd = scanner.nextInt();
        for (int i = 0; i < qtd; i++) {
            System.out.print("Avaliação #" + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            filme1.avalia(nota);
        }

        System.out.println();
        filme1.exibeFichaTecnica();
        System.out.println("Soma das avaliações: " + filme1.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + filme1.pegaMedia());

        scanner.close();
    }
}
