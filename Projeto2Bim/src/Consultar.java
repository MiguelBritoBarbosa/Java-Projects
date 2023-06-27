public class Consultar{

    public Candidata consultarDados(ArrayCandidatas candidatas, int id){
        int index = candidatas.getCandidataIndex(id);
        Candidata candidata = candidatas.getCandidatas()[index];
        System.out.println("\n"+ "Nome:" + candidata.getNome());
        System.out.println("Simpatia:" + candidata.getSimpatia());
        System.out.println("Elegancia:" + candidata.getElegancia());
        System.out.println("Beleza:" + candidata.getBeleza() + "\n");
        return candidata;
    }

    public void ConsultarTodos(ArrayCandidatas candidatas){
        System.out.printf("Candidatas: ");
        for (int i=0; i < candidatas.getQuantidadeCandidatas(); i++){
            Candidata candidata = candidatas.getCandidatas()[i];
            System.out.println("\n" + "Nome:" + candidata.getNome());
            System.out.println("Simpatia:" + candidata.getSimpatia());
            System.out.println("Elegancia:" + candidata.getElegancia());
            System.out.println("Beleza:" + candidata.getBeleza() + "\n");
        }

    }

}
