package br.com.alura.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulos() + " é considerado sucesso absoluto" +
                    " e preferido por todos");
        } else {
            System.out.println(audio.getTitulos() + " também é uma das preferidas que todo mundo está" +
                    " curtindo");
        }
    }
}
