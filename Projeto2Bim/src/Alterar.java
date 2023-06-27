import java.util.Scanner;

public class Alterar{

    Scanner entrada = new Scanner(System.in);

    public void alterarCandidata(ArrayCandidatas arrayCandidatas, int id){
        System.out.println("""
                    Escolha o campo que deseja alterar
                    ( 1 ) - Nome;
                    ( 2 ) - Simpatia;
                    ( 3 ) - Elegancia;
                    ( 4 ) - Beleza;
                    ( 5 ) - Todos;""");
        int dado =  Integer.parseInt(entrada.nextLine());
        switch (dado){
            case(1):
                System.out.println("Digite o Nome:");
                String nome = entrada.nextLine();
                int index = arrayCandidatas.getCandidataIndex(id);
                arrayCandidatas.getCandidatas()[index].setNome(nome);
                break;

            case(2):
                System.out.println("Digite a nota da Simpatia:");
                int simpatia = Integer.parseInt(entrada.nextLine());
                index = arrayCandidatas.getCandidataIndex(id);
                arrayCandidatas.getCandidatas()[index].setSimpatia(simpatia);
                arrayCandidatas.getCandidatas()[index].setNota();
                break;

            case(3):
                System.out.println("Digite a nota da Elegancia:");
                int elegancia = Integer.parseInt(entrada.nextLine());
                index = arrayCandidatas.getCandidataIndex(id);
                arrayCandidatas.getCandidatas()[index].setElegancia(elegancia);
                arrayCandidatas.getCandidatas()[index].setNota();
                break;

            case(4):
                System.out.println("Digite a nota da Beleza:");
                int beleza = Integer.parseInt(entrada.nextLine());
                index = arrayCandidatas.getCandidataIndex(id);
                arrayCandidatas.getCandidatas()[index].setBeleza(beleza);
                arrayCandidatas.getCandidatas()[index].setNota();
                break;

            case(5):
                System.out.println("Digite o Nome:");
                nome = entrada.nextLine();
                index = arrayCandidatas.getCandidataIndex(id);
                arrayCandidatas.getCandidatas()[index].setNome(nome);

                System.out.println("Digite a nota da Simpatia:");
                simpatia = Integer.parseInt(entrada.nextLine());
                arrayCandidatas.getCandidatas()[index].setSimpatia(simpatia);

                System.out.println("Digite a nota da Elegancia:");
                elegancia = Integer.parseInt(entrada.nextLine());
                arrayCandidatas.getCandidatas()[index].setElegancia(elegancia);

                System.out.println("Digite a nota da Beleza:");
                beleza = Integer.parseInt(entrada.nextLine());
                arrayCandidatas.getCandidatas()[index].setBeleza(beleza);
                arrayCandidatas.getCandidatas()[index].setNota();
                break;
        }
    }

}
