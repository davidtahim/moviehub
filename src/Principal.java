import java.util.Scanner;

import br.com.cdl.moviehub.calculos.CalculadoraDeTempo;
import br.com.cdl.moviehub.modelos.Filme;
import br.com.cdl.moviehub.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Informação dos filmes
        Filme filme1 = new Filme();
        System.out.println("Digite o nome do filme:");
        filme1.setNome(scanner.nextLine());
        System.out.println("Digite o nome do diretor do filme:");
        filme1.setDiretor(scanner.nextLine());
        System.out.println("Digite o ano de lançamento do filme:");
        filme1.setAnoDeLancamento(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a duração do filme em minutos:");
        filme1.setTotalEmMinutos(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de avaliações:");
        int qtd = Integer.parseInt(scanner.nextLine().trim());
        for (int i=0;i<qtd;i++){
            System.out.println("Digite a nota da avaliação " + (i+1) + ":");
            filme1.avalia(Double.parseDouble(scanner.nextLine().trim()));
        }
        // Informação das séries
        Serie serie1 = new Serie();
        System.out.println("Digite o nome da série:");
        serie1.setNome(scanner.nextLine());
        System.out.println("Digite o ano de lançamento da série:");
        serie1.setAnoDeLancamento(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de temporadas da série:");
        serie1.setTemporadas(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a quantidade de episódios por temporada:");
        serie1.setEpisodiosPorTemporada(Integer.parseInt(scanner.nextLine().trim()));
        System.out.println("Digite a duração de cada episódio em minutos:");
        serie1.setMinutosPorEpisodio(Integer.parseInt(scanner.nextLine().trim()));
        scanner.close();
        filme1.exibeFichaTecnica();
        serie1.exibeFichaTecnica();
        System.out.println("Soma das avaliações: " + filme1.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + filme1.pegaMedia());

        // Calculadora de tempo
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(serie1);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());


    }
}
