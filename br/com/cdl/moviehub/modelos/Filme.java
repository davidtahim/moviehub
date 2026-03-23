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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTotalEmMinutos() {
        return totalEmMinutos;
    }

    public void setTotalEmMinutos(int totalEmMinutos) {
        this.totalEmMinutos = totalEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setTotalDeAvaliacoes(int totalDeAvaliacoes) {
        this.totalDeAvaliacoes = totalDeAvaliacoes;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getPegaMedia() {
        return pegaMedia;
    }

    public void setPegaMedia(double pegaMedia) {
        this.pegaMedia = pegaMedia;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }






}