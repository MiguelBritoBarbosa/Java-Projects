import java.util.Scanner;

public class NumeroExtenso {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numero = entrada.nextLine();
        Caractere caracteres = new Caractere(numero);
        while (!caracteres.StringsIguais(caracteres.getStrings(), "")){
            caracteres.NumerosPorExtenso();
            caracteres.ImprimirNumerosExtenso();
            numero = entrada.nextLine();
            caracteres = new Caractere(numero);
        }


    }
}