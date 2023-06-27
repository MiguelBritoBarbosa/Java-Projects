public class ArrayCandidatas {
    private int quantidadeCandidatas = 0;
    private Candidata[] candidatas = new Candidata[100];

    public int getQuantidadeCandidatas() {
        return quantidadeCandidatas;
    }

    public void setQuantidadeCandidatas(int quantidadeCandidatas) {
        this.quantidadeCandidatas = quantidadeCandidatas;
    }


    public Candidata[] getCandidatas() {
        return this.candidatas;
    }



    public int getCandidataIndex(int id) {
        for (int i=0; i < this.quantidadeCandidatas; i++){
            if (this.candidatas[i].getId() == id){
                return i;
            }
        }
        return 0;
    }

    public void setCandidata(Candidata candidata, int id){
        this.candidatas[id] = candidata;
    }


    public void     adicionaCandidata(Candidata candidata){
        this.candidatas[this.quantidadeCandidatas] = candidata;
        this.quantidadeCandidatas++;
    }

}
