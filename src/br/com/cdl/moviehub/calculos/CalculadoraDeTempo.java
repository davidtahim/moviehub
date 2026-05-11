package br.com.cdl.moviehub.calculos;

import br.com.cdl.moviehub.modelos.Filme;
import br.com.cdl.moviehub.modelos.Serie;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return tempoTotal;
    }

    //método para calcular o tempo de um filme
    public void inclui(Filme f) {
        this.tempoTotal += f.getTotalEmMinutos();
    }

    //método para calcular o tempo de uma série
    public void inclui(Serie s) {
        this.tempoTotal += s.getTemporadas() * s.getEpisodiosPorTemporada() * s.getMinutosPorEpisodio();
    }

}
