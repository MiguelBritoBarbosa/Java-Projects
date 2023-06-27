import java.util.Scanner;

public class Incluir {

    public void adicionarCandidatas (ArrayCandidatas arrayCandidatas, int id, String nome, int simpatia, int elegancia, int beleza) {
        Candidata candidata = new Candidata(id, nome, simpatia, elegancia, beleza);
        arrayCandidatas.adicionaCandidata(candidata);
    }



}
