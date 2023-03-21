/* *******************************************************************
 * Colegio Técnico Antônio Teixeira Fernandes (Univap)
 * Curso Técnico em Informática - Data de Entrega: 20/03/2023
 * Autores do Projeto: Miguel Brito Barbiosa
 *                     Lucas de Oliveira Maia
 * Turma: 3FID  Disciplina: Programação - II
 * Avaliação parcial referente ao 1 - Bimestre
 * nome_arquivo.java
 * ******************************************************************/

public class Parte1 {
    public static void main(String[] args) {

        if (args.length >= 3){

            float motoristasMenor21 = 0;
            float motoristaMenor21Mulher = 0;
            float motoristasMulheres = 0;
            float motoristasHomens = 0;
            float motoristasCapital = 0;
            float motoristasInterior = 0;
            float motoristasOutroEstado = 0;
            float motoristasMaior60 = 0;
            float total = 0;
            for (int i = 0; i < args.length; i += 3){
                int idade = 2023 - Integer.parseInt(args[i]);

                int sexo = Integer.parseInt(args[i+1]);
                int procedencia = Integer.parseInt(args[i+2]);

                if (idade < 21)
                    motoristasMenor21++;
                if (idade < 21 && sexo == 2)
                    motoristaMenor21Mulher++;
                if (idade >60)
                    motoristasMaior60++;
                if (sexo == 2){
                    motoristasMulheres++;
                }
                else {
                    motoristasHomens++;
                }

                switch (procedencia){
                    case 0:
                        motoristasCapital++;
                        break;
                    case 1:
                        motoristasInterior++;
                        break;
                    case 2:
                        motoristasOutroEstado++;
                        break;
                    default:
                        System.out.println("Não informado!");
                }
                total++;
            }
            float motoristasMenor21Porcentagem = (motoristasMenor21 * 100) / total;

            float resto;
            float valor1 = total;
            float valor2 = motoristasHomens;
            while (valor2 != 0) {
                resto = valor1 % valor2;
                valor1 = valor2;
                valor2 = resto;
            }
            float totalHomens = total / valor1;
            float homensMedia = motoristasHomens / valor1;

            resto = 0;
            valor1 = total;
            valor2 = motoristasMulheres;
            while (valor2 != 0) {
                resto = valor1 % valor2;
                valor1 = valor2;
                valor2 = resto;
            }
            float totalMulheres  = total/valor1;
            float mulheresMedia = motoristasMulheres / valor1;

            float homensPorcentagem = (motoristasHomens * 100) / total;
            float mulheresPorcentagem = (motoristasMulheres * 100) / total;

            System.out.printf("A porcentagem de motoristas com menos de 21 anos é = %.2f%%\n", motoristasMenor21Porcentagem);
            System.out.printf("Das pessoas menores que 21 anos (%.2f), %.2f era(m) mulher(es)\n", motoristasMenor21, motoristaMenor21Mulher);
            System.out.printf("%.2f eram do interior\n", motoristasInterior);
            if (motoristasMaior60 >= 1){
                System.out.println("Sim, existem motoristas maiores que 60 anos.");
                System.out.printf("Do total de %.2f pessoa(s), %.2f era(m) maior de 60 anos\n", total, motoristasMaior60);
            }else
                System.out.println("Não, não houve pessoas com idade maior que 60 ");
            System.out.printf("A cada %.2f motoristas %.2f é homem\n", totalHomens, homensMedia);
            System.out.printf("A cada %.2f motoristas %.2f é mulher\n", totalMulheres, mulheresMedia);
            System.out.printf("%.2f%% das pessoa(s) era(m) mulher\n", mulheresPorcentagem);
            System.out.printf("%.2f%% das pessoa(s) era(m) Homem\n", homensPorcentagem);

        }
        else{
            System.out.println("Passe os parâmetros para o funcionamento do programa.");
        }
    }
}