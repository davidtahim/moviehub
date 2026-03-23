package br.com.cdl.moviehub.modelos;
public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
            filme1.nome = "O Poderoso Chefão";
            filme1.anoDeLancamento = 1972;
            filme1.totalEmMinutos = 175;

        filme1.exibeFichaTecnica();
        //Lançando as avaliações do filme
        filme1.avalia(8);
        filme1.avalia(9.5);
        filme1.avalia(10);

        //Exibindo as avaliacoes do filme

        System.out.println("Soma das avaliações: " + filme1.somaDasAvaliacoes);
        System.out.println("Total de avaliações: " + filme1.totalDeAvaliacoes);
        System.out.println("Média das avaliações: " + filme1.pegaMedia());
    }

}
