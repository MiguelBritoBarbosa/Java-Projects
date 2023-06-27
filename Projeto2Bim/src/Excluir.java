public class Excluir{


    public void exluirCandidata(ArrayCandidatas arrayCandidatas, int id){
        int index = arrayCandidatas.getCandidataIndex(id);
        String nome = arrayCandidatas.getCandidatas()[index].getNome();
        for (int i = index; i <= arrayCandidatas.getQuantidadeCandidatas(); i++){
            arrayCandidatas.setCandidata(arrayCandidatas.getCandidatas()[i+1], i);
        }
        arrayCandidatas.setQuantidadeCandidatas(arrayCandidatas.getQuantidadeCandidatas() -1);
        System.out.printf("Candidata %s Excluida com sucesso", nome);
    }

}
