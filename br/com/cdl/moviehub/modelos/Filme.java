package br.com.cdl.moviehub.modelos;

public class Filme {

    // atributos privados (encapsulamento)
    private String nome;
    private int anoDeLancamento;
    private int totalEmMinutos;
    private int totalDeAvaliacoes;
    private double somaDasAvaliacoes;
    private boolean incluidoNoPlano;

    // ações
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + this.nome);
        System.out.println("Ano de lançamento: " + this.anoDeLancamento);
        System.out.println("Duração em minutos: " + this.totalEmMinutos);
    }

    public void avalia(double nota){
        this.somaDasAvaliacoes += nota;
        this.totalDeAvaliacoes++;
    }

    // método que calcula a média (permanece público)
    public double pegaMedia(){
        if (this.totalDeAvaliacoes == 0) return 0;
        return this.somaDasAvaliacoes / this.totalDeAvaliacoes;
    }

    // getters e setters públicos
    public String getNome() { return this.nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getAnoDeLancamento() { return this.anoDeLancamento; }
    public void setAnoDeLancamento(int ano) { if (ano > 1888) this.anoDeLancamento = ano; }

    public int getTotalEmMinutos() { return this.totalEmMinutos; }
    public void setTotalEmMinutos(int minutos) { if (minutos > 0) this.totalEmMinutos = minutos; }

    public int getTotalDeAvaliacoes() { return this.totalDeAvaliacoes; }
    // não expor setTotalDeAvaliacoes publicamente normalmente

    public double getSomaDasAvaliacoes() { return this.somaDasAvaliacoes; }

    public boolean isIncluidoNoPlano() { return this.incluidoNoPlano; }
    public void setIncluidoNoPlano(boolean incluido) { this.incluidoNoPlano = incluido; }

}
