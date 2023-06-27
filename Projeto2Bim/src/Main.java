import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Concurso concurso = new Concurso();

        while (true) {
            System.out.println("""
                    ( 1 ) - Incluir;
                    ( 2 ) - Consultar;
                    ( 3 ) - Alterar;
                    ( 4 ) - Excluir;
                    ( 5 ) - Relatar;
                    ( 6 ) - Sair""");
            int resp = Integer.parseInt(scan.nextLine());

            switch (resp){
                case (1):
                    concurso.IncluirCandidata();
                    break;
                case(2):
                    concurso.ConsultarCandidata();
                    break;

                case(3):
                    concurso.AlterarCandidata();
                    break;
                case(4):
                    concurso.ExcluirCandidata();
                    break;
                case(5):
                    concurso.Relatar();
                    break;
                case(6):
                    System.exit(1);
            }



        }





    }
}