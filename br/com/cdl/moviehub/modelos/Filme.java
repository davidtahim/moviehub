package br.com.cdl.moviehub.modelos;
public class Filme {
    
    //declarando os atributos da classe
    private String nome;
    private int anoDeLancamento, totalEmMinutos, totalDeAvaliacoes;
    private double somaDasAvaliacoes,nota, pegaMedia;
    private boolean incluidoNoPlano;

    //criando as ações da classe

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Duração em minutos: " + totalEmMinutos);
    }

    public void avalia(double nota){

        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;

    }

    public double pegaMedia(){

        return somaDasAvaliacoes / totalDeAvaliacoes;

    }






}