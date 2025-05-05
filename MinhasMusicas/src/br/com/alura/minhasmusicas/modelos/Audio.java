package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulos;
    private int totalDeReproduoes;
    private int totalDeCurtidas;
    private int classificacao;

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public int getTotalDeReproduoes() {
        return totalDeReproduoes;
    }

    public int getTotalDeCurtidas() {
        return totalDeCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

   public void curte() {
        this.totalDeCurtidas++;
   }

   public void reproduz() {
        this.totalDeReproduoes++;
   }

}
