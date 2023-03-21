/* *******************************************************************
 * Colegio Técnico Antônio Teixeira Fernandes (Univap)
 * Curso Técnico em Informática - Data de Entrega: 20/03/2023
 * Autores do Projeto: Miguel Brito Barbiosa
 *                     Lucas de Oliveira Maia
 * Turma: 3FID  Disciplina: Programação - II
 * Avaliação parcial referente ao 1 - Bimestre
 * nome_arquivo.java
 * ******************************************************************/
public class Parte2 {

    public static void main(String[] args) {
        System.out.println("Entrada:");
        // pegando os dias dos testes
        int dias = Integer.parseInt(args[0]);
        System.out.printf("Quantos Dias: %d", dias);
        int i = 0;
        while(dias > 0){
            // número de grupos.
            int n = Integer.parseInt(args[i+1]);
            // número total de alunos.
            int y = Integer.parseInt(args[i+2]);
            // número de alunos em cada grupo.
            int x = 0;

            System.out.printf("\nQuantos Grupos: %d\n", n);
             System.out.printf("Total de Alunos: %d\n", y);

             System.out.printf("x = (%d - (", y);
            for (int cont = 0; cont < n; cont++){
                // pegado os números pares consecutivos de acordo com a quantidade de grupos `n`.
                x += cont*2 ;
                System.out.printf("%d", (cont*2));
                if(cont < n-1)
                    System.out.print(" + ");
            }

            System.out.printf(")) / %d\n", n);
            // descobrindo a quantidade de alunos em cada grupo
            x = (y - (x)) / n;
            System.out.println("\nSaída:");
            for (int cont = 0; cont < n; cont++){
                System.out.printf("%d", x);
                if(cont < n-1)
                    System.out.print(", ");
                x += 2;
            }
            // pulando de 2 em 2, pois a cada 2 argumentos eh um teste
            i += 2;
            dias--;
        }




    }

}
