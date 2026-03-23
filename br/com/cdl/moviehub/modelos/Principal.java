package br.com.cdl.moviehub.modelos;
public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
            filme1.setNome("O Poderoso Chefão");
            filme1.setAnoDeLancamento(1972);
            filme1.setTotalEmMinutos(175);

        filme1.exibeFichaTecnica();
        //Lançando as avaliações do filme
        filme1.avalia(8);
        filme1.avalia(9.5);
        filme1.avalia(10);

        //Exibindo as avaliacoes do filme

        System.out.println("Soma das avaliações: " + filme1.getSomaDasAvaliacoes());
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + filme1.pegaMedia());
    }

}
