/* *******************************************************************
 * Colegio Técnico Antônio Teixeira Fernandes (Univap)
 * Curso Técnico em Informática - Data de Entrega: DD/MM/2020
 * Autores do Projeto: Gustavo Pacheco Salazar Silva
 * Turma: 3F Disciplina: Programação - II
 * Avaliação parcial referente ao 2 - Bimestre
 * Observação: <colocar se houver>
 *
 * ExercicioEncapsulamentoHeranca.java
 * ******************************************************************/

import java.util.Scanner;

public class ExercicioEncapsulamentoHeranca {
    public static void main(String args[]){
        Veiculo[] carros = new Carro[100];
        int quantidadeCarro = 0;
        Veiculo[] motos = new Motocicleta[100];
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Deseja adicionar um carro ou motocicleta?(1)Sim | (0)Não");
            int resp = Integer.parseInt(scan.nextLine());;

            if (resp == 1){
                System.out.println("Carro -->:");
                scan = new Scanner(System.in);
                System.out.println("Digite a Marca:");
                String marca = scan.nextLine();
                System.out.println("Digite o Modelo:");
                String modelo = scan.nextLine();
                System.out.println("Digite o Ano:");
                int ano = Integer.parseInt(scan.nextLine());
                System.out.println("Digite o Número de portas:");
                int numPortas = Integer.parseInt(scan.nextLine());
                carros[quantidadeCarro] = new Carro(marca, modelo, ano, numPortas);
                quantidadeCarro++;
            }
            else{
                System.out.println("Moto -->");
                System.out.println("Digite a Marca:");
                String marca = scan.nextLine();
                System.out.println("Digite o Modelo:");
                String modelo = scan.nextLine();
                System.out.println("Digite o Ano:");
                int ano = Integer.parseInt(scan.nextLine());
                System.out.println("Possui Partida Eletrica? (1)Sim (0)Não:");
                int resp2 = Integer.parseInt(scan.nextLine());
                boolean possuiPartidaEletrica;
                possuiPartidaEletrica = resp2 == 1;
                Motocicleta motocicleta = new Motocicleta(marca, modelo, ano, possuiPartidaEletrica);
            }

            System.out.println("Deseja adicionar outro veiculo?1)Sim | (0)Não");
            resp = Integer.parseInt(scan.nextLine());;
            if(resp == 0){
                break;
            }
        }


    }
}